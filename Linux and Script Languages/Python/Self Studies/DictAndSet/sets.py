farm_animals = {'sheep', 'cow', 'hen'}
print(farm_animals)

for animal in farm_animals:
    print(animal)
print('=' * 40)

wild_animals = set(['lion', 'tiger', 'panther', 'elephant', 'hare'])
print(wild_animals)

for animal in wild_animals:
    print(animal)
print('=' * 40)

farm_animals.add('horse')
wild_animals.add('horse')
print(farm_animals)
print(wild_animals)

empty_set = set()
empty_set2 = {}

empty_set.add('a')
# empty_set2.add('a')
print('=' * 40)

even = set(range(0, 40, 2))
print(even)
squares_tuples = (4, 6, 9, 16, 25)
squares = set(squares_tuples)
print(squares)
print('=' * 40)

# Union
even = set(range(0, 40, 2))
print(even)
print(len(even))

squares_tuples = (4, 6, 9, 16, 25)
squares = set(squares_tuples)
print(squares)
print(len(squares))

print(even.union(squares))
print(len(even.union(squares)))

print(squares.union(even))
print('=' * 40)

print(even.intersection(squares))
print(even & squares)
print(squares.intersection(even))
print(squares & even)
print('=' * 40)

# Sorted
even = set(range(0, 40, 2))
print(sorted(even))
print(len(even))

squares_tuples = (4, 6, 9, 16, 25)
squares = set(squares_tuples)
print(sorted(squares))

print('even minus squares')
print(sorted(even.difference(squares)))
print(sorted(even - squares))

print('squares minus even')
print(squares.difference(even))
print(squares - even)
print('=' * 40)

print(sorted(even))
print(squares)
even.difference_update(squares)
print(sorted(even))
print('=' * 40)

print('symmetric even minus squares')
print(sorted(even.symmetric_difference(squares)))

print('symmetric squares minus even')
print(sorted(squares.symmetric_difference(even)))
print(squares.symmetric_difference(even))
print('=' * 40)

# Discard, remove
even = set(range(0, 40, 2))
print(even)
squares_tuples = (4, 6, 9, 16, 25)
squares = set(squares_tuples)
print(squares)

squares.discard(4)
squares.remove(16)
squares.discard(8)
squares.discard(8)  # Dont crash program if not found
print(squares)
try:
    squares.remove(8)  # Crash program if not found and not in a try-block
except KeyError:
    print('The item 8 is not a member of the set')
print('=' * 40)

# Super- and Sub-set
even = set(range(0, 40, 2))
print(even)
squares_tuples = (4, 6, 16)
squares = set(squares_tuples)
print(squares)

if squares.issubset(even):
    print('Squares are a subset of even')

if even.issuperset(squares):
    print('Even is a superset of squares')
print('=' * 40)

# Frozen Set
even = frozenset(range(0, 100, 2))
print(even)
# even.add(3) dont exist in frozen since it's immutable
