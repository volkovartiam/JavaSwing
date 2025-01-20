package observer;

public class Main  {

    public static void main ( String args[] ) {
	
    	StockData stockData = new StockData() ;
    	CurrentStockDisplayData currentStockDisplayData  = new CurrentStockDisplayData(stockData ) ;

		stockData.setNewStockPrice("StockA" , "10.5") ; 
		stockData.setNewStockPrice("StockA" , "12.5") ; 
    }

} //class