package examples;

import java.awt.* ;
import java.awt.event.* ;
import java.awt.geom.* ;
import javax.swing.* ;

public class Mover extends JComponent {
    private Image image ;
    private int x ;

    public Mover() {
        addMouseListener(new MouseAdapter()  {
             public void mousePressed ( MouseEvent me   ) {
            	 int mods = me.getModifiers() ;
            	 if ( ( mods & InputEvent.BUTTON3_MASK )  != 0 ) { 
            		 x++ ;	
            		 repaint() ;
            	 } // end if 

            	 if ( ( mods & InputEvent.BUTTON1_MASK )  != 0 ) { 
            		 x-- ;	
            		 repaint() ;
            	 } // end if 
             } // end mousePressed
        });
    } // end constructor 

        
    public void paint( Graphics g ) {
    	Graphics2D g2 = (Graphics2D)g ;
    	Shape r = new Rectangle2D.Float(x ,50, 10 , 300) ;
    	g2.setPaint(Color.GRAY) ; 	
    	g2.fill(r) ;  
    }

	public static void main (String args[]) {
		JFrame frame = new JFrame("Mover") ;		
	    frame.setLayout( new BorderLayout() ) ;		
	    frame.add( new Mover(), BorderLayout.CENTER ) ;
	    frame.setSize(300, 300) ;

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	    frame.setVisible(true) ;
    } // main

} // end class



















