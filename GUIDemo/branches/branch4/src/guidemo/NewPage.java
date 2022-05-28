package guidemo;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class NewPage {

  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void newWindow() {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          NewPage window = new NewPage();
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
  public NewPage() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JLabel lblWelcomeToNew = new JLabel("WELCOME TO NEW PAGE!");
    lblWelcomeToNew.setHorizontalAlignment(SwingConstants.CENTER);
    frame.getContentPane().add(lblWelcomeToNew, BorderLayout.NORTH);
  }

}
