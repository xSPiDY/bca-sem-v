import java.io.DataInputStream;
class slip10a {
    public static void main(String args[]){
        int i, j;
        String ch;
        DataInputStream dr = new DataInputStream(System.in);
        try {
            System.out.print("Enter String : ");
            ch = dr.readLine();
            int[] str = new int[ch.length()];
            char string[] = ch.toCharArray();
            for(i = 0; i <ch.length(); i++) {
                str[i] = 1;
                for(j = i+1; j <ch.length(); j++) {
                    if(string[i] == string[j]) {
                        str[i]++;
                        string[j] = '0';
                    }
                }
            }
            for(i = 0; i <str.length; i++) {
                if(string[i] != ' ' && string[i] != '0'){
                    System.out.println(string[i] + "-" + str[i]);
                }
            }
        } catch (Exception e) {}
    }
}