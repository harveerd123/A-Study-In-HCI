package guidemo;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * This is the help window, accessed by pressing the help button from the GUI window.
 * @author Harveer Dole
 * WindowBuilder used to implement template of window, code and design.
 */
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
        new GUI();
        frame.setVisible(false);
      }
    });
    frame.getContentPane().add(btnBack, BorderLayout.NORTH);
  }

}
