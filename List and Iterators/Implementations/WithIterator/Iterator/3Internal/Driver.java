import java.util.Iterator;
/**
   A driver that demonstrates the class ListWithTraversal.
 
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
public class Driver 
{
	public static void main(String[] args) 
	{
		testIteratorOperations();
		System.out.println("\n\nDone.");
	}  // end main

	public static void testIteratorOperations()
	{
		System.out.println("Create a list: ");
      ListWithTraversal<String> myList = new ListWithTraversal<>();
		System.out.println("Testing add to end: Add 15, 25, 35, 45, 55, 65, 75, 85, 95");
      myList.add("15");
      myList.add("25");
      myList.add("35");
      myList.add("45");
		myList.add("55");
		myList.add("65");
		myList.add("75");
		myList.add("85");
		myList.add("95");

		System.out.println("\n------------------------\n");
		System.out.println("Testing Iterator's hasNext and next methods:");
		
		System.out.println("\n\nList should contain\n15 25 35 45 55 65 75 85 95");
		System.out.println("\n\nUsing ADT list operations, the list contains ");
		displayList(myList);
		
		System.out.println("\n\nUsing Iterator methods, the list contains");
      myList.resetTraversal();

		while (myList.hasNext())
			System.out.print(myList.next() + " ");
		System.out.println();
		System.out.println();
		
      System.out.println("\n\nReturn iterator to beginning of list\n");
      myList.resetTraversal();                     // Reset iterator to beginning
      
      // Advance through list
      System.out.println("next() should return 15 : " + myList.next());
      System.out.println("next() should return 25 : " + myList.next());
      System.out.println("next() should return 35 : " + myList.next());
      System.out.println("next() should return 45 : " + myList.next());
      System.out.println("next() should return 55 : " + myList.next());
      System.out.println("next() should return 65 : " + myList.next());
      System.out.println("next() should return 75 : " + myList.next());
      System.out.println("next() should return 85 : " + myList.next());
      System.out.println("next() should return 95 : " + myList.next());
      
      System.out.println("hasNext() should return false : " + myList.hasNext());
      System.out.println("----------------------\n\n");
	} // end testIteratorOperations
   
	public static void displayList(ListInterface<String> list)
	{
      int numberOfEntries = list.getLength();

      System.out.println("\nThe list contains " + numberOfEntries +
                         " entries, as follows:");
      for (int position = 1; position <= numberOfEntries; position++)
         System.out.println(list.getEntry(position) + " is entry " + position);
      System.out.println();
	} // end displayList
}  // end Driver

/*
 Create a list:
 Testing add to end: Add 15, 25, 35, 45, 55, 65, 75, 85, 95
 
 ------------------------
 
 Testing Iterator's hasNext and next methods:
 
 
 List should contain
 15 25 35 45 55 65 75 85 95
 
 
 Using ADT list operations, the list contains
 
 The list contains 9 entries, as follows:
 15 is entry 1
 25 is entry 2
 35 is entry 3
 45 is entry 4
 55 is entry 5
 65 is entry 6
 75 is entry 7
 85 is entry 8
 95 is entry 9
 
 
 
 Using Iterator methods, the list contains
 15 25 35 45 55 65 75 85 95
 
 
 
 Return iterator to beginning of list
 
 next() should return 15 : 15
 next() should return 25 : 25
 next() should return 35 : 35
 next() should return 45 : 45
 next() should return 55 : 55
 next() should return 65 : 65
 next() should return 75 : 75
 next() should return 85 : 85
 next() should return 95 : 95
 hasNext() should return false : false
 ----------------------
 
 
 
 
 Done.
*/
