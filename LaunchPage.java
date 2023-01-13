import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LaunchPage implements ActionListener{

  JFrame frame = new JFrame();
  JButton button = new JButton("CLick ME!");

  
  LaunchPage() {
    button.setBounds(100, 100, 200, 100);
    button.setFocusable(false);
    button.addActionListener(this);
    
    frame.add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLayout(null);
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == button){
      frame.dispose();
      NewWindow myWindow = new NewWindow();
    }
  }
}