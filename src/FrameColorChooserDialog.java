import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Frame for demonstrate dialog message 
 * 
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/
public class FrameColorChooserDialog extends JFrame {

  private JPanel panel;
  private JPanel display;

  /** 
  * ...FrameFileChooser constructor
  */
  FrameColorChooserDialog() {

    panel = new JPanel();
    panel.setLayout(new BorderLayout());
    
    JToolBar toolbar = new JToolBar();
    ImageIcon icon = new ImageIcon("color.png");
    var btnOpen = new JButton(icon);
    toolbar.add(btnOpen);

    btnOpen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        //System.out.println("Color");
        JColorChooser clr = new JColorChooser();
        Color color = clr.showDialog(panel, "Choose Color", Color.white);
        display.setBackground(color);
      }
    });
    display = new JPanel();
    display.setBackground(Color.WHITE);
    
    add(panel);
    add(toolbar, BorderLayout.NORTH);
    
    setSize(400, 200);
    setLocationRelativeTo(null);
    setTitle("File color chooser dialog");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}