for i in range(1, 16):
    print("No. {0} squared is {1} and cubed is {2}".format(i, i ** 2, i ** 3))
print()

# Right Aligned
for i in range(1, 16):
    print("No. {0:2} squared is {1:3} and cubed is {2:4}".format(i, i ** 2, i ** 3))
print()

# Left Aligned
for i in range(1, 16):
    print("No. {0:<2} squared is {1:<3} and cubed is {2:<4}".format(i, i ** 2, i ** 3))
print()

# Center Aligned
for i in range(1, 16):
    print("No. {0:^2} squared is {1:^3} and cubed is {2:^4}".format(i, i ** 2, i ** 3))
print()

pi = 22/7
print("Pi is approximately {0:12}".format(pi))
print("Pi is approximately {0:12f}".format(pi))
print("Pi is approximately {0:12.50f}".format(pi))  # f = field Width
print("Pi is approximately {0:52.50f}".format(pi))  # {0:52.50f} 0 = pi, 52 = field length, 50f = 50 decimals
print("Pi is approximately {0:62.50f}".format(pi))
print("Pi is approximately {0:72.50f}".format(pi))
print()

# More formatting
for i in range(1, 16):
    print("No. {:^2} squared is {:^3} and cubed is {:^4}".format(i, i ** 2, i ** 3))
print()


