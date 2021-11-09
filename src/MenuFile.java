import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * Inspired from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * panel with buttons beep that make sounds
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/

public class MenuFile extends JMenu {
  
  /** 
  * ...Constructor for sets parameters of JFrame...
  */
  
  public MenuFile() {
    
    this.setText("File");
    this.setMnemonic(KeyEvent.VK_F);

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
    this.add(fileNew);                                      //  
    this.add(fileOpen);                                     // 
    this.add(fileSave);                                     // 
    this.addSeparator();
    this.add(imp);                                     // 
    this.addSeparator();
    this.add(fileClose);                                    // MenuItem to Menu         

  }
}
