from typing import Tuple

from db import add_user_to_db
from models import User
from userapp.db import location_name_to_id


def data_to_register(data: any) -> Tuple[User, str]:
    _json = data.json
    _name = _json['name']
    _email = _json['email']
    _password = _json['pwd']
    _location_name = _json['address']
    _method = data.method

    _location_id = location_name_to_id(_location_name)

    return User(_name, _email, _password, _location_id), _method


def add_user(received_data):
    user, _method = data_to_register(received_data)
    return add_user_to_db(user, _method)
