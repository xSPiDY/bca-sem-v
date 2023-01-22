def caseCounter(s):
    d={"Upper_Case":0,"Lower_Case":0}
    for ch in s:
        if ch.isupper():
            d["Upper_Case"]+=1
        elif ch.islower():
            d["Lower_Case"]+=1
        else:
            pass
    print("No. of Upper case character : ",d["Upper_Case"])
    print("No. of Lower case character : ",d["Lower_Case"])
caseCounter("My Name is Amit")