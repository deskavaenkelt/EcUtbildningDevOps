def addition(x: int, y: int) -> int:
    return x + y


def subtraction(x: int, y: int) -> int:
    return x - y


def multiplication(x: int, y: int) -> int:
    return x * y


def denominator_is_zero(variable: int) -> bool:
    if variable == 0:
        return True
    else:
        return False


def division(x: int, y: int) -> float:
    if denominator_is_zero(y):
        return 0
    else:
        return x / y
