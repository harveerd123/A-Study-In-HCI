package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.TextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class LoginWindow {

  private JFrame frame;
  private JPasswordField passwordText;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          LoginWindow window = new LoginWindow();
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
  public LoginWindow() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.getContentPane().setBackground(Color.RED);
    frame.setBounds(100, 100, 300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel lblUser = new JLabel("User");
    lblUser.setFont(new Font("Calibri", Font.BOLD, 13));
    lblUser.setBounds(32, 51, 46, 14);
    frame.getContentPane().add(lblUser);
    
    JLabel lblPassword = new JLabel("Password");
    lblPassword.setFont(new Font("Calibri", Font.BOLD, 13));
    lblPassword.setBounds(32, 92, 61, 14);
    frame.getContentPane().add(lblPassword);
    
    TextField userText = new TextField();
    userText.setBounds(96, 43, 126, 22);
    frame.getContentPane().add(userText);
    
    passwordText = new JPasswordField();
    passwordText.setBounds(96, 86, 126, 22);
    frame.getContentPane().add(passwordText);
    
    JButton btnLogin = new JButton("Login");
    btnLogin.setBounds(32, 134, 89, 23);
    frame.getContentPane().add(btnLogin);
  }
}
