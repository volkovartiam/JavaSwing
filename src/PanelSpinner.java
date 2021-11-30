import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
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

  private JSpinner spinner;
  private static int count;
  private JLabel lbl;
  private JCheckBox activeCheckBox;

  /** 
  * ...Constructor for sets parameters of JPanel...
  */
  
  public PanelSpinner() {

    this.setLayout(null);
    lbl = new JLabel("0");
    lbl.setHorizontalAlignment(SwingConstants.CENTER);
    lbl.setBounds(5, 0, 30, 40);
    lbl.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
    this.add(lbl);

    // text buttun with derived listener class
    var add = new JButton("+");
    add.setBounds(38, 0, 80, 40);
    this.add(add);

    // checkBox
    activeCheckBox = new JCheckBox("Active Listener");
    activeCheckBox.setBounds(5, 50, 160, 40);
    this.add(activeCheckBox);

    // Listeners
    ButtonListener1 spinnerListener = new ButtonListener1();
    ButtonListener2 lblListener = new ButtonListener2();

    activeCheckBox.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent event) {
        if (activeCheckBox.isSelected()) {
          add.addActionListener(lblListener);
          add.addActionListener(spinnerListener);
        } else {
          add.removeActionListener(lblListener);
          add.removeActionListener(spinnerListener);
        } 
      }
    });

    // Calendar instance
    Calendar calendar = Calendar.getInstance();
    int currentYear = calendar.get(Calendar.YEAR);
    System.out.println(currentYear);
    
    SpinnerModel yearModel = new SpinnerNumberModel(currentYear,  
        currentYear - 100, currentYear + 100, 1);
    spinner = new JSpinner(yearModel);
    spinner.setSize(100, 40);
    spinner.setLocation(128, 2);
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
