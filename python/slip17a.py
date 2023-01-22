from tkinter import *
def volumesphere():
    label_text.set(string.get().upper())
window=Tk()
label_text=StringVar()
Label(window,text="Enter String: ").grid(row=0)
Label(window,text="Uppercase = ").grid(row=3)
result=Label(window,text="",textvariable=label_text).grid(row=3,column=1)
string=Entry(window)
string.grid(row=0,column=1)
b=Button(window,text="Calculate",command=volumesphere)
b.grid(row=0,column=2,columnspan=2,rowspan=2,padx=5,pady=5)
mainloop()