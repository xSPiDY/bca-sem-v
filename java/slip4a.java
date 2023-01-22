import java.util.Scanner;
class slip4a {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter String : ");
            String str = sc.next();
            for(int i=0;i<str.length();i+=2) {
                System.out.print(" " + str.charAt(i));
            }
    }

}