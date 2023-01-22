import java.io.*;
import java.util.*;
class slip22b {
    public static void main(String args[]) throws IOException{
        Scanner  br = new Scanner(System.in);
        System.out.println("1. Press 1 Create File\n2. Press 2 Rename a File\n3. Press 3 Delete a File\n4. Press 4 Display Path of a File");
        System.out.print("Enter File Name : ");
        String str = br.nextLine();
        File file = new File(str);
        System.out.print("Enter Number : ");
        int num = br.nextInt();
        switch(num){
            case 1 :
                if (file.createNewFile()) {
                    System.out.println("File created : " + file.getName());
                } else {
                    System.out.println("File already exists.");
                }
            case 2 :
                System.out.print("Enter New File Name : ");
                String newone = br.nextLine();
                File newfile =new File(newone);
                if(file.renameTo(newfile)){
                    System.out.println("File renamed");
                }else{
                    System.out.println("Sorry! the file can't be renamed");
                }
            break;
            case 3 :
                if (file.delete()) {
                    System.out.println("Deleted the file: " + file.getName());
                } else {
                    System.out.println("Failed to delete the file.");
                }
            break;
            case 4 :
                System.out.println("File Location : " +file.getAbsolutePath());
            break;
            default :
            System.out.println("Wrong Number ..!");
            break;
        }
    }
}