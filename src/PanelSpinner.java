import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.util.Calendar;
//import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EtchedBorder;


/**
 * Inspired from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * panel with buttons beep that make sounds
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/

public class PanelSpinner extends JPanel {

  /** 
  * ...Constructor for sets parameters of JPanel...
  */
  private JSpinner spinner;
  private static int count;
  private JLabel lbl;
  
  public PanelSpinner() {

    lbl = new JLabel("0");
    lbl.setBounds(20, 160, 80, 40);
    lbl.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
    this.add(lbl);

    
    // text buttun with derived listener class
    var add = new JButton("+");
    add.setBounds(20, 209, 80, 40);
    this.add(add);
    add.addActionListener(new ButtonListener1());
    add.addActionListener(new ButtonListener2());
    
    Calendar calendar = Calendar.getInstance();
    int currentYear = calendar.get(Calendar.YEAR);
    System.out.println(currentYear);
    
    SpinnerModel yearModel = new SpinnerNumberModel(currentYear,  currentYear - 100, currentYear + 100, 1);
    spinner = new JSpinner(yearModel);
    spinner.setEditor(new JSpinner.NumberEditor(spinner, "#"));
    
    this.add(spinner);
    
    
  }
  
  class ButtonListener1 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      Integer val = (Integer) spinner.getValue();
      spinner.setValue(++val);
    }
  }

  class ButtonListener2 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      lbl.setText(Integer.toString(++count));
    }
  }
  
}
