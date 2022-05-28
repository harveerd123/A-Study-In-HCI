package guidemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GUI {
  JFrame frame;
  JPanel panel;
  JLabel label;
  JLabel label2;
  JButton button;
  ImageIcon image;
  JButton button2;
  
  public GUI() {
    
    frame = new JFrame();
    panel = new JPanel();
    label = new JLabel("Welcome to my GUI", SwingConstants.CENTER);
    label.setFont(new Font("Calibri", Font.BOLD, 20));
    button = new JButton("Login");
    image = new ImageIcon(getClass().getResource("/icon.png"));
    label2 = new JLabel(image);
    button2 = new JButton("Help");
    
    panel.setBorder(BorderFactory.createEmptyBorder(100, 70, 100, 70));
    //panel.setLayout(new GridLayout(0, 1));
    panel.add(label);
    panel.add(label2);
    panel.setBackground(Color.GREEN);
    panel.add(label2);
    panel.add(button);
    panel.add(button2);
    
    
    
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
