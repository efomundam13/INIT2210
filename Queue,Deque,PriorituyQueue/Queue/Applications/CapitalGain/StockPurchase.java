/**
   An immutable class that represents the purchase
   of one share of stock.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class StockPurchase
{
	private double cost;
	
	public StockPurchase(double costPerShare)
	{
		cost = costPerShare;
	} // end constructor
	
	public double getCostPerShare()
	{
		return cost;
	} // end getCostPerShare
} // end StockPurchase
