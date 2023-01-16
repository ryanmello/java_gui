import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener{
  JMenuItem loadItem;
  JMenuItem saveItem;
  JMenuItem exitItem;
  
  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(new FlowLayout());
    
    JMenuBar menu = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");

    loadItem = new JMenuItem("Load");
    saveItem = new JMenuItem("Save");
    exitItem = new JMenuItem("Exit");

    loadItem.addActionListener(this);
    saveItem.addActionListener(this);
    exitItem.addActionListener(this);

    loadItem.setMnemonic(KeyEvent.VK_L);
    saveItem.setMnemonic(KeyEvent.VK_S);
    exitItem.setMnemonic(KeyEvent.VK_E);

    fileMenu.add(loadItem);
    fileMenu.add(saveItem);
    fileMenu.add(exitItem);
    
    menu.add(fileMenu);
    menu.add(editMenu);
    menu.add(helpMenu);
    
    this.setJMenuBar(menu);
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == loadItem){
      System.out.println("Loading...");
    } else if(e.getSource() == saveItem){
      System.out.println("Saving...");
    } else if(e.getSource() == exitItem){
      System.exit(0);
    }
  }
}