def print_welcome_message():
    print('Welcome to the bank of Myrtana')


def enter_pin():
    print('Enter your pin, 4 to 6 digits')


def invalid_input():
    print('Invalid input')


def invalid_pin():
    print('Invalid PIN')


def valid_pin():
    print('Valid PIN, welcome to old camp!')


main_menu_options = ('Deposit money', 'Withdraw money',
                     'Check Balance', 'Collect interest', 'END')


def main_menu():
    print('What do you want to do?')
    for index, value in enumerate(main_menu_options):
        print('{} \t {}'.format(index + 1, value))


def deposit():
    print('How much do you want to deposit?')


def withdraw():
    print('How much do you want to withdraw?')


def interest_message():
    print('How many years do you want to skip')


def interest_print_yearly(amount_array: []) -> None:
    for year, value in enumerate(amount_array):
        print('Year {}: \tTotal: {}'.format(year, value))


def interest_total(years: int, amount:float) -> None:
    print('You have skipped {} and your new balance is {}'
          .format(years, amount))


def end_message():
    print('Bye')



