import java.awt.BorderLayout;
//import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
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
  private Toolkit toolkit;
  /** 
  * ...Constructor for sets parameters of JFrame...
  */
  
  public Simple() {
    setTitle("JToolBar");
    setSize(400, 300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    toolkit = getToolkit();
    //    Dimension size = toolkit.getScreenSize();
    //    setLocation(size.width/2 - getWidth()/2,  size.height/2 - getHeight()/2);
    setLocationRelativeTo(null);
    
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

    ImageIcon iconClose = new ImageIcon("exit.png");
    JMenuItem fileClose = new JMenuItem("Close", iconClose);
    fileClose.setMnemonic(KeyEvent.VK_C);
    fileClose.setToolTipText("Exit application");
    fileClose.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    });
    fileClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
    
    ImageIcon iconNew = new ImageIcon("new.png");
    JMenuItem fileNew = new JMenuItem("New", iconNew);
    fileNew.setMnemonic(KeyEvent.VK_N);
    
    ImageIcon iconOpen = new ImageIcon("open.png");
    JMenuItem fileOpen = new JMenuItem("Open", iconOpen);
    fileOpen.setMnemonic(KeyEvent.VK_O);
    
    ImageIcon iconSave = new ImageIcon("save.png");
    JMenuItem fileSave = new JMenuItem("Save", iconSave);
    fileSave.setMnemonic(KeyEvent.VK_S);
    
    // Submenu import 
    JMenu imp = new JMenu("Import");
    imp.setMnemonic(KeyEvent.VK_M);
    
    JMenuItem newsf = new JMenuItem("Import newsfeedlist...");
    JMenuItem bookm = new JMenuItem("Import bookmarks...");
    JMenuItem mail = new JMenuItem("Import mail...");
    imp.add(newsf);
    imp.add(bookm);
    imp.add(mail);
    
    // Menu file
    file.add(fileNew);                                      //  
    file.add(fileOpen);                                     // 
    file.add(fileSave);                                     // 
    file.addSeparator();
    file.add(imp);                                     // 
    file.addSeparator();
    file.add(fileClose);                                    // MenuItem to Menu         
   
    // Label statusbar and view menu 
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

    // JMenuItem test
    JMenuItem testItem = new JMenuItem("Test");
    //    testItem.setMnemonic(KeyEvent.VK_T);                 // Does not work
    testItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Test");
        }
    });

    // JPopupMenu
    JPopupMenu menuPop = new JPopupMenu();
    JMenuItem menuItemBeep = new JMenuItem("Beep");
    menuItemBeep.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
          toolkit.beep();
      }
    });
    menuPop.add(menuItemBeep);
    panel.addMouseListener(new MouseAdapter() {
      public void mouseReleased(MouseEvent event) {
          if (event.getButton() == event.BUTTON3) {
              menuPop.show(event.getComponent(), event.getX(), event.getY());
          }
      }
    });
    
    // JToolbar
    JToolBar toolbar = new JToolBar();
    JButton exitJbtn = new JButton(iconClose);
    exitJbtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        System.exit(0);
      }
    });
    
    toolbar.add(exitJbtn);
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
