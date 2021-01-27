from flask import Flask, request, render_template
from flask_restful import Api, Resource

from user_controller import register_new_user, store_new_sentence, test

app = Flask(__name__)
api = Api(app)


class Register(Resource):
    def post(self):
        return register_new_user(request.get_json())


class Store(Resource):
    def post(self):
        # return store_new_sentence(request.get_json())
        return test(request.get_json())


api.add_resource(Register, '/register')
api.add_resource(Store, '/store')


@app.route('/')
def index():
    return render_template("index.html")


if __name__ == "__main__":
    app.run(host='0.0.0.0', port='80')
