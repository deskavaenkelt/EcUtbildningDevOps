def fizz_buzz(number: int) -> str:
    """
        Play Fizz buzz

        :param number: The number to check.
        :return: 'fizz' if the number is divisible by 3.
            'buzz' if it's divisible by 5.
            'fizz buzz' if it's divisible by both 3 and 5.
            The number, as a string, otherwise.
    """
    if number % 3 == 0 and number % 5 == 0:
        return 'fizz buzz'
    elif number % 3 == 0:
        return 'fizz'
    elif number % 5 == 0:
        return 'buzz'
    else:
        return str(number)


for index in range(16):
    print(fizz_buzz(index))
