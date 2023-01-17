import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MyFrame extends JFrame{
  
  MyPanel panel;
  
  MyFrame() {
    
    panel = new MyPanel();
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(panel);
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }
}