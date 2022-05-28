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
    frame.getContentPane().setBackground(Color.BLUE);
    frame.setBounds(100, 100, 350, 200);
    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
    
    JLabel lblUser = new JLabel("User");
    lblUser.setFont(new Font("Calibri", Font.BOLD, 20));
    lblUser.setBounds(35, 43, 46, 22);
    frame.getContentPane().add(lblUser);
    
    JLabel lblPassword = new JLabel("Password");
    lblPassword.setFont(new Font("Calibri", Font.BOLD, 20));
    lblPassword.setBounds(35, 88, 83, 22);
    frame.getContentPane().add(lblPassword);
    
    TextField userText = new TextField();
    userText.setBounds(128, 43, 126, 22);
    frame.getContentPane().add(userText);
    
    passwordText = new JPasswordField();
    passwordText.setBounds(128, 87, 126, 22);
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
    btnLogin.setBounds(65, 134, 89, 23);
    frame.getContentPane().add(btnLogin);
    
    JButton btnExitButton = new JButton("Exit");
    btnExitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        frame.dispose();
        MainPage window = new MainPage();
        window.main(null);
      }
    });
    btnExitButton.setBounds(174, 134, 89, 23);
    frame.getContentPane().add(btnExitButton);
  }
}
