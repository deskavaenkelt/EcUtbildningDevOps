def is_palindrome(string):
    return string[::-1].casefold() == string.casefold()


def palindrome_sentence(sentence):
    string = ''
    for char in sentence:
        if char.isalnum():
            string += char

    # return string[::-1].casefold() == string.casefold()
    return is_palindrome(string)


print(is_palindrome('something'))
print(is_palindrome('ada'))

word = input('Enter a word to check: ')
if is_palindrome(word):
    print('{} is a palindrome'.format(word))
else:
    print('{} is not a palindrome'.format(word))

print(palindrome_sentence('Was it a car, or a cat, I saw'))
print(palindrome_sentence('Anything else'))
print(palindrome_sentence('Radar'))
print(palindrome_sentence('Python'))
print(palindrome_sentence('Do geese see god'))


