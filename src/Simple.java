import java.awt.BorderLayout;
//import java.awt.Dimension;
//import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//import javax.swing.JPanel;
//import javax.swing.JPopupMenu;
//import javax.swing.JToolBar;
//import javax.swing.KeyStroke;
//import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;

/**
 * Example from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * page28.
 * Centering on the screen with buttons beep(make sounds) and menubar file(with items, submenus) 
 * and test-item and checkBoxmenuItem view and PopMenu(that show when released right button Mouse)
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/
public class Simple extends JFrame {
  
  private JLabel statusBar = new JLabel(" Show status");
  Panel panel = new Panel();
  MenuFile file = new MenuFile();
  Toolbar toolbar = new Toolbar();
  TestItem testItem = new TestItem();
  
  /** 
  * ...Constructor for sets parameters of JFrame...
  */
  
  public Simple() {
    setTitle("JToolBar");
    setSize(400, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    getContentPane().add(panel);

    statusBar.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
    add(statusBar, BorderLayout.SOUTH);
    

    JMenu view = new JMenu("View");
    view.setMnemonic(KeyEvent.VK_V);
    JCheckBoxMenuItem sbar = new JCheckBoxMenuItem("Show statusbar");
    sbar.setState(true);
    
    sbar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
          if (statusBar.isVisible()) {
              statusBar.setVisible(false);
          } else {
              statusBar.setVisible(true);
          }
        }
    });
    view.add(sbar);

    add(toolbar, BorderLayout.WEST);
    
    // Add file and test to menubar
    JMenuBar menubar = new JMenuBar();
    menubar.add(file);
    menubar.add(view);
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
