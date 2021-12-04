import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Frame for demonstrate dialog message 
 * 
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/
public class FrameDialog extends JFrame  {

  JPanel panel = new JPanel();
  
  /** 
  * ...Constructor for sets parameters of FrameDialog...
  */
  public FrameDialog() {
    setTitle("Dialog Frame");
    setSize(400, 150);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    JMenuBar about = new JMenuBar();
    JMenuItem help = new JMenuItem("Help");
    about.add(help);
    setJMenuBar(about);
    
    help.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        DialogAbout dialog = new DialogAbout();
        dialog.setVisible(true);
      }
    });
    
    panel.setLayout(new GridLayout(2, 2));
    
    JButton btnError = new JButton("Error");
    JButton btnWarning = new JButton("Warning");

    btnError.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        JOptionPane.showMessageDialog(panel, "Could not open file", 
            "Error", JOptionPane.ERROR_MESSAGE);
      }
    });
    btnWarning.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        JOptionPane.showMessageDialog(panel, "A deprecated call", 
            "Warning", JOptionPane.WARNING_MESSAGE);
      }
    });

    JButton btnQuestion = new JButton("Question");
    JButton btnInfo = new JButton("Information");

    btnQuestion.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        JOptionPane.showMessageDialog(panel, "Are you sure  to quit?", 
            "Question", JOptionPane.QUESTION_MESSAGE);
      }
    });
    btnInfo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        JOptionPane.showMessageDialog(panel, "Download completed", 
            "Message", JOptionPane.INFORMATION_MESSAGE);
      }
    });
    
    panel.add(btnError);
    panel.add(btnWarning);
    panel.add(btnQuestion);
    panel.add(btnInfo);
    add(panel);
  }
}  
