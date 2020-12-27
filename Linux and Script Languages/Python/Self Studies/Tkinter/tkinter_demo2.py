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

left_frame = tkinter.Frame(mainWindow)
left_frame.pack(side='left', anchor='n', fill=tkinter.Y, expand=False)

canvas = tkinter.Canvas(mainWindow, relief='raised', borderwidth=1)
canvas.pack(side='left', anchor='n')

right_frame = tkinter.Frame(mainWindow)
right_frame.pack(side='right', anchor='n')

button1 = tkinter.Button(mainWindow, text='button1')
button2 = tkinter.Button(mainWindow, text='button2')
button3 = tkinter.Button(mainWindow, text='button3')

button1.pack(side='top')
button2.pack(side='top')
button3.pack(side='top')

mainWindow.mainloop()
