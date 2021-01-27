import bcrypt
from flask import jsonify, request

from mongo import users
from encryption import hash_password
from return_messages import general_message, message_invalid_credentials, message_not_enough_tokens, \
    message_username_taken

USERNAME = "Username"
PASSWORD = "Password"
SENTENCE = "Sentence"
TOKENS = "Tokens"

RECEIVED_USERNAME = "username"
RECEIVED_PASSWORD = "password"
RECEIVED_SENTENCE = "sentence"

MONGODB_SET = "$set"


def store_user_in_db(username, hashed_pw):
    users.insert({
        USERNAME: username,
        PASSWORD: hashed_pw,
        SENTENCE: "",
        TOKENS: 6
    })


def message_successful_signup():
    status_code = 200
    message = "You successfully signed up"
    return general_message(status_code, message)


def username_is_taken(username) -> bool:
    username_taken = users.find({
        USERNAME: username
    })[0]

    if username_taken:
        return True
    else:
        return False


def register_new_user(posted_data):
    username = posted_data[RECEIVED_USERNAME]
    password = posted_data[RECEIVED_PASSWORD]

    # if username_is_taken(username):
    #     return message_username_taken()
    hashed_password = hash_password(password)
    store_user_in_db(username, hashed_password)
    # return message_successful_signup()
    return general_message(200, hashed_password)


def password_match(stored_password, password) -> bool:
    return stored_password == hash_password(password)


def verify_user(username, password) -> bool:
    stored_password = users.find({
        USERNAME: username
    })[0][PASSWORD]

    hashed_password = hash_password(password)
    if stored_password == hashed_password:
        return True
    else:
        return False
    # return password_match(stored_password, password)


def count_tokens(username) -> int:
    tokens = users.find({
        USERNAME: username
    })[0][TOKENS]

    return tokens


def update_sentence(username, sentence, new_token):
    users.update({
        USERNAME: username,
    }, {
        MONGODB_SET: {
            SENTENCE: sentence,
            TOKENS: new_token
        }
    })


def store_new_sentence(posted_data):
    username = posted_data[RECEIVED_USERNAME]
    password = posted_data[RECEIVED_PASSWORD]
    sentence = posted_data[RECEIVED_SENTENCE]

    correct_password = verify_user(username, password)
    if not correct_password:
        return message_invalid_credentials()

    enough_tokens = count_tokens(username)
    if enough_tokens <= 0:
        return message_not_enough_tokens()

    update_sentence(username, sentence, enough_tokens - 1)

    status_code = 200
    message = "Sentence stored successfully"
    return general_message(status_code, message)

# Lecture


def verifyPw(username, password):
    hashed_pw = users.find({
        "Username":username
    })[0]["Password"]

    if bcrypt.hashpw(password.encode('utf8'), hashed_pw) == hashed_pw:
        return True
    else:
        return False


def countTokens(username):
    tokens = users.find({
        "Username":username
    })[0]["Tokens"]
    return tokens


def test(postedData):

    # Step 2 is to read the data
    username = postedData["username"]
    password = postedData["password"]
    sentence = postedData["sentence"]

    # Step 3 verify the username pw match
    correct_pw = verifyPw(username, password)

    if not correct_pw:
        retJson = {
            "status": 302
        }
        return jsonify(retJson)
    # Step 4 Verify user has enough tokens
    num_tokens = countTokens(username)
    if num_tokens <= 0:
        retJson = {
            "status": 301
        }
        return jsonify(retJson)

    # Step 5 store the sentence, take one token away  and return 200OK
    users.update({
        "Username": username
    }, {
        "$set": {
            "Sentence": sentence,
            "Tokens": num_tokens - 1
        }
    })

    retJson = {
        "status": 200,
        "msg": "Sentence saved successfully"
    }
    return jsonify(retJson)
