package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainPage {

  private JFrame frame;
  private JPanel panel;
  JLabel label;
  JLabel label2;
  JButton button;
  ImageIcon image;
  JButton button2;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MainPage window = new MainPage();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public MainPage() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(50, 50, 800, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
    
    label = new JLabel("Welcome to the DB", SwingConstants.CENTER);
    label.setFont(new Font("Calibri", Font.BOLD, 20));
    
    button = new JButton("Login");
    button2 = new JButton("Help");
    
    image = new ImageIcon(getClass().getResource("/icon.png"));
    label2 = new JLabel(image);
    
    panel.add(label);
    panel.add(label2);
    panel.add(button);
    panel.add(button2);
    panel.setBackground(Color.RED);
    
    
    
    
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    
    
  }

}
