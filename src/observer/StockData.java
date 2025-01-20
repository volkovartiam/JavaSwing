package observer;

import java.util.* ;

public class StockData extends Observable {

      private String stockSymbol ;
      private String stockPrice ;
	
	public String getStockSymbol() {
	    return stockSymbol ;
	}

	public String getStockPrice() {
	    return stockPrice  ;
	}

	public void stockPriceChanged() {
	     setChanged() ;
	     notifyObservers() ;
	} 	


	public void setNewStockPrice (String sS , String sP ) {
	
	    stockSymbol = sS ;
	    stockPrice  = sP ;

	    stockPriceChanged() ;
	}

} //class