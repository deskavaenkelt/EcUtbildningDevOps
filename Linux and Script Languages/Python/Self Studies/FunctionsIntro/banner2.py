def banner_text(text=' ', screen_width=80):
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


banner_text("*", 80)
banner_text("Always look on the bright side of life...")
banner_text("If life seems jolly rotten,")
banner_text("There's something you've forgotten!")
banner_text("And that's to laugh and smile and dance and sing,")
banner_text()
banner_text(screen_width=60)
banner_text("When you're feeling in the dumps,")
banner_text("Don't be silly chumps,")
banner_text("Just purse your lips and whistle - that's the thing!")
banner_text("And... always look on the bright side of life...")
banner_text("*")
