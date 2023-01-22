import java.awt.event.*;
import javax.swing.*;
public class slip23b extends JFrame implements ActionListener{
    public static void main(String s[]){
        new slip23b();
    }
    public slip23b(){
        this.setSize(600,500);
        this.setLocation(200,200);
        JMenuBar menuBar = new JMenuBar();
        JMenu filMenu = new JMenu("File");
        JMenu filEdit = new JMenu("Edit");
        JMenu filSearch = new JMenu("Search");
        JMenuItem OpenItem = new JMenuItem("Open");
        JMenuItem SaveItem = new JMenuItem("Save");
        JMenuItem QuitItem = new JMenuItem("Quit");
        JMenuItem UndoItem = new JMenuItem("Undo");
        JMenuItem RedoItem = new JMenuItem("Redo");
        JMenuItem CutItem = new JMenuItem("Cut");
        JMenuItem CopyItem = new JMenuItem("Copy");
        JMenuItem PasteItem = new JMenuItem("Paste");
        ImageIcon OpenIcon = new ImageIcon("icons/open.png");
        ImageIcon SaveIcon = new ImageIcon("icons/Save.png");
        ImageIcon QuitIcon = new ImageIcon("icons/Delete.png");
        ImageIcon UndoIcon = new ImageIcon("icons/Undo.png");
        ImageIcon RedoIcon= new ImageIcon("icons/Redo.png");
        ImageIcon CutIcon = new ImageIcon("icons/Cut.png");
        ImageIcon CopyIcon = new ImageIcon("icons/Copy.png");
        ImageIcon PasteIcon = new ImageIcon("icons/Past.png");
        filMenu.add(OpenItem);
        filMenu.add(SaveItem);
        filMenu.add(QuitItem);
        filEdit.add(UndoItem);
        filEdit.add(RedoItem);
        filEdit.add(CutItem);
        filEdit.add(CopyItem);
        filEdit.add(PasteItem);
        OpenItem.setIcon(OpenIcon);
        SaveItem.setIcon(SaveIcon);
        QuitItem.setIcon(QuitIcon);
        UndoItem.setIcon(UndoIcon);
        RedoItem.setIcon(RedoIcon);
        CutItem.setIcon(CutIcon);
        CopyItem.setIcon(CopyIcon);
        PasteItem.setIcon(PasteIcon);
        menuBar.add(filMenu);
        menuBar.add(filEdit);
        menuBar.add(filSearch);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    }
}