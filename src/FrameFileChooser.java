import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
public class FrameFileChooser extends JFrame {

  private JPanel panel;
  private JTextArea textArea;
  
  /** 
  * ...FrameFileChooser constructor
  */
  FrameFileChooser() {

    panel = new JPanel();
    panel.setLayout(new BorderLayout());
    
    JToolBar toolbar = new JToolBar();
    ImageIcon icon = new ImageIcon("open.png");
    var btnOpen = new JButton(icon);
    toolbar.add(btnOpen);

    btnOpen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        JFileChooser fileOpen = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("txt files", "txt");
        fileOpen.addChoosableFileFilter(filter);
        
        int ret = fileOpen.showDialog(panel, "Open file");  
        if (ret == JFileChooser.APPROVE_OPTION) {
          File file = fileOpen.getSelectedFile();
          String text = readFile(file);
          textArea.setText(text);
        }
      }
    });

    textArea = new JTextArea();
    textArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    
    JScrollPane pane = new JScrollPane();
    pane.getViewport().add(textArea);
    panel.add(pane);

    add(panel);
    add(toolbar, BorderLayout.NORTH);
    
    setSize(400, 200);
    setLocationRelativeTo(null);
    setTitle("FileChooserDialog");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  
  /** 
  * ...readFile for reading file...
  * ..and outPut in String 
  */
  public String readFile(File file) {
    StringBuffer fileBuffer = null;
    String fileString = null;
    String line = null;
    
    try {
      FileReader in = new FileReader(file);
      BufferedReader brd = new BufferedReader(in);
      fileBuffer = new StringBuffer();

      // read data in line String 
      while ((line = brd.readLine()) != null) {
        fileBuffer.append(line 
            /**/ + System.getProperty("line.separator")/**/);
      }
      in.close();
      fileString = fileBuffer.toString();
      
    } catch (IOException e) {
      return null;
    }
    return fileString;
  }
}
