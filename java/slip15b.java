import java.applet.Applet;

import java.awt.Graphics;

public class slip15b extends Applet{
public void paint(Graphics g){
    g.drawOval(80, 70, 150, 150);
    g.fillOval(120, 120, 15, 15);
    g.fillOval(170, 120, 15, 15);
    g.drawArc(130, 180, 50, 20, 180, 180);
 }
}
/*
<applet code="Slip15B.class" width="300" height="300">
</applet>
*/