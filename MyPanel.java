import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MyPanel extends JPanel {
  MyPanel() {
    this.setPreferredSize(new Dimension(500, 500));
  }

  public void paint(Graphics g){
    Graphics2D g2D = (Graphics2D) g;

    g2D.setPaint(Color.blue);
    //g2D.setStroke(new BasicStroke(5));
    //g2D.drawLine(0, 0, 500, 500);

    //g2D.setPaint(Color.pink);
    //g2D.fillRect(0, 0, 100, 200);
    //g2D.drawRect(0, 0, 100, 200);

    //g2D.fillOval(0, 0, 100, 100);

    // g2D.setPaint(Color.red);
    // g2D.fillArc(0, 0, 100, 100, 0, 180);
    // g2D.setPaint(Color.white);
    // g2D.fillArc(0, 0, 100, 100, 180, 180);

    // int[] xPoints = {150, 250, 350};
    // int[] yPoints = {300, 150, 300};
    // g2D.drawPolygon(xPoints, yPoints, 3);

    g2D.setFont(new Font(null, Font.BOLD, 50));
    g2D.drawString("WOOOOO", 50, 50);
  }
}