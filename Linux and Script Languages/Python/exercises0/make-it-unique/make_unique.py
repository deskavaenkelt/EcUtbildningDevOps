def make_unique(names):
    new_names = []
    for index in names:
        if index not in new_names:
            new_names.append(index)

    return new_names


my_names = ["John", "Sarah", "Hannah", "Hannah", "Tom", "George", "Sarah"]

unique_names = make_unique(my_names)

print(unique_names)
# The correct answer here should be:
#   `['Sarah', 'Hannah', 'John', 'George', 'Tom']`
