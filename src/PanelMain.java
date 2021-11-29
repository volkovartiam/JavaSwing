import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
//import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;


/**
 * Inspired from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * panel with buttons beep that make sounds
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/

public class PanelMain extends JPanel {

  private Toolkit toolkit;
  private JList list;
  private DefaultListModel model;
  Locale locale;
  PanelSpinner pnlSpin = new PanelSpinner();

  

  /** 
  * ...Constructor for sets parameters of JPanel...
  */
  
  public PanelMain() {

    toolkit = getToolkit();
    this.setLayout(null);
    this.setToolTipText("A Panel container");
    model = new DefaultListModel();
    model.addElement(" ID ");
    list = new JList(model);
    list.setBounds(110, 22, 227, 115);
    this.add(list);

    // Add panel with Spinner
    pnlSpin.setSize(230, 100);
    pnlSpin.setLocation(110, 160);
    this.add(pnlSpin);

    
    // Button beep
    JButton beep = new JButton("Beep_OK");
    beep.setBounds(20, 22, 80, 40);
    beep.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
          toolkit.beep();
          Date date = new Date();
          String s = DateFormat.getTimeInstance(DateFormat.MEDIUM, 
              locale.getDefault()).format(date);
          System.out.println(s);

          if (!model.isEmpty()) {
            model.clear(); 
          } else if (event.getID() == ActionEvent.ACTION_PERFORMED) {
            model.addElement(" Event ID: ACTION_PERFORMED ");
          }
          
          model.addElement(" Time " + s);
          String source = event.getSource().getClass().getName();
          model.addElement(" Source " + source);
          
          int mod = event.getModifiers();
          StringBuffer buffer = new StringBuffer(" Modifiers: ");
          
          if ((mod & ActionEvent.ALT_MASK) > 0) {
            buffer.append("Alt ");
          }
          if ((mod & ActionEvent.SHIFT_MASK) > 0) {
            buffer.append("Shift ");
          }
          if ((mod & ActionEvent.CTRL_MASK) > 0) {
            buffer.append("Ctrl ");
          }
          model.addElement(buffer);
      }
    });
    beep.setToolTipText("A Beep button");
    this.add(beep);
    
    // exit buttun with inner listener class
    JButton exit = new JButton("Exit");
    exit.setBounds(20, 158, 80, 40);
    this.add(exit);
    ButtonListener listener = new ButtonListener();
    exit.addActionListener(listener);

    // text buttun with derived listener class
    MyButton text = new MyButton("Text");
    text.setBounds(20, 209, 80, 40);
    this.add(text);
    
    // JPopupMenu beep
    JPopupMenu menuPop = new JPopupMenu();
    JMenuItem menuItemBeep = new JMenuItem("Beep");
    menuItemBeep.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
          toolkit.beep();
      }
    });
    menuPop.add(menuItemBeep);
    
    this.addMouseListener(new MouseAdapter() {
      public void mouseReleased(MouseEvent event) {
          if (event.getButton() == event.BUTTON3) {
              menuPop.show(event.getComponent(), event.getX(), event.getY());
          }
      }
    });
  }
  
  class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      System.exit(0);
    }
  }
}
