#import math package to use math.pi for the value of PI
import math
r=float(input("Enter the r of a sphere"))
Sur_area=4*math.pi*pow(r,2)
print("surface area of the sphere will be %.2f"%Sur_area)
Volume=(4/3)*math.pi*pow(r,4)
print("volume of the sphere will be %.3f"%Volume)
Cube_area=6*pow(r,2)
print("Area of cube %.2f"%Cube_area)
Cube_vol=pow(r,3)
print("volume of cube %.2f"%Cube_vol)
