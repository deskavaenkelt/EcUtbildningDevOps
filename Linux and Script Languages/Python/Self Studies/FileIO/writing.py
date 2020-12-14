# Write to file
# cities = ['Adelaide', 'Alice Springs', 'Darwin', 'Melbourne', 'Sidney']

# with open('cities.txt', 'w') as cities_file:
#     for city in cities:
#         print(city, file=cities_file)


# Read from file
cities = []
with open('cities.txt') as city_file:
    for city in city_file:
        # cities.append(city)
        cities.append(city.strip('\n'))

print(cities)
for city in cities:
    print(city)


