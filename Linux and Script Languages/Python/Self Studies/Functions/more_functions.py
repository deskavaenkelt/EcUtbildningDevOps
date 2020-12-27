import tkinter


def parabola(x):
    return x * x / 100


def draw_axes(page):
    page.update()
    x_origin = page.winfo_width() / 2
    y_origin = page.winfo_height() / 2
    page.configure(scrollregion=(-x_origin, -y_origin, x_origin, y_origin))
    page.create_line(-x_origin, 0, x_origin, 0, fill='black')
    page.create_line(0, y_origin, 0, -y_origin, fill='black')
    print(locals())


def plot(page, x, y):
    page.create_line(x, y, x + 1, y + 1, fill='red')


main_window = tkinter.Tk()

main_window.title('Parabola')
main_window.geometry('640x480')

canvas = tkinter.Canvas(main_window, width=640, height=480)
canvas.grid(row=0, column=0)

draw_axes(canvas)

for a in range(-100, 101):
    b = parabola(a)
    plot(canvas, a, -b)

main_window.mainloop()
