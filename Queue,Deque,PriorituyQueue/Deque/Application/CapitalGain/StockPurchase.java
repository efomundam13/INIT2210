/**
   An immutable class that represents 
   a purchase of a number of shares of stock.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class StockPurchase
{
	private int shares;
	private double cost;
	
	public StockPurchase(int numberOfShares, double costPerShare)
	{
		shares = numberOfShares;
		cost = costPerShare;
	} // end constructor
	
	public int getNumberOfShares()
	{
		return shares;
	} // end getNumberOfShares
	
	public double getCostPerShare()
	{
		return cost;
	} // end getCostPerShare
	
	public double getValue() 
	{
		return shares * cost;
	} // end getValue
} // end StockPurchase
