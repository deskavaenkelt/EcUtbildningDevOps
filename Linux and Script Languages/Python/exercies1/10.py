# 10. Skriv ett Python-program för att kontrollera om ett element
# finns i en tupel.

tuple = ('g', 'e', 'e', 'k', 's')
search_for = 'e'

for index in tuple:
    if index == search_for:
        print('Found {} in tuple'.format(search_for))
    # else:
    #     print("Didn't found {} in tuple".format(search_for))
