import java.io.*;
class slip5b{
    public static void main(String args[]) throws Exception{
        for(int i=0;i<args.length;i++){
            File file=new File(args[i]);
            if(file.isFile()){
                String name = file.getName();
                if(name.endsWith(".txt")){
                    file.delete();
                    System.out.println("file is deleted " + file);
                }else{
                    System.out.println("File Name : " + name + "\nFile Location : " +file.getAbsolutePath()+"\nFile Size : "+file.length()+" bytes");
                }
            }
            else{
                System.out.println(args[i]+ "is not a file");
            }
        }
    }
}