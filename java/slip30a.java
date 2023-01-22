import java.io.*;
class Numberiszero extends Exception{}
class slip30a{
    public static void main( String args[]){
        int r,sum=0,temp; 
        int n;
        DataInputStream dr = new DataInputStream(System.in);
        try {
            System.out.print("Enter Number : ");
            n = Integer.parseInt(dr.readLine());
            if(n==0){
                throw new Numberiszero();
            }else{
                temp=n; 
                while(n>0){ 
                    r=n%10;
                    sum=(sum*10)+r; 
                    n=n/10; 
                } 
                if(temp==sum){
                    System.out.println("Palindrome Number "); 
                }else{
                    System.out.println("Not Palindrome");
                }
            }
        } catch (Numberiszero nz) {
            System.out.println("Number is Zero");
        }
        catch (NumberFormatException e){
            System.out.println("Number is Invalid");
        }
        catch (Exception e){}
    }
}