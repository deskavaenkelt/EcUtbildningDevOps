sample_text = 'Python is a very powerful language'

vowels = frozenset('aeiou')
# vowels = {'a', 'e', 'i', 'o', 'u'}

final_set = set(sample_text).difference(vowels)
print(final_set)

final_list = sorted(final_set)
print(final_list)
