import view
import user_input
import todo_controller
import database


# TODO: Make in doc-string


def see_all_todos():
    view.see_all_todos()
    todo_controller.print_todos()


def what_to_update(index):
    index -= 1
    while True:
        view.update_description_or_set_done()
        chosen = user_input.return_int()
        if chosen == 1:
            todo_controller.set_new_description(index)
            break
        elif chosen == 2:
            todo_controller.set_todo_done(index)
            break
        elif chosen == 3:
            todo_controller.set_todo_undone(index)
            break
        elif chosen == 0:
            break
        else:
            view.invalid_input()


def update_todo():
    view.update_todo()
    todo_controller.print_todos()
    view.choose_todo()

    while True:
        chosen_todo = user_input.return_int()
        if 1 <= chosen_todo <= todo_controller.number_of_todos():
            what_to_update(chosen_todo)
            break
        elif chosen_todo == 0:
            break
        else:
            view.invalid_input()


def delete_todo():
    view.delete_todo()
    todo_controller.print_todos()
    view.choose_todo_delete()

    while True:
        chosen_todo = user_input.return_int()
        if 1 <= chosen_todo <= todo_controller.number_of_todos():
            todo_controller.delete_specific_todo(chosen_todo)
            break
        elif chosen_todo == 0:
            break
        else:
            view.invalid_input()


def sub_menus(choice):
    if choice in '1':
        see_all_todos()
    elif choice in '2':
        todo_controller.create_todo()
    elif choice in '3':
        update_todo()
    elif choice in '4':
        delete_todo()
    else:
        view.should_not_happen()


def menu_choice():
    choice = user_input.return_str()
    if choice in '1234':  # Not a bug, it's a feature
        sub_menus(choice)
    elif choice in '0':
        view.bye_message()
        return False
    else:
        view.invalid_input()

    return True


# todo_controller.developer_mode()
todo_controller.read_from_database()
run_program = True

while run_program:
    view.welcome_message()
    view.main_menu()
    run_program = menu_choice()


todo_controller.save_to_database()
