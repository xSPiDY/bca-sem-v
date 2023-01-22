def Duplicate(duplicate):
    new_lst=[]
    for num in duplicate:
        if num not in new_lst:
            new_lst.append(num)
    return new_lst

lst=[1,2,3,4,5,5,6,2,1,3]
print(Duplicate(lst))