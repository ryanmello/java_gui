import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame implements ChangeListener{
  JFrame frame;
  JPanel panel;
  JLabel label;
  JSlider slider;
  
  MyFrame() {
    frame = new JFrame("Slider Demo");
    panel = new JPanel();
    label = new JLabel();
    slider = new JSlider(0, 100, 50);

    slider.setPreferredSize(new Dimension(400, 200));

    slider.setPaintTicks(true);
    slider.setMinorTickSpacing(5);
    slider.setPaintTrack(true);
    slider.setMajorTickSpacing(25);
    slider.setPaintLabels(true);
    slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
    slider.setOrientation(SwingConstants.VERTICAL);
    label.setText("°C = "+slider.getValue());
    slider.addChangeListener(this);
    panel.add(slider);
    panel.add(label);
    frame.add(panel);
    frame.setSize(400, 400);
    frame.setVisible(true);
    
  }
  
  @Override
  public void stateChanged(ChangeEvent e){
    label.setText("°C = "+slider.getValue());
  }
}