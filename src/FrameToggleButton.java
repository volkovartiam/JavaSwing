import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;

/**
 * Frame for demonstrate dialog message 
 * 
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/
public class FrameToggleButton extends JFrame implements ActionListener {

  private JPanel display;
  private JToggleButton red;
  private JToggleButton green;
  private JToggleButton blue;

  
  /** 
  * ...Constructor for sets parameters of FrameDialog...
  */
  public FrameToggleButton() {
    setTitle("JToggleButton Frame");
    setSize(400, 150);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    JPanel bottom = new JPanel();
    bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
    bottom.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    
    JPanel left = new JPanel();
    left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));

    red = new JToggleButton("Red");
    red.addActionListener(this);
    /*red.setContentAreaFilled(false);
    red.setOpaque(true);
    red.setBackground(Color.LIGHT_GRAY);*/

    green = new JToggleButton("Green");
    green.addActionListener(this);
    blue = new JToggleButton("Blue");
    blue.addActionListener(this);

    red.setMaximumSize(green.getMaximumSize());
    blue.setMaximumSize(green.getMaximumSize());
    
    left.add(red);
    left.add(Box.createRigidArea(new Dimension(25, 7)));
    left.add(green);
    left.add(Box.createRigidArea(new Dimension(25, 7)));
    left.add(blue);

    display = new JPanel();
    display.setPreferredSize(new Dimension(110, 110));
    display.setBorder(LineBorder.createGrayLineBorder());
    display.setBackground(Color.BLACK);

    bottom.add(left);
    bottom.add(Box.createRigidArea(new Dimension(25, 7)));
    bottom.add(display);

    add(bottom);
    pack();
    setResizable(false);

  }
  
  public void actionPerformed(ActionEvent event) {
    Color color = display.getBackground();
    int red = color.getRed();
    int green = color.getGreen();
    int blue = color.getBlue();
   
    if (event.getActionCommand() == "Red") {
      if (red == 0) {
        red = 255;
      } else {
        red = 0;
      } 
    }

    if (event.getActionCommand() == "Green") {
      if (green == 0) {
        green = 255;
      } else {
        green = 0;
      } 
    }

    if (event.getActionCommand() == "Blue") {
      if (blue == 0) {
        blue = 255;
      } else {
        blue = 0;
      } 
    }
    Color setColor = new Color(red, green, blue);
    display.setBackground(setColor);
  }
}  
