import java.io.*;
class slip13a{
    public static void main(String args[]){
        String temp=null;
        int i,j,n;
        DataInputStream dr = new DataInputStream(System.in);
        try{
            System.out.print("Enter How May Element You Want = ");
            n = Integer.parseInt(dr.readLine());
            String name[]= new String[n];
            for(i=0; i<n; i++){
                System.out.print("Enter " + (i+1) + " String = ");
                name[i] = dr.readLine();
            }
            System.out.print("After Sorting = ");
            for(i=n-1; i>=0; i--){
                System.out.print(name[i] + " ");
            }
        }catch(Exception e){}
    }
}