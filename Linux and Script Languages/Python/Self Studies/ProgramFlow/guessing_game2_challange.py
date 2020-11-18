import random

min_value = 1
max_value = 10
answer = random.randint(min_value, max_value)

guess = -1
print('Enter "quit" to end game early')
while guess != answer:
    try:
        guess = int(input("Guess a number between {} and {}: ".format(min_value, max_value)))
    except:
        print("An exception occurred")

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
