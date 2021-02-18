from flask import Flask, jsonify, request
from flask_restful import Api, Resource
import numpy
import tensorflow as tf
import requests
import subprocess
import json

from encryption import generate_hashed_password, verify_password
# TODO: Remove mongodb
from mongodb import users

app = Flask(__name__)
api = Api(app)


def user_exist(username):
    if users.find({"Username": username}).count() == 0:
        return False
    else:
        return True


class Register(Resource):
    def post(self):
        # Step 1 is to get posted data by the user
        posted_data = request.get_json()

        # Get the data
        username = posted_data["username"]
        password = posted_data["password"]  # "123xyz"

        if user_exist(username):
            retJson = {
                'status': 301,
                'msg': 'Invalid Username'
            }
            return jsonify(retJson)

        hashed_pw = generate_hashed_password(password)

        # Store username and pw into the database
        users.insert({
            "Username": username,
            "Password": hashed_pw,
            "Tokens": 10
        })

        retJson = {
            "status": 200,
            "msg": "You successfully signed up for the API"
        }
        return jsonify(retJson)


def verify_pw(username, password):
    if not user_exist(username):
        return False

    if verify_password(username, password):
        return True
    else:
        return False


def generate_return_dictionary(status, msg):
    ret_json = {
        "status": status,
        "msg": msg
    }
    return ret_json


def verify_credentials(username, password):
    if not user_exist(username):
        return generate_return_dictionary(301, "Invalid Username"), True

    correct_pw = verify_pw(username, password)

    if not correct_pw:
        return generate_return_dictionary(302, "Incorrect Password"), True

    return None, False


class Classify(Resource):
    def post(self):
        postedData = request.get_json()

        username = postedData["username"]
        password = postedData["password"]
        url = postedData["url"]

        retJson, error = verify_credentials(username, password)
        if error:
            return jsonify(retJson)

        tokens = users.find({
            "Username": username
        })[0]["Tokens"]

        if tokens <= 0:
            return jsonify(generate_return_dictionary(303, "Not Enough Tokens"))

        r = requests.get(url)
        retJson = {}
        with open('temp.jpg', 'wb') as f:
            f.write(r.content)
            proc = subprocess.Popen('python classify_image.py --model_dir=. --image_file=./temp.jpg',
                                    stdout=subprocess.PIPE, stderr=subprocess.STDOUT, shell=True)
            ret = proc.communicate()[0]
            proc.wait()
            with open("text.txt") as f:
                retJson = json.load(f)

        users.update({
            "Username": username
        }, {
            "$set": {
                "Tokens": tokens - 1
            }
        })

        return retJson


class Refill(Resource):
    def post(self):
        postedData = request.get_json()

        username = postedData["username"]
        password = postedData["admin_pw"]
        amount = postedData["amount"]

        if not user_exist(username):
            return jsonify(generate_return_dictionary(301, "Invalid Username"))

        correct_pw = "abc123"
        if not password == correct_pw:
            return jsonify(generate_return_dictionary(302, "Incorrect Password"))

        users.update({
            "Username": username
        }, {
            "$set": {
                "Tokens": amount
            }
        })
        return jsonify(generate_return_dictionary(200, "Refilled"))


api.add_resource(Register, '/register')
api.add_resource(Classify, '/classify')
api.add_resource(Refill, '/refill')

if __name__ == "__main__":
    app.run(host='0.0.0.0')
