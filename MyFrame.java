import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MyFrame extends JFrame implements KeyListener{

  JLabel label;
  
  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setLayout(null);
    this.addKeyListener(this);

    label = new JLabel();
    label.setBounds(0, 0, 100, 100);
    label.setBackground(Color.red);
    label.setOpaque(true);

    this.getContentPane().setBackground(Color.black);
    this.add(label);
    this.setVisible(true);
  }

  @Override
  public void keyTyped(KeyEvent e){
    switch(e.getKeyChar()){
      case 'w': label.setLocation(label.getX(), label.getY() - 10);
        break;
      case 'a': label.setLocation(label.getX() - 10, label.getY());
        break;
      case 's': label.setLocation(label.getX(), label.getY() + 10);
        break;
      case 'd': label.setLocation(label.getX() + 10, label.getY());
        break;
    }
  }

  public void keyPressed(KeyEvent e){
    switch(e.getKeyCode()){
      case 38: label.setLocation(label.getX(), label.getY() - 10); // 87
        break;
      case 37: label.setLocation(label.getX() - 10, label.getY()); // 65
        break;
      case 40: label.setLocation(label.getX(), label.getY() + 10); // 83
        break;
      case 39: label.setLocation(label.getX() + 10, label.getY()); // 68
        break;
    }
  }

  public void keyReleased(KeyEvent e){
    //System.out.println("You released key character: " + e.getKeyChar());
    System.out.println("You released key code: " + e.getKeyCode());
  }
}