import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class slip12b extends Applet implements ActionListener{
    Button b1 = new Button("Show");
    List Multi = new List();
    String str ="";
    public void init(){
        Multi.add("1");
        Multi.add("2");
        Multi.add("3");
        Multi.add("4");
        Multi.add("5");
        Multi.add("6");
        Multi.add("7");
        Multi.add("8");
        Multi.add("9");
        Multi.add("10");
        add(Multi);
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g){
        int count = 100; 
        int num = Integer.parseInt(Multi.getSelectedItem());
        for(int i=1;i<=10;i++){
            int a = num*i;
            g.drawString(i  +" * " + i +" = "+ a,100,count);
            count = count+20;
           }
    }
    public void actionPerformed(ActionEvent e){
        repaint();
    }
}
/*
<applet code="Slip12B.class" width="300" height="300">
</applet>
*/