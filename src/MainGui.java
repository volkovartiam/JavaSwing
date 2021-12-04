import javax.swing.UIManager;

/**
 * Inspired from book The Java Swing tutorial crated by dovari.sudheerkiran@gmail.com 
 * main class
 *
 * @author Volkov Artem
 *
 * @version 1.0
*/
public class MainGui {
  
  
  /** 
  * ...main methode for creating examples of frames...
  */
  public static void main(final String[] args) {
    
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
      System.out.println("Error" + e.getStackTrace());
    }

    //FrameGui frameGui = new FrameGui();
    //frameGui.setVisible(true);

    //FrameDialog frameDialog = new FrameDialog();
    //frameDialog.setVisible(true);

    FrameFileChooser frameFileChooser = new FrameFileChooser();
    frameFileChooser.setVisible(true);

  }
}  
  

