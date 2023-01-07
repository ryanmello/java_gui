import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {  
  public static void main(String[] args) {
    JFrame frame = new JFrame(); // creates frame
    frame.setTitle("JFrame Title"); // sets title of frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
    frame.setResizable(false); // prevent resizing
    frame.setSize(420, 420); // sets the size of the frame
    frame.setVisible(true); // makes the frame visible

    ImageIcon image = new ImageIcon("./img/sbf.jpg"); // create image icon
    frame.setIconImage(image.getImage()); // change icon of frame
    frame.getContentPane().setBackground(Color.pink); // change color of background

    
  }
}
