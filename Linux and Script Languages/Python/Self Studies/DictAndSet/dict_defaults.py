from contents_quantities import pantry

chicken_quantity = pantry.setdefault('chicken', 0)
print(f'chicken: {chicken_quantity}')

beans_quantity = pantry.setdefault('beans', 0)  # Add to dictionary
print(f'beans: {beans_quantity}')

ketchup_quantity = pantry.get('ketchup', 0)     # Don't add to dictionary
print(f'ketchup: {ketchup_quantity}')

z_quantity = pantry.setdefault('zucchini', 'eight')
print(f'zucchini: {z_quantity}')

print()
print('pantry now contains')

for key, value in sorted(pantry.items()):
    print(key, value)
