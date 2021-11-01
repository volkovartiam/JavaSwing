
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * Example from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * page6.
 * Centering on the screen
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/
public class Simple extends JFrame {
  
  /** 
  * ...Constructor for sets parameters of JFrame...
  */
  public Simple() {
    setSize(400, 300);
    setTitle("Simple ");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    Toolkit toolkit = getToolkit() ;
    Dimension size = toolkit.getScreenSize();
    setLocation(size.width/2 - getWidth()/2 ,  size.height/2 - getHeight()/2   );
  }
  
  /** 
  * ...main methode for creating example of frame...
  */
  public static void main(final String[] args) {
    Simple simple = new Simple();
    simple.setVisible(true);
  }
}
