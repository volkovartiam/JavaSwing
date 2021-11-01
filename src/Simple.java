import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Example from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * page10.
 * Centering on the screen with buttons beep(make sounds) and close(exit frame)
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/
public class Simple extends JFrame {
  

  private Toolkit toolkit;

  /** 
  * ...Constructor for sets parameters of JFrame...
  */
  public Simple() {
    setTitle("Buttons");
    setSize(400, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    toolkit = getToolkit();
    Dimension size = toolkit.getScreenSize();
    setLocation(size.width/2 - getWidth()/2,  size.height/2 - getHeight()/2);
    
    JPanel panel = new JPanel();
    getContentPane().add(panel);
    
    panel.setLayout(null);
    
    JButton beep = new JButton("Beep");
    beep.setBounds(80, 60, 80, 40);
    beep.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            toolkit.beep();
        }
    });
    
    JButton close = new JButton("Close");
    close.setBounds(200, 60, 80, 40);
    close.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    });
    
    panel.add(beep);
    panel.add(close);
  }
  
  /** 
  * ...main methode for creating example of frame...
  */
  public static void main(final String[] args) {
    Simple simple = new Simple();
    simple.setVisible(true);
  }
}
