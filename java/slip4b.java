import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class slip4b extends Applet implements ActionListener {
    public static final String[] TEXT = {"AC", "BSp", "%", "/", "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "RSET", "0", ".", "="};
    TextField t1;
    TextField t2;
    StringBuffer value = new StringBuffer();
    public void init() {
        Frame title = (Frame) this.getParent().getParent();
        title.setTitle("Simple Calculator");
        setLayout(null);
        t1 = new TextField("", 4);
        t1.setBounds(50, 10, 200, 50);
        add(t1);
        t2 = new TextField("", 4);
        t2.setBounds(50, 60, 200, 50);
        add(t2);
        int x = 50;
        int y = 115;
        int k = 1;
        Button b[] = new Button[20];
        for (int i = 0; i < TEXT.length; i++) {
            b[i] = new Button("" + TEXT[i]);
            b[i].setBounds(x * k, y, 50, 50);
 
            if (k % 4 == 0) {
                x = 50;
                y += 50;
                k = 0;
            }
            k++;
            add(b[i]);
            b[i].addActionListener(this);
 
        }
    }
    public void paint(Graphics g) {
    }
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equalsIgnoreCase("=")) {
            System.out.println("generating result");
            t1.setText(calculate(value));
            value.setLength(0);
        } else if (s.equalsIgnoreCase("AC")) {
            System.out.println("AC: Resetting Input");
            value.setLength(0);
            t2.setText("");
        } else if (s.equalsIgnoreCase("BSp")) {
            System.out.println("BSp: Erasing a character");
            value.setLength(value.length() - 1);
            t2.setText(value.toString());
        } else if (s.equalsIgnoreCase("RSET")) {
            System.out.println("Reset: Resetting Input output ");
            value.setLength(0);
            t1.setText("");
            t2.setText("");
        } else {
            value.append(s);
            t2.setText(value.toString());
        }
    }
    public String calculate(StringBuffer sb) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        Object result = null;
        try {
            result = engine.eval(sb.toString());
            System.out.println(result);
        } catch (ScriptException ex) {
            System.out.println("Exception : Check again your operator sequence");
            result = "Error";
        }
        return result.toString();
    }
}