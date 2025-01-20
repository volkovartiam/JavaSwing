package buttons;

import javax.swing.* ;

public class ButtonDemoMain {

	public static ButtonDemo bd;	

	public static void main (String args[]) {
	
		SwingUtilities.invokeLater (new Runnable() {
			public void run() {
				bd = new ButtonDemo() ;
			}
		}) ; 
	} //main
} // class