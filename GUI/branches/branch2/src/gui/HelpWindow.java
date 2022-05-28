package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class HelpWindow {

  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          HelpWindow window = new HelpWindow();
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
  public HelpWindow() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.getContentPane().setBackground(Color.RED);
    
    JLabel lblHelp = new JLabel("HELP");
    lblHelp.setHorizontalAlignment(SwingConstants.CENTER);
    lblHelp.setFont(new Font("Calibri", Font.BOLD, 20));
    frame.getContentPane().add(lblHelp, BorderLayout.NORTH);
    
    JLabel lblToAccessDb = new JLabel("To access Db and edit data please login.");
    lblToAccessDb.setHorizontalAlignment(SwingConstants.CENTER);
    lblToAccessDb.setFont(new Font("Calibri", Font.PLAIN, 14));
    frame.getContentPane().add(lblToAccessDb, BorderLayout.CENTER);
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
