numbers = (1, 2, 3, 4, 5)


# print(numbers, sep=';')
# print(*numbers, sep=';')
# print(1, 2, 3, 4, 5, sep=';')


def test_stars(*args):
    print(args)
    for x in args:
        print(x)


test_stars(0, 1, 2, 3, 4, 5)

print()

test_stars()

