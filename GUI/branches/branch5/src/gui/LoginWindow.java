package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Window;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow {

  JFrame frame;
  private JPasswordField passwordText;

  /**
   * Launch the application.
   */
  public static void LoginPage() {
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
    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    btnLogin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (userText.getText().equals("user") && passwordText.getText().equals("password")) {
          JOptionPane.showMessageDialog(frame, "You have logged in successfully");
          frame.setVisible(false);
          DbWindow db = new DbWindow();
          db.dbPage();
          
          
        }   else {
          JOptionPane.showMessageDialog(frame, "Incorrect user or password, please try again.");
        }
      }
    });
    btnLogin.setBounds(32, 134, 89, 23);
    frame.getContentPane().add(btnLogin);
    
    JButton btnExitButton = new JButton("Exit");
    btnExitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        MainPage window = new MainPage();
        window.main(null);
      }
    });
    btnExitButton.setBounds(149, 134, 89, 23);
    frame.getContentPane().add(btnExitButton);
  }
}
