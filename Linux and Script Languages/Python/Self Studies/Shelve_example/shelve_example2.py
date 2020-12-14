import shelve

# with shelve.open('ShelfTest2') as fruit:
fruit = shelve.open('ShelfTest2')
fruit['orange'] = 'a sweet orange, citrus fruit'
fruit['apple'] = 'god for making cider'
fruit['lemon'] = 'a sour, yellow citrus fruit'
fruit['grape'] = 'a small, sweet fruit growing in bunches'
fruit['lime'] = 'a sour, green citrus fruit'

print(fruit['lemon'])
print(fruit['grape'])
print('=' * 40)

fruit['lemon'] = 'is grate with tequila'

for snack in fruit:
    print(snack + ': ' + fruit[snack])
print('=' * 40)

fruit.close()
print(fruit)
