package observerExample;

import javax.swing.* ;
import java.awt.event.* ;
import java.util.* ;

public class ButtonsAndLabels extends Observable  implements ActionListener {

    JPanel jpnl = new JPanel() ; 
    public JLabel jlab ;
    String command = "OFF";
		
    ButtonsAndLabels () {	
    	JButton jbtnUp = new JButton("ON") ;	
    	JButton jbtnDown = new JButton("OFF") ;	

		jbtnUp.addActionListener(this) ;
		jbtnDown.addActionListener(this) ;

		jlab = new JLabel("Press a button") ;
		jpnl.add(jlab ) ;	
		jpnl.add(jbtnUp ) ;
		jpnl.add(jbtnDown) ;
 
    } // constructor

    
    public void actionPerformed(ActionEvent ae) {
    	if( ae.getActionCommand().equals("ON")) {
    		jlab.setText("You pressed ON");
    		command = "ON"; 
            setCommand(command);	
	     } // if
	     else {
	    	 jlab.setText("You pressed OFF");
	    	 command = "OFF"; 		
             setCommand( command);	
	     }
	}

	public void setCommand ( String comm ) {
	    command = comm ;
	    commandChanged()  ;
	}	

	public String getCommand ( ) {
	    return command ;
	}	

 	public void commandChanged() {
 		setChanged() ;
	    notifyObservers() ;
	} 

} // class