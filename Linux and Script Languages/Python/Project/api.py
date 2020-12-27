import requests

API_URL = 'https://sholiday.faboul.se/dagar/v2.1/'


def response():
    return requests.get(API_URL).json()