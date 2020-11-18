age = 24
print("My age is " + str(age) + " years")
print("My age is {0} years".format(age))
print("My age is {} years".format(age))

print("There are {0} days in {1}, {2}, {3}, {4}, {5}, {6}, {7}"
      .format(31, "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec"))

print("There are {} days in {}, {}, {}, {}, {}, {}, {}"
      .format(31, "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec"))

months = ["Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec"]
print("There are {} days in {}, {}, {}, {}, {}, {}, {}"
      .format(31, months[0], months[1], months[2], months[3], months[4], months[5], months[6]))

print(
    "Jan: {2}, Feb: {0}, Mar: {2}, Apr: {1}, May: {2}, Jun: {1},\ Jul: {2}, Aug: {2}, Sep: {1}, Oct: {2}, Nov: {1}, Dec: {2}"
    .format(28, 30, 31))


print()

print("""
Jan: {2}
Feb: {0}
Mar: {2}
Apr: {1}
May: {2}
Jun: {1}
Jul: {2}
Aug: {2}
Sep: {1}
Oct: {2}
Nov: {1}
Dec: {2}
""".format(28, 30, 31))

