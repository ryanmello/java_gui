import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
  MyFrame(){
    this.setTitle("JFrame Title"); // sets title of frame
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
    this.setResizable(false); // prevent resizing
    this.setSize(420, 420); // sets the size of the frame
    this.setVisible(true); // makes the frame visible

    ImageIcon image = new ImageIcon("./img/sbf.jpg"); // create image icon
    this.setIconImage(image.getImage()); // change icon of frame
    this.getContentPane().setBackground(new Color(125, 50, 250)); // change color of background
  }
}