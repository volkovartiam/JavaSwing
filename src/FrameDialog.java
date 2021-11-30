import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Frame for demonstrate dialog message 
 * 
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/
public class FrameDialog extends JFrame  {

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
  }
}  
  

  




