from tkinter import *
def calculate():
    res=int(e1.get())
    label_text.set(bin(res))
    label_text1.set(oct(res))
    label_text2.set(hex(res))
window=Tk()
label_text=StringVar()
label_text1=StringVar()
label_text2=StringVar()
Label(window,text="Enter Decimal Number : ").grid(row=0)
Label(window,text="Binary : ").grid(row=3)
result=Label(window,text="",textvariable=label_text).grid(row=3,column=1)
Label(window,text="Octal : ").grid(row=4)
result=Label(window,text="",textvariable=label_text).grid(row=4,column=1)
Label(window,text="Hexadecimal : ").grid(row=5)
result=Label(window,text="",textvariable=label_text2).grid(row=5,column=1)
e1=Entry(window)
e1.grid(row=0,column=1)
b=Button(window,text="Calculate",command=calculate)
b.grid(row=0,column=6,columnspan=2,rowspan=2,padx=5,pady=5)
mainloop()