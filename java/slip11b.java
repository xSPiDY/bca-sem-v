import java.awt.*;
import java.applet.*;
public class Slip11B extends Applet{
    public float R,G,B;
    Graphics gl;
    public void init(){
        repaint();
    }
    public void paint(Graphics g){
        R = (float)Math.random();
        G = (float)Math.random();
        B = (float)Math.random();
        Color cl = new Color(R,G,B);
            g.drawRect(0,250,290,290);
            g.drawLine(125,250,125,160);
            g.drawLine(175,250,175,160);
            g.drawArc(85,157,130,50,-65,312);
            g.drawArc(85,87,130,50,62,58);
            g.drawLine(85,177,119,89);
            g.drawLine(215,177,181,89);
            g.setColor(cl);
            g.fillArc(78,120,40,40,63,-174);
            g.fillOval(120,96,40,40);
            g.fillArc(173,100,40,40,110,180);
    }
}
/*
<applet code="Slip11B.class" width="300" height="300">
</applet>
*/