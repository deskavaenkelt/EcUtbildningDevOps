from flask import jsonify


def error_message(status_code):
    ret_json = {
        "Message": "An error happened",
        "Status Code": status_code
    }
    return jsonify(ret_json)


def success_message(message):
    ret_json = {
        "Message": message,
        "Status Code": 200
    }
    return jsonify(ret_json)
