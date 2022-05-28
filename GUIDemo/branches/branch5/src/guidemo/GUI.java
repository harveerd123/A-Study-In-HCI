package guidemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

/**
 * This is the first window of the GUI proof of concept program.
 * @author Harveer Dole, bits of code/ideas provided by Alex Lee (youtube video).
 * Links used: https://www.youtube.com/watch?v=5o3fMLPY7qY, https://www.youtube.com/watch?v=iE8tZ0hn2Ws
 */

public class GUI {
  JFrame frame;
  JPanel panel;
  JLabel label;
  JLabel label2;
  JButton button;
  ImageIcon image;
  JButton button2;
  
  /**
   * method implements design and features for window.
   * Image Link : https://iconarchive.com/show/small-n-flat-icons-by-paomedia/device-laptop-icon.html
   */
  public GUI() {
    
    frame = new JFrame();
    panel = new JPanel();
    label = new JLabel("Welcome to my GUI", SwingConstants.CENTER);
    label.setFont(new Font("Calibri", Font.BOLD, 20));
    button = new JButton("Login");
    
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        NewPage.newWindow();
      }
    });
    
    image = new ImageIcon(getClass().getResource("/icon.png"));
    label2 = new JLabel(image);
    button2 = new JButton("Help");
    
    button2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        HelpWindow.HelpPage();
        frame.setVisible(false);
        
        
      }
    });
    
    panel.setBorder(BorderFactory.createEmptyBorder(100, 70, 100, 70));
    panel.add(label);
    panel.add(label2);
    panel.setBackground(Color.GREEN);
    panel.add(label2);
    panel.add(button);
    panel.add(button2);
    
    
    
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Welcome to my GUI Demo");
    frame.pack();
    frame.setVisible(true);
  }
  
  /**
   * Launches application.
   */
  public static void main(String[] args) {
    new GUI();
  }
  
}
