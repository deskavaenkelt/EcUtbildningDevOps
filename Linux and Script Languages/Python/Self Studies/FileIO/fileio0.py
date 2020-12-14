jabber = open('sample.txt', 'r')

for line in jabber:
    print(line, end='')  # end='' removes line brake from file

jabber.close()
