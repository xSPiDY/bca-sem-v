import java.util.Scanner;
public class slip2a {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str1=sc.next();
        for(int i=0;i<str1.length();i++){
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' ||str1.charAt(i) == 'e' || str1.charAt(i) == 'u')
            {
                System.out.print(str1.charAt(i)+" ");              
            }
        }    
    }
}
