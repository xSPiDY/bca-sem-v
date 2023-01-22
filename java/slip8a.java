import java.util.*;
interface Shape{
    final float pi= 3.14F;
    double area();
}
class Circle implements Shape{
    int rad;
    Circle(int r){
        rad=r;
    }
    public double area(){
        return pi*rad*rad;
    }
}
class Sphere implements Shape{
     int rad;
     Sphere(int r){
         rad =r;
     }
     public double area(){
         return 4*pi*rad*rad;
     }
}
class slip8a {
    public static void main(String args[]) throws Exception{
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        r=sc.nextInt();
        Shape sh;
        Circle cl=new Circle(r);
        sh=cl;
        System.out.println("Area of Circle : " + sh.area());
        Sphere sp=new Sphere(r);
        sh=sp;
        System.out.println("Area of Sphare : "+sh.area());
    }
}