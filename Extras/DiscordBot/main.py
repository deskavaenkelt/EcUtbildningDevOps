import discord
import os
from dotenv import load_dotenv

load_dotenv()


client = discord.Client()


@client.event
async def on_ready():
    print(f'We have logged in as {client.user}')


@client.event
async def on_message(message):
    if message.author == client.user:
        return

    if message.content.startswith('$hello'):
        await message.channel.send('Hello')


# class MyClient(discord.Client):
#     async def on_ready(self):
#         print('Logged on as {0}!'.format(self.user))
#
#     async def on_message(self, message):
#         print('Message from {0.author}: {0.content}'.format(message))
#
#
# client = MyClient()

# client.run('ODMzNzAxMzAxODk1NDMwMjA0.YH2K1w.5vIVVTWJuDuoA8xQvMnEGe3KGC8')
client.run(os.environ.get('TOKEN'))

# print(os.environ.get('TOKEN'))
