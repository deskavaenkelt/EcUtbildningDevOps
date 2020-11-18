def menu():
    print("Please choose your option from the list below")
    print("1.\tLearn Python")
    print("2.\tLearn Java")
    print("3.\tGo swimming")
    print("4.\tHave dinner")
    print("5.\tGo to bed")
    print("0.\tExit")


choice = "-"
while choice != "0":
    menu()
    choice = input()

    if choice in "123456":
        print("You chose {}".format(choice))
    print()
