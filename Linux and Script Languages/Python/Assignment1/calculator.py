def calculator_sum(x: float, y: float) -> float:
    return x + y


def calculator_diff(x: float, y: float) -> float:
    return x - y


def calculator_multi(x: float, y: float) -> float:
    return x * y


def calculator_div(x: float, y: float) -> float:
    return x / y


def print_result_function(number):
    print(number)
    if 1 < number < 50:
        print('Less than fifty')
    elif number == 50:
        print('Fifty')
    elif 50 < number < 100:
        print('Almost a  hundred')
    elif number == 100:
        print('Spot on')
    elif number > 100:
        print('Missed the spot!')
    else:
        print('Negative number')


print_result_function(calculator_sum(3, 5))
print_result_function(calculator_multi(10, 5))
print_result_function(calculator_diff(150, 75))
print_result_function(calculator_div(300, 3))
print_result_function(calculator_multi(35, 5))
print_result_function(calculator_multi(35, -5))
