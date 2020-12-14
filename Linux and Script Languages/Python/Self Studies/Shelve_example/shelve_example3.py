import shelve

fruit = shelve.open('ShelfTest3')
# fruit['orange'] = 'a sweet orange, citrus fruit'
# fruit['apple'] = 'god for making cider'
# fruit['lemon'] = 'a sour, yellow citrus fruit'
# fruit['grape'] = 'a small, sweet fruit growing in bunches'
# fruit['lime'] = 'a sour, green citrus fruit'

# while True:
#     dict_key = input('Please enter a fruit: ')
#     if dict_key == 'quit':
#         break
#
#     if dict_key in fruit:
#         description = fruit[dict_key]
#         print(description)
#     else:
#         print("We don't have a " + dict_key)

for f in fruit:
    print(f + ' - ' + fruit[f])
print('=' * 40)

ordered_keys = list(fruit.keys())
ordered_keys.sort()

for f in ordered_keys:
    print(f + ' - ' + fruit[f])
print('=' * 40)

for v in fruit.values():
    print(v)
print(fruit.values())
print('=' * 40)

for f in fruit.items():
    print(f)
print(fruit.items())

fruit.close()
