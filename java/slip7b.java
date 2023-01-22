import java.util.Scanner;
class Cricket{
    String Name;
    int Total_runs;
    int Notout;
    int Inning;
    float avg;
    void accept(){
        Scanner br = new Scanner(System.in);
            System.out.print("Enter Name of Player : ");
            Name = br.next();
            System.out.print("Enter Total Runs of Player : ");
            Total_runs = br.nextInt();
            System.out.print("Enter Name of Tixes Not out : ");
            Notout = br.nextInt();
            System.out.print("Enter Innings played by players : ");
            Inning = br.nextInt();
    }
    void average(){
        avg = Total_runs/Inning;
        System.out.println("Name : "+Name+"\nTotal runs : "+Total_runs+"\nAvergae : "+avg+"\nInning : "+ Inning);
    }
}
public class slip7b {
    public static void main(String args[]){
        float max =0;
        int n;
        Scanner br = new Scanner(System.in);
            System.out.print("How many Players : ");
            n = br.nextInt();
            Cricket ob1[]= new Cricket[n];
            for(int i=0; i<n; i++){
                ob1[i] = new Cricket();
                ob1[i].accept();
            }
            for(int i=0; i<n; i++){
                ob1[i].average();
            }
            for(int i=0; i<n; i++){
                if(max<ob1[i].avg){
                    max = ob1[i].avg;
                }
            }
            System.out.println("-----------------------------\nMax avg : "+max);
    }
}