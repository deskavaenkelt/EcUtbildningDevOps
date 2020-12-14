from pydoc import text


def holiday_tree(rows: int):
    character = '* '
    for row in enumerate(1, rows):
        if row == 0:
            print(character)
        else:
            print(character * row)

def banner_text(text: str = ' ', screen_width: int = 80) -> None:
    reserved_screen_width = 4
    if len(text) > screen_width - reserved_screen_width:
        raise ValueError('String {} is larger then specified width of {}'
                         .format(text, screen_width))

    if text == '*':
        print('*' * screen_width)
    else:
        output_string = '**{}**'.format(
            text.center(screen_width - reserved_screen_width))
        print(output_string)


def triangle_shape(n):
    is_one = True
    for i in range(n):
        for j in range(n - i):
            print('', end='')
        for k in range(2 * i + 1):
            if is_one:
                # banner_text('1')
                print('{}'.format(text.center('1')), end='')
                is_one = False
            else:
                # banner_text('0')
                print('{}'.format(text.center('0')), end='')
                is_one = True
        print()


triangle_shape(5)

banner_text('*')
banner_text('text')
