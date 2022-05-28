package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * This is the first window of the GUI(initial) program.
 * @author Harveer Dole
 * WindowBuilder used to implement template of window, code and design.
 */
public class MainPage {

  private JFrame frame;

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
   * Image Link : https://iconarchive.com/show/small-n-flat-icons-by-paomedia/device-laptop-icon.html
   */
  private void initialize() {
    frame = new JFrame();
    frame.getContentPane().setBackground(Color.BLUE);
    frame.setBounds(50, 50, 650, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    
    JLabel lblWelcomeToThe = new JLabel("Welcome to the Db!");
    lblWelcomeToThe.setFont(new Font("Calibri", Font.BOLD, 24));
    frame.getContentPane().add(lblWelcomeToThe);
    
    ImageIcon image = new ImageIcon(getClass().getResource("/icon.png"));
    JLabel label = new JLabel(image);
    frame.getContentPane().add(label);
    
    JButton btnLogin = new JButton("Login");
    btnLogin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        LoginWindow.LoginPage();
        frame.setVisible(false);
      }
    });
    frame.getContentPane().add(btnLogin);
    
    
  }

}
