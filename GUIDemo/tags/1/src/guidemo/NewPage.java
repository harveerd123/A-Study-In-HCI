package guidemo;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


/**
 * This is the NewPage window, accessed by pressing Login button from GUI window.
 * @author Harveer Dole
 * WindowBuilder used to implement template of window, code and design.
 */
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
    
    JLabel lblWelcomeToNew = new JLabel("WELCOME TO NEW PAGE!");
    lblWelcomeToNew.setHorizontalAlignment(SwingConstants.CENTER);
    frame.getContentPane().add(lblWelcomeToNew, BorderLayout.NORTH);
  }

}
