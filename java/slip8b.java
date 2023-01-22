import java.io.File;
class slip8b {
    public static void main(String[] args) {
        File file = new File("D:\\User\\Programs\\Java");
        String[] fileList = file.list();
        for(String str : fileList) {
            if(str.endsWith(".txt")){
                System.out.println(str);
            }
        }
    }
}