from tkinter import *
import tkinter as tk
window = tk.Tk()
window.title('My Window')
window.geometry('500x500')
l = tk.Label(window, bg='white', width=20, text='Hello')
l.pack()
def print_selection():
    if(var1.get() == 0) & (var2.get() == 0) & (var3.get() == 0):
       l.config(text="Hello")
    elif (var1.get() == 1):
        l.config(text="Hello", font=("Arial"))
    elif (var2.get() == 1):
        l.config(text="Hello", font=("Arial Bold",20))
    elif (var3.get() == 1):
        l.config(text="Hello", font=("Arial", 70))
    else:
        l.config(text="Hello", font=("Arial Bold", 70))
var1 = tk.IntVar()
var2 = tk.IntVar()
var3 = tk.IntVar()
c1 = tk.Checkbutton(window, text='Font Style',variable=var1, onvalue=1, offvalue=0, command=print_selection)
c1.pack()
c2 = tk.Checkbutton(window, text='Bold',variable=var2, onvalue=1, offvalue=0, command=print_selection)
c2.pack()
c3 = tk.Checkbutton(window, text='Size = 70',variable=var3, onvalue=1, offvalue=0, command=print_selection)
c3.pack()
window.mainloop()