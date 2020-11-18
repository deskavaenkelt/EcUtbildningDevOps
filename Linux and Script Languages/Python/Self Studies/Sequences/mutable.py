shopping_list = ['milk', 'pasta', 'eggs', 'spam', 'bread', 'rice']
another_list = shopping_list
print(shopping_list)
print(id(shopping_list))
print(id(another_list))

shopping_list += ['cookies']
print(shopping_list)
print(id(shopping_list))

a = b = c = d = e = another_list
print(a)
print(len(a))
print('Adding cream')
b.append('cream')
print(c)
print(d)
print(len(d))
