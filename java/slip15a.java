import java.io.DataInputStream;
class slip15a{
    public static void main(String args[]){
        String arr[] = {"saurabh", "Sapkal", "Mahesh","priya"};
        int i,n=0;
        boolean a=false;
        DataInputStream dr = new DataInputStream(System.in);
        try {
            System.out.print("Enter String : ");
            String s= dr.readLine();
            for(i = 0; i < arr.length; i++)
            {
                if(arr[i].equals(s))
                {
                    n = i;
                    a = true;
                    break;
                }
            }
            if(a){
                System.out.println("arr" + "["+ i + "]");
            }else{
                System.out.println("not Found");
            }
        } catch (Exception e) {}
    }
}