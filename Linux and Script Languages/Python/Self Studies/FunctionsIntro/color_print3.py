import colorama

# Some ANSI escape sequences for colours and effects
BLACK = '\u001b[30m'
RED = '\u001b[31m'
GREEN = '\u001b[32m'
YELLOW = '\u001b[33m'
BLUE = '\u001b[34m'
MAGENTA = '\u001b[35m'
CYAN = '\u001b[36m'
WHITE = '\u001b[37m'
RESET = '\u001b[0m'

BOLD = '\u001b[1m'
UNDERLINE = '\u001b[4m'
REVERSE = '\u001b[7m'


def colour_print(text: str, *effects: str) -> None:
    """
    Print `text` using the ANSI sequences to change color, etc.

    :param text: The text to print.
    :param effects: The effect we want. One of the constants defined at the start of this module
    :return: none.
    """
    effect_string = ''.join(effects)
    output_string = '{}{}{}'.format(effect_string, text, RESET)
    print(output_string)


colorama.init()
print('random')
colour_print('RED', RED)
colour_print('RED in bold', RED, BOLD)
print('random')
colour_print('BLACK', BLACK)
colour_print('GREEN', GREEN)
colour_print('YELLOW', YELLOW)
colour_print('YELLOW and bold', YELLOW, BOLD)
colour_print('BLUE', BLUE)
colour_print('BLUE reversed', BLUE, REVERSE)
colour_print('BLUE reversed and underlined', BLUE, REVERSE, UNDERLINE)
colour_print('MAGENTA', MAGENTA)
colour_print('CYAN', CYAN)
colour_print('WHITE', WHITE)
colour_print('BOLD', BOLD)
colour_print('UNDERLINE', UNDERLINE)
colour_print('REVERSE', REVERSE)
colorama.deinit()
