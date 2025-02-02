import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
   A driver that demonstrates the class Concordance.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public class Driver
{
	public static void main(String[] args) 
	{
		Concordance wordIndex  = new Concordance();

		String fileName = "Data.txt"; // could be read
		try
		{
			Scanner textReader = new Scanner(new File(fileName));
			wordIndex.readFile(textReader);
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("File not found: " + e.getMessage());
		}
		
		System.out.println("Here is the concordance for the text read from the data file:");
		wordIndex.display();
      
// Test Question 9 (getLineNumbers)
		System.out.println("\nTest getLineNumbers(\"learning\")");
		
		ListWithIteratorInterface<Integer> lineList = wordIndex.getLineNumbers("learning");
		Iterator listIterator = lineList.getIterator();
		while (listIterator.hasNext())
		{
			System.out.print(listIterator.next() + " ");
		} // end while
		System.out.println();

		System.out.println("\n\nDone!");
	}  // end main
}  // end Driver

/*
 Here is the concordance for the text read from the data file:
 is 1 2
 labor 1
 learning 1 2
 lost 1
 perilous 2
 thought 1 2
 without 1 2
 
 Test getLineNumbers("learning")
 1 2
 
 
 Done!
 */
