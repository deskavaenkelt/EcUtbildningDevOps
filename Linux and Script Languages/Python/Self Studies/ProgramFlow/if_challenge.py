name = input("Pleas enter your name: ")
age = int(input("How old are you? "))

if 18 <= age <= 30:
    print("Welcome {}, to club 18-30 holidays".format(name))
else:
    print("Holidays ar only open for cool people")
