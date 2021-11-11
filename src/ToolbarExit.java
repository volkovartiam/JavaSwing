//import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
//import javax.swing.border.EtchedBorder;

/**
 * Inspired from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * panel with buttons beep that make sounds
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/

public class ToolbarExit extends JToolBar {
  
  /** 
  * ...Constructor for sets parameters of JPanel...
  */
  
  public ToolbarExit() {

    super(JToolBar.VERTICAL);
    
    ImageIcon iconClose = new ImageIcon("exit.png");
    //ImageIcon iconClose = new ImageIcon(getClass().getResource("exit.png"));  // dont work
    JButton exitJbtn = new JButton(iconClose);
    exitJbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        System.exit(0);
      }
    });
    
    this.add(exitJbtn);
    
  }
}
