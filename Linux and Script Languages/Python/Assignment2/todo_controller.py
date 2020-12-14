import view
from todo import ToDo
import time
import user_input
import database

todo_list = []


def save_to_database():
    database.clear_database()
    database.write_to_database(todo_list)


def read_from_database():
    result_from_file_read = database.read_from_database()
    for single_todo in result_from_file_read:
        todo_list.append(single_todo)


def developer_mode():
    todo_list.append(ToDo('Todo1', time.localtime()))
    todo_list.append(ToDo('Todo2', time.localtime()))
    todo_list.append(ToDo('Todo3', time.localtime()))


def number_of_todos() -> int:
    return len(todo_list)


def time_to_formatted_string(time_format):
    year = time_format[0]
    month = time_format[1]
    day = time_format[2]
    hour = time_format[3]
    my_min = time_format[4]

    return f'{year}-{month}-{day} {hour}:{my_min}'


def print_todos():
    for index in range(len(todo_list)):
        todo = todo_list[index]
        time_created = time_to_formatted_string(todo.time_created)

        if todo.time_updated == 0:
            time_updated = 'Not updated, '
        else:
            time_updated = time_to_formatted_string(todo.time_updated)

        if todo.time_done == 0:
            time_done = 'Not done'
        else:
            time_done = time_to_formatted_string(todo.time_done)

        print(f'{index + 1}\t{todo.description}\t{time_created}'
              f'\t{time_updated}\t{time_done}')


def create_todo():
    view.create_new_todo()
    new_description = user_input.return_str()
    new_todo = ToDo(new_description, time.localtime())
    todo_list.append(new_todo)


def set_new_description(index):
    view.new_description()
    todo_list[index].description = user_input.return_str()
    todo_list[index].time_updated = time.localtime()


def set_todo_done(index):
    view.set_done()
    todo_list[index].time_done = time.localtime()


def set_todo_undone(index):
    view.set_undone()
    todo_list[index].time_done = 0


def delete_specific_todo(index):
    index -= 1
    todo_object = todo_list[index]
    todo_list.remove(todo_object)
    view.deleted_todo_object(todo_object.description)
