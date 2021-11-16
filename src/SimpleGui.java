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
//import javax.swing.BoxLayout;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
//import javax.swing.JMenuItem;
//import javax.swing.JPanel;
//import javax.swing.JPopupMenu;
//import javax.swing.JToolBar;
//import javax.swing.KeyStroke;
import javax.swing.UIManager;
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
public class SimpleGui extends JFrame {
  
  PanelMain panel = new PanelMain();
  JLabel statusBarLbl = new JLabel(" Show status");
  
  MenuFile file = new MenuFile();
  JMenu view = new JMenu("View");
  TestItem testItem = new TestItem();
  PanelToolbox toolbar = new PanelToolbox();
  
  JTextPane txt = new JTextPane();
  JScrollPane scrollPane = new JScrollPane(txt);
  JPanel eventPanel = new JPanel(); 
  
  
  /** 
  * ...Constructor for sets parameters of JFrame...
  */
  
  public SimpleGui() {
    setTitle("Event object");
    setSize(400, 300);
    eventPanel.setSize(400, 100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    getContentPane().add(panel);
    
    statusBarLbl.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
    add(statusBarLbl, BorderLayout.SOUTH);
    add(toolbar, BorderLayout.EAST);
    
    // Add file, view and test to menubar
    JMenuBar menubar = new JMenuBar();
    menubar.add(file);
    setViewMenu();
    menubar.add(view);
    menubar.add(testItem);
    setJMenuBar(menubar);
    
    //scrollPane.setSize(200, 10);
    //add(eventPanel);
    //add(scrollPane);
    
  }
  
  /** 
  * ...main methode for creating example of frame...
  */
  public static void main(final String[] args) {
    
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
      System.out.println("Error" + e.getStackTrace());
    }

    var simple = new SimpleGui();
    simple.setVisible(true);
  }
  
  /** 
  * ...this methode add menu and control statusbar...
  */
  
  public void setViewMenu() {
    // JMenu view
    view.setMnemonic(KeyEvent.VK_V);
    JCheckBoxMenuItem sbar = new JCheckBoxMenuItem("Show statusbar");
    sbar.setState(true);
    
    sbar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
          if (statusBarLbl.isVisible()) {
              statusBarLbl.setVisible(false);
          } else {
              statusBarLbl.setVisible(true);
          }
        }
    });
    view.add(sbar);
    
  }
}



