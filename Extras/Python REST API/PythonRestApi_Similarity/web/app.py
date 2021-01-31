import spacy
from flask import Flask, request, render_template
from flask_restful import Api, Resource

from hash_generator import generate_hashed_password, verify_password
from messages import message_sign_up_successful, message_username_fail, message_password_fail, \
    message_not_enough_tokens, message_similarity_result, message_invalid_admin_password, message_refill_successful
from mongodb import does_user_exists, store_user_in_db, count_tokens, withdraw_token_from_user, \
    refill_tokens

USERNAME = "username"
PASSWORD = "password"

app = Flask(__name__)
api = Api(app)


class Register(Resource):
    def post(self):
        # Step 1 is to get posted data by the user
        postedData = request.get_json()

        # Get the data
        username = postedData[USERNAME]
        password = postedData[PASSWORD]  # "123xyz"

        if does_user_exists(username):
            return message_username_fail()

        hashed_password = generate_hashed_password(password)

        # Store username and pw into the database
        store_user_in_db(username, hashed_password)

        return message_sign_up_successful()


def verify_pw(username, password):
    if not does_user_exists(username):
        return False

    return verify_password(username, password)


class Detect(Resource):
    def post(self):
        # Step 1 get the posted data
        postedData = request.get_json()

        # Step 2 is to read the data
        username = postedData[USERNAME]
        password = postedData[PASSWORD]
        text1 = postedData["text1"]
        text2 = postedData["text2"]

        if not does_user_exists(username):
            return message_username_fail()
        # Step 3 verify the username pw match
        correct_pw = verify_pw(username, password)

        if not correct_pw:
            return message_password_fail()
        # Step 4 Verify user has enough tokens
        num_tokens = count_tokens(username)
        if num_tokens <= 0:
            return message_not_enough_tokens()

        # Calculate edit distance between text1, text2
        nlp = spacy.load('en_core_web_sm')
        text1 = nlp(text1)
        text2 = nlp(text2)

        ratio = text1.similarity(text2)

        # Take away 1 token from user
        withdraw_token_from_user(username)

        return message_similarity_result(ratio)


class Refill(Resource):
    def put(self):
        postedData = request.get_json()

        username = postedData[USERNAME]
        password = postedData["admin_pw"]
        refill_amount = postedData["refill"]

        if not does_user_exists(username):
            return message_username_fail()

        correct_pw = "abc123"
        if not password == correct_pw:
            return message_invalid_admin_password()

        # MAKE THE USER PAY!
        refill_tokens(username, refill_amount)

        return message_refill_successful()


api.add_resource(Register, '/register')
api.add_resource(Detect, '/detect')
api.add_resource(Refill, '/refill')


@app.route('/')
def index():
    return render_template("index.html")


if __name__ == "__main__":
    app.run(host='0.0.0.0', port='80')
