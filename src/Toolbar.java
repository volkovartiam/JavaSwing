//import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
//import javax.swing.JMenuItem;
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

public class Toolbar extends JToolBar {
  
  /** 
  * ...Constructor for sets parameters of JPanel...
  */
  
  public Toolbar() {
    
    super(JToolBar.VERTICAL);

    ImageIcon iconNew = new ImageIcon("new.png");
    JButton newJbtn = new JButton(iconNew);
    newJbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        System.out.println("NEW");
      }
    });
    this.add(newJbtn);

    ImageIcon iconOpen = new ImageIcon("open.png");
    JButton openJbtn = new JButton(iconOpen);
    openJbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        System.out.println("OPEN");
      }
    });
    this.add(openJbtn);
    

    ImageIcon iconSave = new ImageIcon("save.png");

    JButton saveJbtn = new JButton(iconSave);
    saveJbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        System.out.println("SAVE");
      }
    });
    this.add(saveJbtn);

  }
}
