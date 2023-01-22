import java.io.*;
import java.util.Scanner;
class slip21a{
    public static void main(String args[]) throws IOException{
        FileReader fr = new FileReader("a.txt");
        FileWriter fw = new FileWriter("b.txt");
        try (Scanner dr = new Scanner(fr)) {
            while(dr.hasNextLine()){
                String s=dr.nextLine();
                StringBuffer buffer = new StringBuffer(s);
                buffer=buffer.reverse();
                String ans = buffer.toString();
                fw.write(ans);
            }
        }catch(Exception e){
            System.out.print("Error...!");
        }
        fr.close();
        fw.close();
    }
}