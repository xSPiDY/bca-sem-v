class Rectangle:
   def __init__(self,l,w): 
      self.length = l 
      self.width = w
   def rectangle_area(self):
      return self.length*self.width 

rac=Rectangle(12,7)
print(rac.rectangle_area())