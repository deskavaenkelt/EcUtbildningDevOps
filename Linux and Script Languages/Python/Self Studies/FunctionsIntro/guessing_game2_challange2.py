import random


def get_integer(prompt):
    while True:
        temp = input(prompt)
        if temp.isnumeric():
            return int(temp)
        else:
            print('Invalid input')


min_value = 1
max_value = 10
answer = random.randint(min_value, max_value)

guess = -1
print('Enter "0" to end game early')
print("Guess a number between {} and {}: ".format(min_value, max_value))
while guess != answer:
    guess = get_integer(': ')

    if guess == 0:
        print("Quiting game")
        break

    if guess == answer:
        print("Correct guess")
    else:
        if guess < answer:
            print("Please guess higher")
        else:
            print("Please guess lower")
