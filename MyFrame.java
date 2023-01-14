import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements ActionListener{
  
  JButton button;
  JCheckBox box;

  JRadioButton pizza;
  JRadioButton burger;
  JRadioButton hotdog;
  
  MyFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    pizza = new JRadioButton("Pizza");
    burger = new JRadioButton("Burger");
    hotdog = new JRadioButton("Hotdog");

    ButtonGroup group = new ButtonGroup();
    group.add(pizza);
    group.add(burger);
    group.add(hotdog);

    pizza.addActionListener(this);
    burger.addActionListener(this);
    hotdog.addActionListener(this);

    this.add(pizza);
    this.add(burger);
    this.add(hotdog);    
    this.pack();
    this.setVisible(true);
  }
  
  
  @Override
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == pizza){
      System.out.println("You ordered pizza");
    } else if(e.getSource() == burger){
      System.out.println("You ordered burger");
    } else if(e.getSource() == hotdog){
      System.out.println("You ordered hotdog");
    }
  }
}