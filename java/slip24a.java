import java.io.*;
class slip24a{
    public static void main(String args[]) throws IOException{
        FileReader fr = new FileReader("a.txt");
        FileWriter fw = new FileWriter("b.txt");
        int c;
        int letter=0;
        int space=0;
        int num=0;
        int other=0;
        while ((c=fr.read())!=-1){
          if(Character.isDigit(c)){
            num ++;
          }else if(Character.isLetter(c)){
            letter++;
          }else if(Character.isSpaceChar(c)){
            space++;
          }else{
              other ++;
          }
        }
        fw.write("Numbers : " + num + "\nLetters : "+letter+"\nSpace : "+space+"\nSpecial Characters : "+other);
        fr.close();
        fw.close();
    }
}