import java.awt.*;

import java.awt.event.*;
import java.io.*;
public class slip27b extends Frame implements ActionListener{
    Graphics g;
    List l;
    TextField t1;
    Button b1;
    Label l1;
    public slip27b(){
        this.setLayout(new FlowLayout());
        this.setSize(400,400);
        this.setVisible(true);
        l1 = new Label("Enter Directory ");
        t1 = new TextField(20);
        l = new List(10);
        b1 = new Button("Display");
        l1.setBounds(50,100,80,80);
        t1.setBounds(50,150,80,80);
        b1.setBounds(50,200,80,80);
        l.setBounds(50,300,100,100);
        add(l1);
        add(t1);
        add(b1);
        add(l);
       b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            try{
                String nm = t1.getText();
                File f1 = new File(nm + ":");
                String s1[]=f1.list();
                if(s1==null){
                    System.out.println("Dir not exist");
                }else{
                    for(int i=0; i<s1.length; i++){
                        l.add(s1[i]);
                    }
                }
            }catch(Exception ee){}
        }
    }
    public static void main(String args[]){
        new slip27b();
    }
}