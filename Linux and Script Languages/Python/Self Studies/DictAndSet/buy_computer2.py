available_parts = ['computer', 'monitor', 'keyboard', 'mouse', 'mouse mat', 'hdmi cable', 'dvd drive']
# valid_chooses = [str(i) for i in range(1, len(available_parts) + 1)]
valid_chooses = []
for i in range(1, len(available_parts) + 1):
    valid_chooses.append(str(i))

# print(valid_chooses)
current_choice = '-'
computer_parts = []

available_parts.sort()

while current_choice != '0':
    if current_choice in valid_chooses:
        index = int(current_choice) - 1
        chosen_part = available_parts[index]
        if chosen_part in computer_parts:
            print('Removing {}'.format(current_choice))
            computer_parts.remove(chosen_part)
        else:
            computer_parts.append(chosen_part)
            print("Adding {}".format(current_choice))
        print('Your list now contains: {}'.format(computer_parts))

    else:
        print('Please add options from the list below:')
        for number, part in enumerate(available_parts):
            print('{}: {}'.format(number + 1, part))
        print('0: Exit')

    current_choice = input()

print(computer_parts)
