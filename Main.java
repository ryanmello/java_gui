import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class Main {  
  public static void main(String[] args) {
    // MyFrame myFrame = new MyFrame();

    ImageIcon image = new ImageIcon("./img/sbf.jpg");
    Border border = BorderFactory.createLineBorder(Color.green, 3);

    JLabel label = new JLabel();
    label.setText("Bro, do you even code?"); // set text of label
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER); 
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(Color.red);
    label.setFont(new Font("MV Boli", Font.PLAIN, 20));
    label.setIconTextGap(10); // set gap of text to image
    label.setBackground(Color.black); // set background color
    label.setOpaque(true); // display background color
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon and text
    label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon and text
    //label.setBounds(100, 100, 250, 250); // set x and y position within frame
    
    

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //frame.setSize(500, 500);
    //frame.setLayout(null);
    frame.setVisible(true);
    frame.add(label);
    frame.pack();
  }
}
