def welcome_message():
    print()
    print('''#######################''')
    print('''#  Lars TODO'nt List  #''')
    print('''#######################''')


def main_menu():
    print('''1.\t See all Todos''')
    print('''2.\t Create new Todo''')
    print('''3.\t Update Todo''')
    print('''4.\t Delete Todo''')
    print()
    print('''0.\t Quit''')
    print('''Menu choice: ''')


def bye_message():
    print('Bye')


def invalid_input():
    print('Invalid input!')


def see_all_todos():
    print('Showing all todos')


def create_new_todo():
    print('New todo')
    print('Enter new Description')


def update_todo():
    print('Update todo')


def choose_todo():
    print('Choose Todo number to edit (0 to go back)')


def update_description_or_set_done():
    print('Update')
    print('1. Description')
    print('2. Set done')
    print('3. Set undone')
    print('0. Back')


def new_description():
    print('Enter new description')


def set_done():
    print('Marked as done')


def set_undone():
    print('Marked as undone')


def delete_todo():
    print('Delete todo')


def choose_todo_delete():
    print('Choose Todo number to delete (0 to go back)')


def deleted_todo_object(todo_object):
    print(f'{todo_object}, deleted')


def should_not_happen():
    print('Should not happen')


