from view import invalid_input


def return_int() -> int:
    while True:
        try:
            int_input = int(input('> '))
            return int_input
        except Exception:
            invalid_input()


def return_str() -> str:
    return input('> ')
