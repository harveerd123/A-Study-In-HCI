package guidemo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
  JFrame frame;
  JPanel panel;
  
  public GUI() {
    
    frame = new JFrame();
    panel = new JPanel();
    
    panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
    panel.setLayout(new GridLayout(0, 1));
    
    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Welcome to my GUI Demo");
    frame.pack();
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    new GUI();

  }

}
