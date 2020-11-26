import bank_outputs as outputs
import math


def get_int_from_user() -> int:
    try:
        return int(input())
    except Exception:
        outputs.invalid_input()
        return -1


def get_length_of_pin(number: int) -> int:
    return int(math.log10(number)) + 1


def valid_pin_length(user_input: int) -> int:
    number_length = get_length_of_pin(user_input)
    if 4 <= number_length <= 6:
        return user_input
    else:
        outputs.invalid_pin()
        return -1


def get_user_input_pin() -> int:
    """ Return only pin in valid range """
    user_input = -1
    while user_input == -1:
        user_input = get_int_from_user()
        user_input = valid_pin_length(user_input)
    return user_input


def get_float_from_user() -> float:
    try:
        return float(input())
    except Exception:
        outputs.invalid_input()
        return -1.0


def get_float() -> float:
    """ Return only score in valid range """
    user_input = -1.0
    while user_input == -1.0:
        user_input = get_float_from_user()
    return user_input


def check_balance(balance: float):
    print('Current balance is {}'.format(balance))


def deposit():
    outputs.deposit()
    return get_float()


def withdraw():
    outputs.withdraw()
    return get_float()


def multiple(amount: float) -> int:
    if amount <= 1000:
        return 2
    elif amount <= 5000:
        return 3
    elif amount <= 10000:
        return 4
    else:
        return 5


def collect_interest(balance):
    yearly_amount = []
    outputs.interest_message()
    years = get_int_from_user()
    yearly_amount.append(balance)

    if years < 1:
        outputs.invalid_input()
    else:
        for year in range(1, years + 1):
            multiple_to_use = multiple(balance)
            balance *= multiple_to_use
            yearly_amount.append(balance)
        outputs.interest_print_yearly(yearly_amount)
        outputs.interest_total(years, balance)
        return balance
