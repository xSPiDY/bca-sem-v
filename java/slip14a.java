import java.util.*;
class slip14a {
    public static void main(String args[]){
        int base,exp;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Base Number : ");
        base = sc.nextInt();
        System.out.print("Enter the Exponent Number : ");
        exp = sc.nextInt();
        int result = power(base, exp);
        System.out.print("Answer : "+ result);
    }
    private static int power(int base, int exp) {
        if(exp!=0){
            return (base * power(base, exp-1));
        }else{
            return 1;
        }
    }
}