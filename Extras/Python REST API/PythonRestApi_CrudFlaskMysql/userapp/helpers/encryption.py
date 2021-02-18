import bcrypt


def get_hashed_password(username) -> bytes:
    """
    Takes the username and returns the hashed password

    :param username:
    :return: Hashed password
    """
    hashed_password = users.find({
        USERNAME: username
    })[0][PASSWORD]

    return hashed_password


def generate_hashed_password(password):
    return bcrypt.hashpw(password.encode('utf8'), bcrypt.gensalt())


def verify_password(username, password):
    hashed_pw = get_hashed_password(username)

    if bcrypt.hashpw(password.encode('utf8'), hashed_pw) == hashed_pw:
        return True
    else:
        return False
