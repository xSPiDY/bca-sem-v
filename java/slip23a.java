import java.io.*;
import java.util.*;
public class slip23a {
   public static void main(String[] args) {
      Scanner  br = new Scanner(System.in);
      try {
         System.out.print("Enter File Name : ");
         String str = br.nextLine();
         File file = new File(str);
         if(file.isHidden()){
            System.out.println("File is Hidden");
         }else{
            System.out.println("File Location : " +file.getAbsolutePath());
         }
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}