
import javax.swing.JFrame;


/**
 * Example from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * page4.
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
  }

  /** 
  * ...main methode for creating example of frame...
  */
  public static void main(final String[] args) {
    Simple simple = new Simple();
    simple.setVisible(true);
  }
}

    