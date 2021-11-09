import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 * Inspired from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * panel with buttons beep that make sounds
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/

public class TestItem extends JMenuItem {
  
  /** 
  * ...Constructor for sets parameters of JFrame...
  */
  
  public TestItem() {
      
    this.setText("Test");
    this.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Test");
        }
    });
      
  }
}
