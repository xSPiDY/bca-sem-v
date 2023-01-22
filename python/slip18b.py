class Person:
    def AcceptPer(self):
        self.Name=input("Enter Person Name : ")
        self.address  = input("Enter person address : ")
    def DisplayPer(self):
        print("Person Name : ",self.Name)
        print("Person Address : ",self.address)
class Employee(Person):
    def AcceptEmp(self):
        self.salary=int(input("Enter Salary"))
    def DisplayEmp(self):
        print("Employee salary is : ",self.salary)
n=int(input("Enter how many Employee : "))
s=[]
for i in range(0,n):
    x=input("Enter object name : ")
    s.append(x)
    print(s)
for j in range(0,n):
    s[j]=Employee()
    s[j].AcceptPer()
    s[j].AcceptEmp()
print("Display Details : ")
for k in range(0,n):
    s[k].DisplayPer()
    s[k].DisplayEmp()