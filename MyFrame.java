import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements ActionListener{
  
  JButton button;
  JTextField textField;
  
  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton("Submit");
    button.addActionListener(this);

    textField = new JTextField();
    textField.setPreferredSize(new Dimension(250, 40));
    textField.setFont(new Font("Consolas", Font.BOLD, 35));
    textField.setForeground(Color.blue);
    textField.setBackground(Color.red);
    textField.setCaretColor(Color.white);
    textField.setText("Username");
    
    this.add(button);
    this.add(textField);
    this.pack();
    this.setVisible(true);
  }
  
  
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button){
      System.out.println(textField.getText());
    }
  }
}