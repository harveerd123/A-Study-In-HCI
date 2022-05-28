package guidemo;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelpWindow {

  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void HelpPage() {
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
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JButton btnBack = new JButton("BACK");
    btnBack.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        GUI gui = new GUI();
        frame.setVisible(false);
      }
    });
    frame.getContentPane().add(btnBack, BorderLayout.NORTH);
  }

}
