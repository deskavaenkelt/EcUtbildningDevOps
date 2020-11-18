print("Today is a good day to learn python")
print('Python is fun')
print("Python's string are easy to use")
print('We can even include "quotes" in strings')
print("Hello" + " world")

greeting = "Hello"
name = "Bruce"

# Comment
print(greeting + ' ' + name)

# name = input('Please enter your name: ')
print(greeting + name)
print(greeting + ' ' + name)

greeting = 'Hello'

name = 'Tim'
print(greeting + name)
print(greeting + ' ' + name)

age = 24
print(age)

print('greeting type =', type(greeting))
print('age type =', type(age))

age = "2 years"
print('age type =', type(age))

print(name + ' ' + age)

# F-String
age = 24
print()
print("F-String")
print(name + f" is  {age} years old")

print(f"Pi is approximately {22 / 7:12.50f}")

pi = 22 / 7
print(f"Pi is approximately {pi:12.50f}")

pi = 333/106
print(f"Pi is approximately {pi:12.50f}")
