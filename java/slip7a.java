import java.awt.*;
import java.awt.event.*;
public class slip7a extends Frame{
    public void paint(Graphics g){
        Font f = new Font("Georgia",Font.PLAIN,20);
        g.setFont(f);
        g.drawString("Dr D Y Patil College", 50, 70);
        setBackground(Color.RED);
    }
    public static void main(String args[]){
        slip7a sl = new slip7a();
        sl.setVisible(true);
        sl.setSize(200,300);
    }
}