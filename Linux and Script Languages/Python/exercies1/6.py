# 6. Skriv ett Python-program för att konvertera en tuple till en sträng.


def convertTuple(tup):
    return ''.join(tup)


mytuple = ('g', 'e', 'e', 'k', 's')
string = convertTuple(mytuple)

print(mytuple)
print(string)
