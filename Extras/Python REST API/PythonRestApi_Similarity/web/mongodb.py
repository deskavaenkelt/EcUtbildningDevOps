from pymongo import MongoClient

client = MongoClient("mongodb://db:27017")
db = client.SimilarityDB
users = db["Users"]


def does_user_exists(username):
    if users.find({"Username": username}).count() == 0:
        return False
    else:
        return True


def store_user_in_db(username, hashed_password):
    users.insert({
        "Username": username,
        "Password": hashed_password,
        "Tokens": 6
    })


def get_hashed_password(username):
    hashed_password = users.find({
        "Username": username
    })[0]["Password"]

    return hashed_password


def count_tokens(username):
    tokens = users.find({
        "Username": username
    })[0]["Tokens"]
    return tokens


def withdraw_token_from_user(username):
    current_tokens = count_tokens(username)
    users.update({
        "Username": username
    }, {
        "$set": {
            "Tokens": current_tokens - 1
        }
    })


def refill_tokens(username, refill_amount):
    users.update({
        "Username": username
    }, {
        "$set": {
            "Tokens": refill_amount
        }
    })
