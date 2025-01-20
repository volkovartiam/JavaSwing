package observerExample;

import java.util.* ;

public class Arduino implements Observer {

    private Observable observable ;
    private String command ;
	
    public Arduino  ( Observable obs  ) {
		observable = obs ;
		observable.addObserver(this) ;
    }

     public void update ( Observable o , Object arg ) {
	     ButtonsAndLabels bals = (ButtonsAndLabels) o ;
	     command = bals.getCommand()  ;
	     setCommand(command) ;  
     }

     public void setCommand ( String command ) {
    	 if ( command.equals("ON") ) {
    		 System.out.println("ON") ;	    
    	 } // if 		
    	 else if ( command.equals("OFF") ) {
    		 System.out.println("OFF") ;	    
    	 } // if 		
    	 else System.out.println("������") ;	    
     }
   
} // class