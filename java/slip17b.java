import java.io.*; 
class Product{
    String pname;
    int pid, qty;
    float price, total;
    void accept(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the producat Name : ");
            pname=br.readLine();
            System.out.println("Enter pid, qty and price : ");
            pid = Integer.parseInt(br.readLine());
            qty = Integer.parseInt(br.readLine());
            price = Float.parseFloat(br.readLine());
        } catch (Exception e) { }
    }
    void display(){
        total = qty*price;
        System.out.println("pid : " + pid + "\nProduct Nmae : "+pname+"\nQuantity : "+qty + "\nPrice : "+price+"\n Total Amount : "+total);
    }
}
class slip17b {
    public static void main(String args[]) throws IOException{
        int n;
        float to=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many Product you want to enter : ");
        n = Integer.parseInt(br.readLine());
        Product p1[]=new Product[n];
        for(int i=0; i<n; i++){
            p1[i]=new Product();
            p1[i].accept();
        }
        for(int i=0; i<n; i++){
            p1[i].display();
        }
        for(int i=0; i<n; i++){
            to=to+p1[i].total;
            System.out.println("Total Cost : "+to);
        }
    }
}