from flask import jsonify

STATUS = "status"
MESSAGE = "message"


def general_message(status_code, message):
    return jsonify({
        STATUS: status_code,
        MESSAGE: f'{message}'
    })


def message_username_taken():
    return jsonify({
        STATUS: 301,
        MESSAGE: "Username already taken"
    })


def message_invalid_credentials():
    return jsonify({
        STATUS: 302,
        MESSAGE: "Invalid user credentials"
    })


def message_not_enough_tokens():
    return jsonify({
        STATUS: 301,
        MESSAGE: "Not enough tokens"
    })
