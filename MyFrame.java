import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements ActionListener{
  JComboBox box;
  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    String[] animals = {"dog", "cat", "bird"};
    box = new JComboBox(animals);
    box.addActionListener(this);

    //box.getItemCount();
    //System.out.println(box.getItemCount());
    box.addItem("horse");
    box.insertItemAt("pig", 0);
    box.setSelectedIndex(0);
    //System.out.println(box.getItemCount());
    box.removeItem("cat");
    //System.out.println(box.getItemCount());
    box.removeItemAt(0);
    box.removeAll();
    
    
    this.add(box);
    this.pack();
    this.setVisible(true);
  }
  
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == box){
      //System.out.println(box.getSelectedItem());
      System.out.println(box.getSelectedIndex());
    }
  }
}