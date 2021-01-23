from flask import Flask, request
from flask_restful import Api, Resource

from calculator import add, subtract, multiply, division

app = Flask(__name__)
api = Api(app)


class Add(Resource):
    def post(self):
        posted_data = request.get_json()
        return add(posted_data)


class Subtract(Resource):
    def post(self):
        return subtract(request.get_json())


class Multiply(Resource):
    def post(self):
        return multiply(request.get_json())


class Divide(Resource):
    def post(self):
        return division(request.get_json())


api.add_resource(Add, "/add")
api.add_resource(Subtract, "/subtract")
api.add_resource(Multiply, "/multiply")
api.add_resource(Divide, "/division")


@app.route('/')
def hello_world():
    return "Hello World!"


if __name__ == "__main__":
    app.run(debug=True)
