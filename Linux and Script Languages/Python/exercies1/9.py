from collections import Counter

# 9. Skriv ett Python-program för att hitta de upprepade objekten
#    i en tupel.

tuple = ('g', 'e', 'e', 'k', 's')

print('Original list = {}'.format(tuple))

# Get duplicate tuples from list
# Using list comprehension + Counter() + items()
result = [ele for ele, count in Counter(tuple).items() if count > 1]

print(result)
