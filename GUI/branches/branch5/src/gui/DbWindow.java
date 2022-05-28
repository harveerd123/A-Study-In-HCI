package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DbWindow {

  private JFrame frame;
  private JTable table;
  public JTextField nameField;
  public JTextField textDepartment;

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
    frame.getContentPane().setBackground(Color.GREEN);
    frame.setBounds(50, 50, 550, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
    
    table = new JTable();
    table.setBackground(Color.GREEN);
    frame.getContentPane().add(table);
    
    DefaultTableModel model = new DefaultTableModel() {
    
      @Override
      public boolean isCellEditable(int row, int column) {
       return false;
      }
    };
    Object[] columns = { "Name", "Department" };
    model.setColumnIdentifiers(columns);
    model.addRow(new Object [] {"Name1", "IT" });
    table.setModel(model);
    
    JScrollPane sp = new JScrollPane(table);
    frame.getContentPane().add(sp);
    sp.getViewport().setBackground(Color.GREEN);
    
    JButton DeleteButton = new JButton("Delete");
    DeleteButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int SelectedRow = table.getSelectedRow();
        if (SelectedRow == -1) {
          JOptionPane.showMessageDialog(frame, "Please select a data row to delete");
        }   else {
        
        model.removeRow(SelectedRow);
        }
      }
    });
    DeleteButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
    frame.getContentPane().add(DeleteButton);
    
    JLabel lblName = new JLabel("Name");
    lblName.setHorizontalAlignment(SwingConstants.CENTER);
    frame.getContentPane().add(lblName);
    
    nameField = new JTextField();
    nameField.setAlignmentX(Component.LEFT_ALIGNMENT);
    frame.getContentPane().add(nameField);
    nameField.setColumns(10);
    
    JLabel lblDepartment = new JLabel("Department");
    frame.getContentPane().add(lblDepartment);
    
    textDepartment = new JTextField();
    textDepartment.setAlignmentX(Component.LEFT_ALIGNMENT);
    frame.getContentPane().add(textDepartment);
    textDepartment.setColumns(10);
    
    JButton AddButton = new JButton("Add");
    AddButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (nameField.getText().isEmpty() || textDepartment.getText().isEmpty()) {
          JOptionPane.showMessageDialog(frame, "Name or Department is empty, please input data");
        }   else {
        String text1 = nameField.getText();
        String text2 = textDepartment.getText();
        
        model.addRow(new Object []{text1, text2});
        nameField.setText("");
        textDepartment.setText("");
        }
      }
    });
    AddButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
    frame.getContentPane().add(AddButton);
  }

}
