import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class slip26b extends Applet{
    public void init() {
       setBackground(Color.BLACK);
    }
public void paint(Graphics g){
    g.setColor(Color.WHITE);
    g.drawRect(100, 150, 90, 120);
    g.drawRect(130, 230, 20, 40);
    g.drawLine(150, 100, 100, 150);
    g.drawLine(150, 100, 190, 150);
    g.drawLine(150, 50, 150, 100);
    g.setColor(Color.ORANGE);
    g.drawRect(150, 50, 20, 20);
}
}
/*
<applet code="Slip26B.class" width="300" height="300">
</applet>
*/