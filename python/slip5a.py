class MyClass:
    def Get_String(self):
        self.MyStr=input("Enter any String: ")
    def Print_String(self):
        s=self.MyStr
        print("String in Upper Case: " , s.upper())
Obj=MyClass()
Obj.Get_String()
Obj.Print_String()