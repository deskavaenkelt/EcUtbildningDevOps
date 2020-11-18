answer = 5

guess = int(input("Guess a number between 1 and 10: "))

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


# if guess != answer:
#     if guess < answer:
#         print("Please guess higher")
#     else:
#         print("Pleas guess lower")
#     guess = int(input("New guess: "))
#     if guess == answer:
#         print("Well done, correct guess")
#     else:
#         print("Wrong again")
# else:
#     print("Correct guess on first try")


# if guess < 1 or 10 < guess:
#     print("Out of range")
# elif guess < answer:
#     print("Guess higher")
#     guess = int(input("Try again: "))
#     if guess == answer:
#         print("Well done, you guessed it")
#     else:
#         print("Sorry, that wasn't right either")
# elif guess > answer:
#     print("Guess lower")
#     guess = int(input("Try again: "))
#     if guess == answer:
#         print("Well done, you guessed it")
#     else:
#         print("Sorry, that wasn't right either")
# else:
#     print("You got it on first try")
