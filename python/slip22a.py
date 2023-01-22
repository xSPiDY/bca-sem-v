class A:
    def __init__(self,str):
        self.str=str
    # adding two objects
    def __mul__(self, o):
        for i in range(1,o):
            print(self.str)
ob1 = A(input("Enter String : "))
n=int(input("Enter multiply Number : "))
print(ob1 * n)