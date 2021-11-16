import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * Inspired from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * panel with buttons beep that make sounds
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/

public class MyButton extends JButton implements ActionListener {
  
  public MyButton(String text) {
    super.setText(text);
    addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent e) {
    System.out.println("Text");
  }
}