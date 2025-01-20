package observer;

import java.util.* ;

public class CurrentStockDisplayData implements Observer {

    private Observable observable ;
    private String stockSymbol ;
    private String stockPrice ;
	
    public CurrentStockDisplayData ( Observable obs  ) {
    	observable = obs ;
    	observable.addObserver(this) ;
    }

    public void display() {
		System.out.println( "Symbol = " +  stockSymbol  +  ", " +
				    "Price = "  + stockPrice  + " ;" ) ;
    }

    public void update ( Observable o , Object arg ) {
		if ( o instanceof StockData ) {
		     StockData stockData = (StockData ) o ;
		     this.stockSymbol  = stockData.getStockSymbol() ;
		     this.stockPrice  = stockData.getStockPrice() ;
		     display() ;
		}
     }

} //class