import shelve

with shelve.open('ShelfTest') as fruit:
    fruit['orange'] = 'a sweet orange, citrus fruit'
    fruit['apple'] = 'god for making cider'
    fruit['lemon'] = 'a sour, yellow citrus fruit'
    fruit['grape'] = 'a small, sweet fruit growing in bunches'
    fruit['lime'] = 'a sour, green citrus fruit'

# with shelve.open('ShelfTest') as fruit:
#     fruit = {'orange': 'a sweet orange, citrus fruit',
#              'apple': 'god for making cider',
#              'lemon': 'a sour, yellow citrus fruit',
#              'grape': 'a small, sweet fruit growing in bunches',
#              'lime': 'a sour, green citrus fruit'}

    print(fruit['lemon'])
    print(fruit['grape'])
fruit.close()
print(fruit)
