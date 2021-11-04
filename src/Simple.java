import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


/**
 * Example from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * page17.
 * Centering on the screen with buttons beep(make sounds) and menubar file-menu(close-item) 
 * and test-item
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
    setTitle("JMenuBar");
    setSize(400, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    toolkit = getToolkit();
    Dimension size = toolkit.getScreenSize();
    setLocation(size.width/2 - getWidth()/2,  size.height/2 - getHeight()/2);
    
    JPanel panel = new JPanel();
    getContentPane().add(panel);
    panel.setLayout(null);
    panel.setToolTipText("A Panel container");
    
    // Button beep
    JButton beep = new JButton("Beep");
    beep.setBounds(80, 60, 80, 40);
    beep.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            toolkit.beep();
        }
    });
    beep.setToolTipText("A Beep button");
    panel.add(beep);

    // JMenu file with close Item
    JMenu file = new JMenu("File");
    file.setMnemonic(KeyEvent.VK_F);

    ImageIcon icon = new ImageIcon("exit.png");
    JMenuItem fileClose = new JMenuItem("Close", icon);
    fileClose.setMnemonic(KeyEvent.VK_C);
    fileClose.setToolTipText("Exit application");
    fileClose.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    });
    file.add(fileClose);                                    // MenuItem to Menu         

    // JMenuItem test
    //    JMenu test = new JMenu("Test");
    JMenuItem testItem = new JMenuItem("Test");
    //    testItem.setMnemonic(KeyEvent.VK_T);                 // Does not work
    testItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Test");
        }
    });
    //    test.add(testItem);
    
    // Add file and test to menubar
    JMenuBar menubar = new JMenuBar();
    menubar.add(file);
    menubar.add(testItem);
    setJMenuBar(menubar);
  }
  
  /** 
  * ...main methode for creating example of frame...
  */
  public static void main(final String[] args) {
    Simple simple = new Simple();
    simple.setVisible(true);
  }
}
