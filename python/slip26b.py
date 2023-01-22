import tkinter 
from tkinter import * 
def foo():
    a = txt.get()
    res = a.replace(' ', '*')
    res = res[::-1]
    for i in res:
        if i.isdigit():
            res = res.replace(i, '?')
    show.insert(0,res)
root = tkinter.Tk()
root.title("Replace karo")
root.geometry('500x500+200+100')
lbl1 = Label(root,text='Enter Text',font='verdana 12 bold')
txt = Entry(root,font='verdana 12 bold')
show = Entry(root,font='Times New Roman 12 bold')
btn = Button(root, font = 'verdana 12 bold', text = 'Click me', command= foo)
lbl1.pack()
txt.pack()
show.pack()
btn.pack()
root.mainloop()