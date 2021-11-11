import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 * Inspired from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * panel with buttons beep that make sounds
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/

public class PanelToolbox extends JPanel {
    
  ToolbarExit toolbarExit = new ToolbarExit();
  Toolbar toolbar = new Toolbar();
  
  /** 
  * ...Constructor for sets parameters of JPanel...
  */
  public PanelToolbox() {
    
    //this.setSize(400, 50);
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.add(toolbarExit);
    this.add(toolbar);
  }
}
