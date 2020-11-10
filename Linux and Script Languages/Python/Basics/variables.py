age = 25
pi = 22/7
name1 = "Lars"
name2 = 'Michaela'

print(age)
print(type(age))
print(pi)
print(type(pi))
print(name1)
print(type(name1))
print(name2)
print(type(name2))

print(name1 + ", " + name2)
print(name2 + ", " + str(age))

print(name2 + " är {0} år {1}.".format(age, "gammal"))
print(name2 + " är {1} år {0}.".format(age, "gammal"))
print(name2 + " är {} år {}.".format(age, "gammal"))

print("Pi is approximately {0}".format(pi))
print("Pi is approximately {}".format(pi))

print("Pi is approximately {0}".format(pi))
print("Pi is approximately {0:12}".format(pi))
print("Pi is approximately {0:11}".format(pi))
print("Pi is approximately {0:52.50f}".format(pi))
print("Pi is approximately {0:52.150f}".format(pi))
print()

for i in range(0, 2):
    print(i)
    print(i ** 2)
    print(i ** 3)

    print("in loop")

print("after loop")
print()

a = 12
b = 3
print(a + b)
print(type(a + b))
print(a - b)
print(a * b)
print(a / b)
print(type(a / b))
print(a // b)
print(type(a // b))

print("Modulus")
print(12 % 3)
print(12 % 4)
print(12 % 5)
print(14 % 5)
print()

#        0123456789
name2 = 'Michaela'
names = ['Michaela', 'Lars', 'Något']
print(names[0])
print(names[1])
print(names[2])
print(names[-3])

print(name2)
print(name2[0])
print(name2[1])
print(name2[7])
print(name2[-1])
print(name2[-2])
print(name2[-2])

print(name2[0:2])
print(name2[2:4])
print(name2[:4])
print(name2[4:])

print(name2[0:9:1])
print(name2[0:9:2])

print(name2[9:0:-1])
print(name2[9::-1])
print()

splitString = '1\n2\n3\n4\n5\n6'
print(splitString)
print('1')
print(2)

tabbed_string = '1\t\t2\t3\t4\t5\t6'
print(tabbed_string)

# name = input("Enter name: ")
age = 25
# print("Hej " + name)
print("Ålder " + str(age))
print("Ålder {}".format(age))
print("Ålder {age}")
print(f"Ålder {age}")


