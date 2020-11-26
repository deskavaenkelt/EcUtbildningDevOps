import bank_outputs as outputs
import bank_controller as controller

# Program start
account_balance = 0
outputs.print_welcome_message()
outputs.enter_pin()
pin = -1

while pin == -1:
    pin = controller.get_user_input_pin()

while True:
    outputs.main_menu()
    current_choice = input()

    if current_choice in '12345':
        if current_choice == '1':
            account_balance += controller.deposit()
            controller.check_balance(account_balance)
        elif current_choice == '2':
            account_balance -= controller.withdraw()
            controller.check_balance(account_balance)
        elif current_choice == '3':
            controller.check_balance(account_balance)
        elif current_choice == '4':
            account_balance = controller.collect_interest(account_balance)
        elif current_choice == '5':
            outputs.end_message()
            break
