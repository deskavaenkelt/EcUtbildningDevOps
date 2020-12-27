def python_food():
    width = 80
    text = 'spam and eggs'
    left_margin = (width - len(text)) // 2
    print(' ' * left_margin, text)


def center_text(text):
    width = 80
    left_margin = (width - len(text)) // 2
    print(' ' * left_margin, text)


def center_text2(*args):
    width = 80
    text = ' '
    for arg in args:
        text += str(arg) + ' '
    left_margin = (width - len(text)) // 2
    print(' ' * left_margin, text)


def center_text3(*args, sep=' ', end='\n', file=None, flush=False):
    width = 80
    text = ' '
    for arg in args:
        text += str(arg) + sep
    left_margin = (width - len(text)) // 2
    print(' ' * left_margin, text, end=end, file=file, flush=flush)


def center_text4(*args, sep=' '):
    width = 80
    text = ''
    for arg in args:
        text += str(arg) + sep
    left_margin = (width - len(text)) // 2
    return ' ' * left_margin + text


python_food()
center_text('Spam & Eggs1')
center_text2('Spam & Eggs2')

print('first', 'second', 3, 4, 'spam')
center_text2('first', 'second', 3, 4, 'spam')
center_text3('first', 'second', 3, 4, 'spam', sep=';')

# with open('centred', mode='w') as centered_file:
#     center_text3('Spam & Eggs3', file=centered_file)
#     center_text3('first', 'second', 3, 4, 'spam', sep=';', file=centered_file)

with open('menu', 'w') as menu:
    s1 = center_text4('Spam & Eggs4')
    s2 = center_text4('first', 'second', 3, 4, 'spam', sep=';')
    print(s1, file=menu)
    print(s2, file=menu)
