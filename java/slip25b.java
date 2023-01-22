import java.io.*;
import Series.*;
class Slip25B {
    public static void main(String args[])throws Exception{

        int n1,n2,n3;

        DataInputStream dr = new DataInputStream(System.in);

        System.out.print("Enter How Many fibonnacci series you want : ");

        n1=Integer.parseInt(dr.readLine());

        System.out.print("Enter How Many cube you want  : ");

        n2=Integer.parseInt(dr.readLine());

        System.out.print("Enter How Many Squares you want : ");

        n3=Integer.parseInt(dr.readLine());

        

        System.out.println("\nFibonacci Series ....");

        Fibo f1 = new Fibo();

        f1.fiboSeries(n1);



        System.out.println("\nCube Series ....");

        Cubes c1=new Cubes();

        c1.cubeSeries(n2);



        System.out.println("\nSquare Series ....");

        Square s1=new Square();

        s1.squareSeries(n3);

    }

}



//Create folder series



//Cubes.java



package Series;



public class Cubes {

    public void cubeSeries(int n){

        for(int i=1; i<=n; i++){

            int c=(i*i*i);

            System.out.print(c + " ");

        }

    }


}



//Fibo.java



package Series;



public class Fibo {

    public int f=0, s=1, i;

    public void fiboSeries(int nl){

        for(i=1; i<=nl; i++){

            System.out.print(f + " ");

            int n=f+s;

            f=s;

            s=n;

        }

    }

}



//Square.java

package Series;
public class Square {
    public void squareSeries(int n){
        for(int i=1; i<=n; i++){
            int c=(i*i);
            System.out.print(c +" ");
        }
    }
}