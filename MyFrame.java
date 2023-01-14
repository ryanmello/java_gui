import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements ActionListener{
  
  JButton button;
  JCheckBox box;
  
  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());    

    button = new JButton();
    button.setText("Submit");
    button.addActionListener(this);

    box = new JCheckBox();
    box.setText("I am not a robot");
    box.setFocusable(false);
    box.setFont(new Font("Times New Roman", Font.PLAIN, 35));

    this.add(button);
    this.add(box);
    this.pack();
    this.setVisible(true);
  }
  
  
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button){
      System.out.println(box.isSelected());
    }
  }
}