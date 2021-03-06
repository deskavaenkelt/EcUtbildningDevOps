d = {
    0: "zero",
    1: "one",
    2: "two",
    3: "three",
    4: "four",
    5: "five",
    6: "six",
    7: "seven",
    8: "eight",
    9: "nine",
}

pantry_items = ['chicken', 'spam', 'egg', 'bread', 'lemon']

new_dict = dict.fromkeys(pantry_items, 0)
print(new_dict)

# for key, value in enumerate(new_dict):
#     print(key, value)

keys = d.keys()
print(keys)

for item in d.keys():
    print(item)

d2 = {
    7: 'lucky seven',
    10: 'ten',
    3: 'this is the new three'
}

d.update(d2)
for key, value in d.items():
    print(key, value)

print()

d.update(enumerate(pantry_items))
for key, value in d.items():
    print(key, value)
