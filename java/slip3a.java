import java.util.Scanner;
class slip3a {
    static int temp;
    public static void main(String args[]){
        int n,r,sum=0;
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number");
            n = sc.nextInt();
            temp=n;
            while(n>0){
                r = n%10;
                sum=sum+(r*r*r);
                n=n/10;
            }
            if(temp==sum){
                System.out.println(temp +  " Is Armstrong Number : ");
            }else{
                System.out.println(temp +  " Is Not Armstrong Number : ");
            }
    }
}