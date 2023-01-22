from tkinter import *
root=Tk() 
radio=IntVar() 
canvas1=Canvas(root, width= 400, height=300) 
canvas1.pack()
entry1=Entry (root) 
canvas1.create_window(200, 140, window=entry1)
def getprime():
    n=int(entry1.get())
    if n >1: 
        for i in range(2,n):
            if (n % 1) == 0:
                txt=(n,"is not a prime number") 
                break 
            else:
                txt = (n, "is a prime number") 
    labell=Label(root, text=txt) 
    canvas1.create_window(200, 250, window=label1) 
def getarmstong(): 
    n = int(entry1.get()) 
    temp = n 
    total = 0 
    while temp > 0:
        digit=temp%10
        total=total + (digit**3) 
        temp = temp//10 
    if n == total: 
        txt=(n,"is an armstrong number") 
    else: 
        txt=(n,"is not armstrong number") 
    label1=Label(root, text= txt) 
    canvas1.create_window(200, 250, window=label1) 
def getperfect(): 
    n=int(entry1.get()) 
    sum = 0 
    for i in range(1,n):
        if n%i==0: 
            sum = sum + i 
    if sum == n:
        txt=(n,"is perfect number") 
    else: 
        txt=(n, "is not perfect number")
    label1=Label(root, text= txt) 
    canvas1.create_window(200, 250, window=label1) 
button1 = Radiobutton(canvas1, text="Prime", variable=radio, value=3, command=getprime)
button2 = Radiobutton(canvas1, text="Armstrong", variable=radio, value=2, command=getarmstong) 
button3 = Radiobutton(canvas1, text="Perfect", variable=radio value=1, command=getperfect) 
canvas1.create_window(200, 180, window=button1) 
canvas1.create_window(200, 200, window=button2) 
canvas1.create_window(200, 220, window=button3) 
root.mainloop()