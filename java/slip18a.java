import java.util.*;
class AreaCalculate{
    void area(int r){
        System.out.println("Area of Cirlce = " + (3.14*r*r));
    }
    float area(int b, float h){
        return b*h/2;
    }
    double area(Float l, Float db){
        return l+db;
    }
}
class slip18a {
    public static void main(String args[]){
        int r, b, l, db;
        float h;
        Scanner br = new Scanner(System.in);
        System.out.println("Enter the radius, base, height, length and breadth : ");
        r = br.nextInt();
        b = br.nextInt();
        h = br.nextFloat();
        l = br.nextInt();
        db = br.nextInt();
        AreaCalculate ac = new AreaCalculate();
        ac.area(r);
        System.out.println("Area of Triangle = " +ac.area(b,h));
        System.out.println("Area of Rectange = " +ac.area(l,db));
    }
}