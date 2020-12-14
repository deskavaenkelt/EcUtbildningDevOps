try:
    jabber = open('sample.txt', 'r')

    for line in jabber:
        if 'jabberwock' in line.lower():
            print(line, end='')     # end='' removes line brake from file

    jabber.close()
except Exception:
    print('Something went wrong while open file')

