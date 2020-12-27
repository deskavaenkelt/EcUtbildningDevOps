import random
import tkinter


def load_images(card_images):
    suits = ['heart', 'club', 'diamond', 'spade']
    face_cards = ['jack', 'queen', 'king']

    if tkinter.TkVersion >= 8.6:
        extension = 'png'
    else:
        extension = 'ppm'

    # for each suit, retrieve the image for the cards
    folder = 'cards/'
    for suit in suits:
        # first the number cards 1-10
        for card in range(1, 11):
            name = '{}{}_{}.{}'.format(folder, str(card), suit, extension)
            image = tkinter.PhotoImage(file=name)
            card_images.append((card, image,))

        # next the face cards
        for card in face_cards:
            name = '{}{}_{}.{}'.format(folder, str(card), suit, extension)
            image = tkinter.PhotoImage(file=name)
            card_images.append((10, image,))


def shuffle_cards():
    global cards
    global deck

    # Load cards
    cards = []
    load_images(cards)

    # create a new deck of cards an shuffle them
    deck = list(cards)
    random.shuffle(deck)


def _deal_card(frame):
    # pop he next card off the top of the deck
    next_card = deck.pop(0)
    # add the image to a Label and display the label
    tkinter.Label(frame, image=next_card[1], relief='raised', ).pack(side='left')
    # reshuffle deck if less than 12 cards left
    if len(deck) < 12:
        shuffle_cards()
        result_text.set('Reshuffled Deck!')
    # return the card's face value
    print(len(deck))
    return next_card


def score_hand(hand):
    # Calculate the score  of all cards in the list
    # Only one card can have the value 11, and this will be reduced to 1 if the hand bust.
    score = 0
    ace = False
    for next_card in hand:
        card_value = next_card[0]
        if card_value == 1 and not ace:
            ace = True
            card_value = 11
        score += card_value

        # if we would bust, check if there is an ace and subtract 10
        if score > 21 and ace:
            score -= 10
            ace = False

    return score


def deal_dealer():
    dealer_score = score_hand(dealer_hand)
    while 0 < dealer_score < 17:
        dealer_hand.append(_deal_card(dealer_card_frame))
        dealer_score = score_hand(dealer_hand)
        dealer_score_label.set(dealer_score)

    player_score = score_hand(player_hand)
    if player_score > 21:
        result_text.set(f'{DEALER} Wins!')
    elif dealer_score > 21 or dealer_score < player_score:
        result_text.set(f'{PLAYER} Wins!')
    elif dealer_score > player_score:
        result_text.set(f'{DEALER} Wins!')
    else:
        result_text.set(f'Draw!')


def deal_player():
    player_hand.append(_deal_card(player_card_frame))
    player_score = score_hand(player_hand)

    player_score_label.set(player_score)
    if player_score > 21:
        result_text.set(f'{DEALER} Wins!')


def initial_deal():
    deal_player()
    dealer_hand.append(_deal_card(dealer_card_frame))
    dealer_score_label.set(score_hand(dealer_hand))
    deal_player()


def new_game():
    global dealer_card_frame
    global player_card_frame
    global dealer_hand
    global player_hand
    # Embedded frame to hold the card images
    dealer_card_frame.destroy()
    dealer_card_frame = tkinter.Frame(card_frame, background='green')
    dealer_card_frame.grid(row=0, column=1, sticky='ew', rowspan=2)
    # Embedded frame to hold the card images
    player_card_frame.destroy()
    player_card_frame = tkinter.Frame(card_frame, background='green')
    player_card_frame.grid(row=2, column=1, sticky='ew', rowspan=2)

    result_text.set('')

    # create the list to store the hands of the dealer and player
    dealer_hand = []
    player_hand = []

    initial_deal()


def play():
    initial_deal()
    main_window.mainloop()


main_window = tkinter.Tk()

DEALER = 'Dealer'
PLAYER = 'Player'
WINDOW_RESOLUTION = '640x480'
MOVE_WINDOW_POSITION = '+2560+1080'

# Set up the screen and frames for the dealer ocn player
main_window.title('Black Jack')
main_window.geometry(WINDOW_RESOLUTION + MOVE_WINDOW_POSITION)
main_window.configure(background='green')

result_text = tkinter.StringVar()
result = tkinter.Label(main_window, textvariable=result_text)
result.grid(row=0, column=0, columnspan=3)

card_frame = tkinter.Frame(main_window, relief='sunken', borderwidth=1, background='green')
card_frame.grid(row=1, column=0, sticky='ew', columnspan=3, rowspan=2)

dealer_score_label = tkinter.IntVar()
tkinter.Label(card_frame, text=DEALER, background='green', fg='white').grid(row=0, column=0)
tkinter.Label(card_frame, textvariable=dealer_score_label, background='green', fg='white').grid(row=1, column=0)
# embedded frame to hold the card images
dealer_card_frame = tkinter.Frame(card_frame, background='green')
dealer_card_frame.grid(row=0, column=1, sticky='ew', rowspan=2)

player_score_label = tkinter.IntVar()
tkinter.Label(card_frame, text=PLAYER, background='green', fg='white').grid(row=2, column=0)
tkinter.Label(card_frame, textvariable=player_score_label, background='green', fg='white').grid(row=3, column=0)
# embedded frame to hold the card images
player_card_frame = tkinter.Frame(card_frame, background='green')
player_card_frame.grid(row=2, column=1, sticky='ew', rowspan=2)

button_frame = tkinter.Frame(main_window)
button_frame.grid(row=3, column=0, sticky='w', columnspan=3)

dealer_button = tkinter.Button(button_frame, text='Pass', command=deal_dealer)
dealer_button.grid(row=0, column=0)

player_button = tkinter.Button(button_frame, text='Take card', command=deal_player)
player_button.grid(row=0, column=1)

new_game_button = tkinter.Button(button_frame, text='New Game', command=new_game)
new_game_button.grid(row=0, column=2)

# Load cards & create a new deck of cards
cards = []
deck = list(cards)
shuffle_cards()

# create the list to store the hands of the dealer and player
dealer_hand = []
player_hand = []

# new_game()

if __name__ == '__main__':
    play()
