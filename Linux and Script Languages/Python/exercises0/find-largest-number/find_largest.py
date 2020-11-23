# the `numbers` argument for this function will always be a list.
def find_largest(numbers):
    largest_number = 0
    for index in numbers:
        if index > largest_number:
            largest_number = index
    return largest_number


some_numbers = [55, 34, 100, 32, 0, 88, 9]

largest = find_largest(some_numbers)

print(largest)
# the expected output here is: `100`
