import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewWindow {

  JFrame frame = new JFrame();
  JLabel label = new JLabel("Hello");

  NewWindow() {

    label.setBounds(0, 0, 150, 50);
    label.setFont(new Font(null, Font.PLAIN, 25));
    frame.add(label);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}