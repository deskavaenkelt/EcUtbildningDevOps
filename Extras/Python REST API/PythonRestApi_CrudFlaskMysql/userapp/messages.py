from flask import jsonify, request


def user_added_successfully():
    resp = jsonify('User added successfully!')
    resp.status_code = 200
    return resp


def not_found(error=None):
    message = {
        'status': 404,
        'message': 'Not Found: ' + request.url,
    }
    resp = jsonify(message)
    resp.status_code = 404
    return resp
