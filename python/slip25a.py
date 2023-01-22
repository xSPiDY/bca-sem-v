def Chk():
    s="The quick Brow Fox"
    cnt=len(s)
    ucnt=0
    lcnt=0
    for i in range(0,cnt):
        if s[i].isalpha()==True:
            if s[i].isupper()==True:
                ucnt=ucnt+1
            elif s[i].islower()==True:
                lcnt=lcnt+1
    print("No. of Upper case characters :", ucnt)
    print("No. of Lower case characters :", lcnt)
#main body
Chk()

