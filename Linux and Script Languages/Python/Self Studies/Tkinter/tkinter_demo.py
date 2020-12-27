try:
    import tkinter
except ImportError:
    import Tkinter as tkinter  # Python 2 import

print(tkinter.TkVersion)
print(tkinter.TclVersion)

mainWindow = tkinter.Tk()

mainWindow.title('Hello World')
mainWindow.geometry('640x480+1920+100')  # (res-x x res-y + width from left of screen + width from top
mainWindow.mainloop()
