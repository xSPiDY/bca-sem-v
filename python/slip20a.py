class Circle():
    def init (self, r):
        self.radius = r
    def area(self):
        return self.radius**2*3.14
    def perimeter(self):
        return 2*self.radius*3.14
NewCircle = Circle()
NewCircle.init(8)
print(NewCircle.area())
print(NewCircle.perimeter())