try:
    import tkinter
except ImportError:
    import Tkinter as tkinter  # Python 2 import

# pack example

mainWindow = tkinter.Tk()

mainWindow.title('Hello World')
mainWindow.geometry('640x480+1920+1080')

label = tkinter.Label(mainWindow, text='Hello World')
label.pack(side='top')

canvas = tkinter.Canvas(mainWindow, relief='raised', borderwidth=1)
canvas.pack(side='top')

button1 = tkinter.Button(mainWindow, text='button1')
button2 = tkinter.Button(mainWindow, text='button2')
button3 = tkinter.Button(mainWindow, text='button3')

button1.pack(side='top', anchor='n')
button2.pack(side='top', anchor='s')
button3.pack(side='top', anchor='e')

mainWindow.mainloop()
