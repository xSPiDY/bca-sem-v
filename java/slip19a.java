import java.io.*;
class slip19a {
    static void fibo() {
        int i,a,b,c,n;
        DataInputStream dr = new DataInputStream(System.in);
        try {
            System.out.print("Enter Number : ");
            n = Integer.parseInt(dr.readLine());
            a = b = 1;
            System.out.print("The Fibonacci sequence: " + a + " " + b);
            for(i=1; i<=n-2; i++){
                c = a + b;
                System.out.print(" "+c);
                a = b;
                b = c;
            }
        } catch (Exception e) {}
      }
    public static void main(String args[]){
        fibo();
    }
}