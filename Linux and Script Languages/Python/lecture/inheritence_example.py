class Animal():

    def __init__(self, sound=''):
        self.sound = sound

    def say_something(self):
        print(self.sound)

    def say_other(self):
        print('Hej')


class Cow(Animal):

    def __init__(self):
        Animal.__init__(self, 'mooh')


cow = Cow()
cow.say_something()
cow.say_other()


class Character():

    def __init__(self):
        self.health = 100
        self.attack_damage = 1
        self.hunger = 0
        self.level = 0

    def print_stats(self, name):
        print(name + ':')
        print(self.__dict__)

    def take_damage_from_character(self, character):
        self.health -= character.attack_damage

    def attack_character(self, character):
        character.take_damage_from_character(self)
        self.level += 1


class Player(Character):

    def __init__(self):
        Character.__init__(self)


class Enemy(Character, Animal):

    def __init__(self, damage_mult=10, *args, **kwargs):
        Character.__init__(self)
        Animal.__init__(self, *args, **kwargs)
        self.damage_mult = damage_mult

    def take_damage_from_character(self, character):
        self.health -= character.attack_damage * self.damage_mult


player = Player()
enemy = Enemy(10, sound='Moooh')
enemy.say_something()

player.print_stats("player")
enemy.print_stats("enemy")

player.attack_character(enemy)

player.print_stats("player")
enemy.print_stats("enemy")
