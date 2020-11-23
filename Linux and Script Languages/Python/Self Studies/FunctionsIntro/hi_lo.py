LOW = 1
HIGH = 1000

print("Please think of a number between {} and {}".format(LOW, HIGH))
input("Press Enter to start")

guesses = 1

while LOW != HIGH:
    guess = LOW + (HIGH - LOW) // 2
    high_low = input("My guess is {}. Should I guess higher or lower. "
                     "Enter h, l or c if my answer was correct: "
                     .format(guess)).casefold()
    if high_low == "h":
        LOW = guess + 1
    elif high_low == "l":
        HIGH = guess - 1
    elif high_low == "c":
        print("I got it in {} guesses".format(guesses))
        break
    else:
        print("Please enter h, l or c")

    guesses += 1
else:
    print("You thought at the number {}".format(LOW))
    print("I guessed it in {} guesses".format(guesses))

