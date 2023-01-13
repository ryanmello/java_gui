import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Main {  
  public static void main(String[] args) {

    //JOptionPane.showMessageDialog(null, "Hello", "the title", JOptionPane.PLAIN_MESSAGE);
    //JOptionPane.showMessageDialog(null, "Hello", "the title", JOptionPane.INFORMATION_MESSAGE);
    //JOptionPane.showMessageDialog(null, "Hello", "the title", JOptionPane.QUESTION_MESSAGE);
    //JOptionPane.showMessageDialog(null, "Hello", "the title", JOptionPane.WARNING_MESSAGE);
    //JOptionPane.showMessageDialog(null, "H!", "the title", JOptionPane.ERROR_MESSAGE);

    //int answer = JOptionPane.showConfirmDialog(null, "hello", "title", JOptionPane.YES_NO_CANCEL_OPTION);
    //System.out.println(answer);

    // String name = JOptionPane.showInputDialog("What is your name?");
    // System.out.println(name);

    String[] responses = {"No, youre awesome", "thank you", "*blush"};

    JOptionPane.showOptionDialog(
      null, "message", "title", JOptionPane.YES_NO_CANCEL_OPTION, 
      JOptionPane. INFORMATION_MESSAGE, null, responses, 0
    );
  }
}
