def factorial(number: int) -> None:
    result = 0
    for index in range(number + 1):
        if index == 0:
            result = 1
            print(index, result)
        else:
            result *= index
            print(index, result)


factorial(35)
