import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements ActionListener{
  
  JButton button;
  JLabel label;
  
  MyFrame() {

    ImageIcon icon = new ImageIcon("./img/google.png");

    label = new JLabel();
    label.setIcon(icon);
    label.setBounds(150, 250, 150, 150);
    label.setVisible(false);
    
    button = new JButton();
    button.setBounds(100, 100, 250, 100);
    button.addActionListener(this);
    button.setText("Im a button!");
    button.setFocusable(false);
    //button.setIcon(icon);
    button.setVerticalAlignment(JButton.BOTTOM);
    button.setHorizontalAlignment(JButton.CENTER);
    button.setFont(new Font("Comic Sans", Font.BOLD, 25));
    button.setIconTextGap(-15);
    button.setForeground(Color.red);
    button.setBackground(Color.lightGray);
    button.setBorder(BorderFactory.createEtchedBorder());
    button.setEnabled(true);
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500, 500);
    this.setVisible(true);

    this.add(button);
    this.add(label);
  }
  
  
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button){
      //System.out.println("Hello World!");
      //button.setEnabled(false);
      label.setVisible(true);
    }
  }
}