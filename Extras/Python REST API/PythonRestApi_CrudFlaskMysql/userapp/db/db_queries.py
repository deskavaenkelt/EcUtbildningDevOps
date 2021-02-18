from flask import jsonify

from db_config import mysql
from userapp.helpers import generate_hashed_password
from userapp.messages import user_added_successfully, not_found
from userapp.users import User


def general_db_connection(sql, data):
    conn = mysql.connect()
    cursor = conn.cursor()
    try:
        cursor.execute(sql, data)
        conn.commit()

        return True

    except Exception as e:
        print(e)
        return False
    finally:
        cursor.close()
        conn.close()


def all_user_details_are_valid(user: User, _method: str) -> bool:
    return user.name and \
           user.email and \
           user.password \
           and user.location_id \
           and _method == 'POST'


def add_user_to_db(user: User, _method):
    if all_user_details_are_valid(user, _method):
        _hashed_password = generate_hashed_password(user.password)

        sql = "INSERT INTO users(name, email, password, location_id) VALUES(%s, %s, %s, %s)"
        data = (user.name, user.email, _hashed_password, user.location_id)

        if general_db_connection(sql, data):
            return user_added_successfully()
        else:
            return not_found()
    else:
        return not_found()


def location_name_to_id(location_name: str) -> int:
    sql = "SELECT id FROM location WHERE address = %s"
    data = location_name

    conn = mysql.connect()
    cursor = conn.cursor()
    try:
        cursor.execute(sql, data)
        row = cursor.fetchone()
        resp = jsonify(row)

        return resp

    except Exception as e:
        print(e)
    finally:
        cursor.close()
        conn.close()
