import random

min_value = 1
max_value = 10
answer = random.randint(min_value, max_value)

guess = int(input("Guess a number between {} and {}: ".format(min_value, max_value)))

if guess == answer:
    print("Correct guess on first try")
else:
    if guess < answer:
        print("Please guess higher")
    else:
        print("Pleas guess lower")
    guess = int(input("New guess: "))
    if guess == answer:
        print("Well done, correct guess")
    else:
        print("Wrong again")

