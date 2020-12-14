vehicles = {
    'dream': 'Honda 250T',
    'roadster': 'BMW R1100',
    'er5': 'Kawasaki ER5',
    'can-am': 'Bombardier Can-Am 250',
    'virago': 'Yamaha XV250',
    'tenere': 'Yamaha XT650',
    'jimny': 'Suzuki Jimny 1.5',
    'fiesta': 'Ford Fiesta Ghia 1.4',
    'starfighter': 'Lockheed F-104',
    'learjet': 'Bombardier Learjet 75',
    'toy': 'Glider'}

for key, value in vehicles.items():
    print(key, vehicles[key], sep=' - ')

vehicles['virago'] = "Yamaha XV535"

for key, value in vehicles.items():
    print(key, vehicles[key], sep=' - ')

print('*' * 40)

del vehicles['starfighter']

for key, value in vehicles.items():
    print(key, vehicles[key], sep=' - ')

print('*' * 40)

vehicles.pop('f1', None)
result = vehicles.pop('mega', None)
print(result)
print('*' * 40)

result = vehicles.pop('mega', 'My own string will be returned if I write something here')
print(result)
print('*' * 40)

result = vehicles.pop('learjet')
print(result)
print('*' * 40)

result = vehicles.pop('tenere', 'not present')
print(result)
print('*' * 40)


