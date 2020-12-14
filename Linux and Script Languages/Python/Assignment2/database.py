import shelve

KEY = 'todos'


def write_to_database(todo_list):
    with shelve.open('todo_database') as database:
        database['todos'] = todo_list


def read_from_database():
    with shelve.open('todo_database') as database:
        return database['todos']


def clear_database():
    with shelve.open('todo_database') as database:
        database.clear()


def what_is_there():
    with shelve.open('todo_database') as database:
        print(database['todos'][0].description)
