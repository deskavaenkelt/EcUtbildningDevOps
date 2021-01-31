from flask import jsonify

STATUS_CODE = "status"
MESSAGE = "msg"
RATIO = "ratio"


def message_sign_up_successful():
    retJson = {
        STATUS_CODE: 200,
        MESSAGE: "You successfully signed up for the API"
    }
    return jsonify(retJson)


def message_username_fail():
    retJson = {
        STATUS_CODE: 301,
        MESSAGE: 'Invalid Username'
    }
    return jsonify(retJson)


def message_password_fail():
    retJson = {
        STATUS_CODE: 302,
        MESSAGE: "Incorrect Password"
    }
    return jsonify(retJson)


def message_not_enough_tokens():
    retJson = {
        STATUS_CODE: 303,
        MESSAGE: "You are out of tokens, please refill!"
    }
    return jsonify(retJson)


def message_similarity_result(ratio):
    retJson = {
        STATUS_CODE: 200,
        RATIO: ratio,
        MESSAGE: "Similarity score calculated successfully"
    }
    return jsonify(retJson)


def message_invalid_admin_password():
    retJson = {
        STATUS_CODE: 304,
        MESSAGE: "Invalid Admin Password"
    }
    return jsonify(retJson)


def message_refill_successful():
    retJson = {
        STATUS_CODE: 200,
        MESSAGE: "Refilled successfully"
    }
    return jsonify(retJson)
