import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 * dialog message class
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/
public class DialogAbout extends JDialog  {
  
  /** 
   * ...Constructor for sets parameters of JFrame...
   * NOT!!! CENTERED BY SCREEN
  */
 
  public DialogAbout() {

    setTitle("Dialog Window");
    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

    setModalityType(ModalityType.APPLICATION_MODAL);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setSize(200, 200);

    add(Box.createRigidArea(new Dimension(0, 10)));
    ImageIcon icon = new ImageIcon("new.png"); 
    var lbl = new JLabel(icon);
    lbl.setAlignmentX(0.5f);
    add(lbl);

    add(Box.createRigidArea(new Dimension(0, 10)));
    var lblNotes = new JLabel("Notes 1.1");
    lblNotes.setAlignmentX(0.5f);
    add(lblNotes);

    add(Box.createRigidArea(new Dimension(0, 50)));
    var lblClose = new JLabel("Close");
    lblClose.setAlignmentX(0.5f);
    add(lblClose);
  }
}  
  

  




