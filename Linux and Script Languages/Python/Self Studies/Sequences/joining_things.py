flowers = [
    'Daffodil',
    'Evening Primrose',
    'Hydrangea',
    'Iris',
    'Lavender',
    'Sunflower',
    'Tiger Lily',
]

for flower in flowers:
    print(flower)

separator = ' | '
output = separator.join(flowers)
print(output)

output = ' | '.join(flowers)
print(output)

print(' | '.join(flowers))
print(', '.join(flowers))
