# for i in range(1,13):
#     print("No. {:2} squared is {:3} and cubed is {:4}".format(i, i ** 2, i ** 3))
# print("*" * 80)
#
# for i in range(1,13):
#     print("No. {:2} squared is {:3} and cubed is {:4}".format(i, i ** 2, i ** 3))
#     print("*" * 80)

# name = input("Please enter your name: ")
name = "Grooth"
age = int(input("How old are you, {}? ".format(name)))

print()

# if age >= 18:
#     print("You are old enough to vote")
# else:
#     print("You are NOT old enough to vote")
#     print("Please come back in {} years to vote.".format(18 - age))
#
# print()

if age < 18:
    print("You are NOT old enough to vote")
    print("Please come back in {} years to vote.".format(18 - age))
elif age == 900:
    print("Yoda dies in Return of the Jedi")
else:
    print("You are old enough to vote")



