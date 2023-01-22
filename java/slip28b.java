import javax.swing.*;
public class slip28b {
    JFrame f;
    JTable j;
    slip28b(){
        f = new JFrame();
        f.setTitle("Employee Details");
        String data[][] = {
            {"1","Radhika Sapkal","50,000"},
            {"2","Ramesh Devakar","20,000"},
            {"3","Hardik Shrinivas","25,000"},
            {"4","Bhihari Kumar","20,000"},
            {"5","Swaraghini Pawar","15,000"},
        };
        String[] columnNames = {"Eno", "Ename", "Salary" };
        j = new JTable(data, columnNames);
        j.setBounds(30,40,200,300);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500,200);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        new slip28b();
    }
}