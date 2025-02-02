/** 
   A driver that demonstrates the class StockLedger.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class Driver 
{
	public static void main(String[] args) 
	{
		StockLedger myStocks = new StockLedger();
		
		System.out.println("Buy 20 shares @ $45 each.");
		System.out.println("Buy 20 shares @ $75 each.");

      myStocks.buy(20, 45); // Buy 20 shares at $45
      myStocks.buy(20, 75); // Buy 20 shares at $75
		
		System.out.print("\nSell 30 shares @ $65 each at a gain (loss) of $");
      double capGain = myStocks.sell(30, 65); // Sell 30 shares at $65
      System.out.println(capGain);            // $300
      
		System.out.print("\nSell 10 shares @ $65 each at a gain (loss) of $");
		capGain = myStocks.sell(10, 65);       // Sell 10 shares at $65
      System.out.println(capGain);           // -$100

		System.out.println("\n\nBuy 100 shares @ $20 each.");
		System.out.println("Buy 20 shares @ $24 each.");
		System.out.println("Buy 200 shares @ $36 each.");

		myStocks.buy(100, 20); // Buy 100 shares @ $20
		myStocks.buy(20, 24);  // Buy 20 shares @ $24
		myStocks.buy(200, 36); // Buy 200 shares @ $36
		
		System.out.print("\n\nSell 10 shares @ $65 each at a gain (loss) of $");
		capGain = myStocks.sell(10, 65);       // Sell 10 shares at $65
      System.out.println(capGain);           // $450

		System.out.print("\nSell 150 shares @ $65 each at a gain (loss) of $");
		capGain = myStocks.sell(150, 30);      // Sell 150 shares at $65
      System.out.println(capGain);           // $780
		
		System.out.println("\n\nDone.");
	}  // end main
}  // end Driver

/*
 Buy 20 shares @ $45 each.
 Buy 20 shares @ $75 each.
 
 Sell 30 shares @ $65 each at a gain (loss) of $300.0
 
 Sell 10 shares @ $65 each at a gain (loss) of $-100.0
 
 
 Buy 100 shares @ $20 each.
 Buy 20 shares @ $24 each.
 Buy 200 shares @ $36 each.
 
 
 Sell 10 shares @ $65 each at a gain (loss) of $450.0
 
 Sell 150 shares @ $65 each at a gain (loss) of $780.0
 
 
 Done.
 Franks-iMac:deque Frank$ */
