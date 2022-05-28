package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class DbWindow {

  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void dbPage() {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          DbWindow window = new DbWindow();
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
  public DbWindow() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
