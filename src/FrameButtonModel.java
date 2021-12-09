import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Frame for demonstrate dialog message 
 * 
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/
public class FrameButtonModel extends JFrame {

  private JButton ok;
  private JLabel enabled;
  private JLabel pressed;
  private JLabel armed;

  
  /** 
  * ...Constructor for sets parameters of FrameDialog...
  */
  public FrameButtonModel() {
    setTitle("Button Model Frame");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400, 250);
    setLocationRelativeTo(null);
    //pack();
    JPanel panel = new JPanel();
    panel.setLayout(null);
    
    JCheckBox cb = new JCheckBox("Enabled", true);
    cb.setBounds(180, 30, 100, 25);
    
    JLabel enabled = new JLabel("Enabled");
    enabled.setBounds(40, 90, 90, 25);
    JLabel pressed = new JLabel("Pressed");
    pressed.setBounds(40, 120, 90, 25);
    JLabel armed = new JLabel("Armed");
    armed.setBounds(40, 150, 90, 25);

    
    
    ok = new JButton("OK");
    ok.setBounds(40, 30, 80, 25);
    ok.addChangeListener(new ChangeListener() {

      public void stateChanged(ChangeEvent e) {
        System.out.println("111");
        DefaultButtonModel model = (DefaultButtonModel) ok.getModel();
        if (model.isEnabled()) {
          enabled.setText("Enabled: true");
        } else  {
          enabled.setText("Enabled: false");
        } 
        
        if (model.isArmed()) {
          armed.setText("Armed: true");
        } else  {
          armed.setText("Armed: false");
        } 

        if (model.isPressed()) {
          pressed.setText("Pressed: true");
        } else  {
          pressed.setText("Pressed: false");
        }
      } 
    });
 
    cb.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(ok.isEnabled()) {
          ok.setEnabled(false);
        } else {
          ok.setEnabled(true);
        }
      }
    });
    
    panel.add(ok);
    panel.add(cb);
    panel.add(enabled);
    panel.add(armed);
    panel.add(pressed);
    add(panel);
  }
}  
