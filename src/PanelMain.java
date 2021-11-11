import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;


/**
 * Inspired from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * panel with buttons beep that make sounds
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/

public class PanelMain extends JPanel {

  private Toolkit toolkit;
  
  /** 
  * ...Constructor for sets parameters of JPanel...
  */
  
  public PanelMain() {

    toolkit = getToolkit();
    this.setLayout(null);
    this.setToolTipText("A Panel container");
  
    // Button beep
    JButton beep = new JButton("Beep");
    beep.setBounds(80, 60, 80, 40);
    beep.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
          toolkit.beep();
      }
    });
    beep.setToolTipText("A Beep button");
    this.add(beep);
    
    // JPopupMenu beep
    JPopupMenu menuPop = new JPopupMenu();
    JMenuItem menuItemBeep = new JMenuItem("Beep");
    menuItemBeep.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
          toolkit.beep();
      }
    });
    
    menuPop.add(menuItemBeep);
    
    this.addMouseListener(new MouseAdapter() {
      public void mouseReleased(MouseEvent event) {
          if (event.getButton() == event.BUTTON3) {
              menuPop.show(event.getComponent(), event.getX(), event.getY());
          }
      }
    });
    
  }
}
