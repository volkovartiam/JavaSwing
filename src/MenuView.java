import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;

public class MenuView extends JMenu {

  public MenuView() {
    
    this.setText("View");
    this.setMnemonic(KeyEvent.VK_V);
    JCheckBoxMenuItem sbar = new JCheckBoxMenuItem("Show statusbar");
    sbar.setState(true);
    
    sbar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
/*          if (statusBar.isVisible()) {
              statusBar.setVisible(false);
          } else {
              statusBar.setVisible(true);
          }
   */     }
    });
    this.add(sbar);

  }
}
