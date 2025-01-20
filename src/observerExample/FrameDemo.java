package observerExample;

import javax.swing.* ;
import java.awt.* ;

public class FrameDemo  {

	ButtonsAndLabels bAndl = new ButtonsAndLabels() ;
	Arduino ard = new Arduino(bAndl ) ;	

    public FrameDemo () {

    	JFrame jfrm = new JFrame("A Button Example") ; 
    	jfrm.setLayout(new FlowLayout() ) ;
    	jfrm.setSize( 220, 200  ) ;
    	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		jfrm.add(bAndl.jpnl ) ;
		jfrm.setVisible(true) ;
    } // constructor

} // class