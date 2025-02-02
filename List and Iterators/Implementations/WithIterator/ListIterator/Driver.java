import java.util.Iterator;
import java.util.ListIterator;
/** 
   A driver that demonstrates the class ArrayListWithListIterator.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class Driver 
{
	public static void main(String[] args) 
	{
		testIteratorOperations();
		testAddAndSet();
		testIllegalOps();
		System.out.println("\n\nDone.");
	}  // end main

	public static void testIteratorOperations()
	{
      System.out.println("Testing add to end to create the list Jess, Jim, Josh");
		ListWithListIteratorInterface<String> nameList = new ArrayListWithListIterator<>();
      nameList.add("Jess");
		nameList.add("Jim");
		nameList.add("Josh");
      displayList(nameList);
      System.out.println("\n------------------------\n");

		System.out.println("Testing ListIterator's methods hasNext, next, nextIndex, hasPrevious, previous, and previousIndex:");
		ListIterator<String> traverse = nameList.getIterator();

		System.out.println("nextIndex     " + traverse.nextIndex()     + "    " + "should be 0");
		System.out.println("hasNext       " + traverse.hasNext()       + " "    + "should be true");
		System.out.println("previousIndex " + traverse.previousIndex() + " "    + "should be -1");
		System.out.println("hasPrevious   " + traverse.hasPrevious()   + "  "   + "should be false");
		System.out.println();
		
		System.out.println("next      " + traverse.next()      + "      " + "should be Jess");
		System.out.println("nextIndex " + traverse.nextIndex() + " " + "should be 1");
		System.out.println("hasNext   " + traverse.hasNext()   + "   " + "should be true");
		System.out.println();

		System.out.println("previousIndex " + traverse.previousIndex() + " "          + "should be 0");
		System.out.println("hasPrevious   " + traverse.hasPrevious()   + "   "        + "should be true");
		System.out.println("previous      " + traverse.previous()      + "      "     + "should be Jess");
		System.out.println("nextIndex     " + traverse.nextIndex()     + "     "      + "should be 0");
		System.out.println("hasNext       " + traverse.hasNext()       + "       "    + "should be true");
		System.out.println("next          " + traverse.next()          + "          " + "should be Jess");
		System.out.println();
      System.out.println("\n------------------------\n");
// ---------------------------------------------------------------------------------------
		
      System.out.println("Testing add to end to create the list 15, 25, 35, 45, 55, 65, 75, 85, 95");
		ListWithListIteratorInterface<String> myList = new ArrayListWithListIterator<>();
		
      myList.add("15");
      myList.add("25");
      myList.add("35");
      myList.add("45");
		myList.add("55");
		myList.add("65");
		myList.add("75");
		myList.add("85");
		myList.add("95");
      displayList(myList);
      System.out.println("\n------------------------\n");
		System.out.println("Testing ListIterator's hasNext and next methods:");
		
		System.out.println("\n\nList should contain\n15 25 35 45 55 65 75 85 95");
		System.out.println("\n\nUsing ADT list operations, the list contains ");
		displayList(myList);
      System.out.println("\n------------------------\n");
		
		System.out.println("\n\nUsing ListIterator methods, the list contains");
		ListIterator<String> myIterator = myList.getIterator();

		while (myIterator.hasNext())
			System.out.print(myIterator.next() + " ");
		System.out.println();
      System.out.println("\n------------------------\n");
      System.out.println();
		
      myIterator = myList.getIterator();
		System.out.println("Removing current entry : " + myIterator.next() + " should be 15");
		myIterator.remove();  // Remove entry 1
      
		System.out.println("List should contain\n25 35 45 55 65 75 85 95");
		System.out.println("\n\nUsing ADT list operations, the list contains ");
		displayList(myList);
      System.out.println("\n------------------------\n");
		
		System.out.println("Removing current entry: " + myIterator.next() + " should be 25");
		myIterator.remove();
      
		System.out.println("List should contain\n35 45 55 65 75 85 95");
		System.out.println("\n\nUsing ADT list operations, the list contains ");
		displayList(myList);
      System.out.println("\n------------------------\n");
		
		// Advance twice
		System.out.println("Skipping over " + myIterator.next() + " should be 35");
		
		System.out.println("Removing current entry: " + myIterator.next() + " should be 45");
		myIterator.remove();
      
		System.out.println("List should contain\n35 55 65 75 85 95");
		System.out.println("\n\nUsing ADT list operations, the list contains ");
		displayList(myList);
      System.out.println("\n------------------------\n");

		// Advance 3 times
		System.out.println("Skipping over " + myIterator.next() + " should be 55");
		System.out.println("Skipping over " + myIterator.next() + " should be 65");
		System.out.println("Skipping over " + myIterator.next() + " should be 75");
      
		System.out.println("Removing current entry: " + myIterator.next() + " should be 85");
		myIterator.remove();
      
		System.out.println("List should contain\n35 55 65 75 95");
		System.out.println("\n\nUsing ADT list operations, the list contains ");
		displayList(myList);
      System.out.println("\n------------------------\n");
		
		System.out.println("next() should return 95 : " + myIterator.next());
		System.out.println("hasNext() should return false : " + myIterator.hasNext());
		System.out.println("----------------------\n\n");

		System.out.println("The iterator is at the end of the list.\n" +
		                   "Testing ListIterator's hasPrevious and previous methods\n" +
		                   "by traversing backward:\n");
		while (myIterator.hasPrevious())
			System.out.print(myIterator.previous() + " ");
		System.out.println("\n");

		System.out.println("The iterator is at the beginning of the list.\n" +
		                   "Testing ListIterator's hasNext and next methods\n" +
		                   "by traversing forward:\n");
		while (myIterator.hasNext())
			System.out.print(myIterator.next() + " ");
		System.out.println("\n");

		System.out.println("----------------------\n\n");
     
      System.out.println("\n\nUsing Iterator methods, the list contains");
		ListIterator<String> yourIterator = myList.getIterator();
      
		while (yourIterator.hasNext())
			System.out.print(yourIterator.next() + " ");
		System.out.println();
		System.out.println();
		System.out.println("\n\nTesting ListIterator's remove() method:");
		System.out.println("\n\nReturn iterator to beginning of list\n");
		myIterator = myList.getIterator(); // Reset iterator to beginning
      System.out.println("\n------------------------\n");
	} // end testIteratorOperations

	public static void testAddAndSet()
	{
		System.out.println("Testing ListIterator's add, hasNext, nextIndex, hasPrevious, and previousIndex methods:\n");
		ListWithListIteratorInterface<String> myList = new ArrayListWithListIterator<String>();
		ListIterator<String> traverse = myList.getIterator();

		myList.add("Jamie");
		myList.add("Doug");
		myList.add("Jill");

		System.out.println("List should contain\nJamie Doug Jill \n ");
		System.out.println("List actually contains");
		displayList(myList);
      System.out.println("\n------------------------\n");
		
		System.out.println();

		System.out.println("nextIndex = " + traverse.nextIndex() + "; should be 0");
		System.out.println("hasNext = " + traverse.hasNext() + "; should be true");
		System.out.println("previousIndex = " + traverse.previousIndex() + "; should be -1");
		System.out.println("hasPrevious = " + traverse.hasPrevious() + "; should be false");

		System.out.println();

		System.out.println("next = " + traverse.next() + "; should be Jamie");
		System.out.println("nextIndex = " + traverse.nextIndex() + "; should be 1");
		System.out.println("hasNext = " + traverse.hasNext() + "; should be true");
		
		System.out.println();

		System.out.println("previousIndex " + traverse.previousIndex() + "; should be 0");
		System.out.println("hasPrevious   " + traverse.hasPrevious() + "; should be true");
		System.out.println("previous      " + traverse.previous() + "; should be Jamie");
		System.out.println("nextIndex     " + traverse.nextIndex() + "; should be 0");
		System.out.println("hasNext       " + traverse.hasNext() + "; should be true");
		System.out.println("next          " + traverse.next() + "; should be Jamie");
      System.out.println("\n------------------------\n");
		
// Test set
      System.out.println("Testing ListIterator's set method:\n");
      System.out.println("\n\nReplace entry that next() just returned with Bob:");
		traverse.set("Bob");
		displayList(myList);
      
		System.out.println("previousIndex " + traverse.previousIndex() + "    " + "should be 0");
		System.out.println("hasPrevious   " + traverse.hasPrevious()   + " "    + "should be true");;

		System.out.println("nextIndex     " + traverse.nextIndex()     + "    " + "should be 1");
		System.out.println("hasNext       " + traverse.hasNext()       + " "    + "should be true");
		displayList(myList);

// Test add
      System.out.println("Testing ListIterator's add method:\n");
		System.out.println("Before add");

		System.out.println("nextIndex     " + traverse.nextIndex()     + " should be 1");
		System.out.println("previousIndex " + traverse.previousIndex() + " should be 0");

		System.out.println("add Kerry before (or at) position " + (1+traverse.nextIndex()));
		traverse.add("Kerry");
		displayList(myList);
		
		System.out.println("After add");
		System.out.println("nextIndex     " + traverse.nextIndex() + " should be 2");
		System.out.println("previousIndex " + traverse.previousIndex() + " should be 1");
      
		System.out.println("======================================================");
		System.out.println("======================================================");
		
// Choose 1 of the following groups:
		System.out.println("next          " + traverse.next() + " should be Doug");
		traverse.remove();
		System.out.println("After removing Doug");
		displayList(myList);

/*
		System.out.println("previous      " + traverse.previous() + " should be Kerry");
		traverse.remove();
		System.out.println("After removing Kerry");
		displayList(myList);
*/
		System.out.println("======================================================");
		System.out.println("======================================================");
		myList.clear();

		myList.add("Bob");
		myList.add("Kerry");
		myList.add("Doug");
		myList.add("Jill");
		displayList(myList);
		traverse = myList.getIterator();
		System.out.println(traverse.next());
		System.out.println(traverse.next());
// Current is Doug
		traverse.previous(); // Move back to Kerry
		traverse.remove();   // Remove Kerry
		displayList(myList);

	} // end testAddAndSet
	
	public static void testIllegalOps()
	{
		System.out.println("\nTesting sequences of operations on a new list:\n");

		ListWithListIteratorInterface<String> myList = new ArrayListWithListIterator<>();
		ListIterator<String> traverse = myList.getIterator();

		myList.add("Jamie");
		myList.add("Doug");
		myList.add("Jill");

		System.out.println("List should contain\nJamie Doug Jill \n ");
		System.out.println("List actually contains");
		displayList(myList);
		
		System.out.println();

		System.out.println("The sequence next, set, set, remove is legal.");
		traverse.next();
		traverse.set("XX");
		traverse.set("XX");
		traverse.remove();

		System.out.print("\nThe following sequence is illegal and causes an exception:");

// Choose one sequence to test; disable the others
/*
// 1
		System.out.println(" next, remove, remove\n");
		traverse.next();
		traverse.remove();
		traverse.remove();

// 2
		System.out.println(" previous, remove, remove\n");
		traverse.previous();
		traverse.remove();
		traverse.remove();

// 3
		System.out.println(" previous, set, remove\n");
		traverse.previous();
		traverse.set("XX");
		traverse.remove();

// 4
		System.out.println(" previous, add, remove\n");
		traverse.previous();
		traverse.add("YY");
		traverse.remove();

// 5
		System.out.println(" next, set, add, remove\n");
		traverse.next();
		traverse.set("XX");
		traverse.add("XX");
		traverse.remove();
*/
// 6
		System.out.println(" next, set, add, set\n");
		traverse.next();
		traverse.set("XX");
		traverse.add("XX");
		traverse.set("ZZ");

	} // end testIllegalOps
	
	public static void displayList(ListInterface<String> aList)
	{
      int numberOfEntries = aList.getLength();
      System.out.println();
      for (int position = 1; position <= numberOfEntries; ++position)
         System.out.print(aList.getEntry(position) + " ");
      System.out.println();
	}  // end displayList
}  // end Driver

/*
 Testing add to end to create the list Jess, Jim, Josh
 
 Jess Jim Josh
 
 ------------------------
 
 Testing ListIterator's methods hasNext, next, nextIndex, hasPrevious, previous, and previousIndex:
 nextIndex     0    should be 0
 hasNext       true should be true
 previousIndex -1 should be -1
 hasPrevious   false  should be false
 
 next      Jess      should be Jess
 nextIndex 1 should be 1
 hasNext   true   should be true
 
 previousIndex 0 should be 0
 hasPrevious   true   should be true
 previous      Jess      should be Jess
 nextIndex     0     should be 0
 hasNext       true       should be true
 next          Jess          should be Jess
 
 
 ------------------------
 
 Testing add to end to create the list 15, 25, 35, 45, 55, 65, 75, 85, 95
 
 15 25 35 45 55 65 75 85 95
 
 ------------------------
 
 Testing ListIterator's hasNext and next methods:
 
 
 List should contain
 15 25 35 45 55 65 75 85 95
 
 
 Using ADT list operations, the list contains
 
 15 25 35 45 55 65 75 85 95
 
 ------------------------
 
 
 
 Using ListIterator methods, the list contains
 15 25 35 45 55 65 75 85 95
 
 ------------------------
 
 
 Removing current entry : 15 should be 15
 List should contain
 25 35 45 55 65 75 85 95
 
 
 Using ADT list operations, the list contains
 
 25 35 45 55 65 75 85 95
 
 ------------------------
 
 Removing current entry: 25 should be 25
 List should contain
 35 45 55 65 75 85 95
 
 
 Using ADT list operations, the list contains
 
 35 45 55 65 75 85 95
 
 ------------------------
 
 Skipping over 35 should be 35
 Removing current entry: 45 should be 45
 List should contain
 35 55 65 75 85 95
 
 
 Using ADT list operations, the list contains
 
 35 55 65 75 85 95
 
 ------------------------
 
 Skipping over 55 should be 55
 Skipping over 65 should be 65
 Skipping over 75 should be 75
 Removing current entry: 85 should be 85
 List should contain
 35 55 65 75 95
 
 
 Using ADT list operations, the list contains
 
 35 55 65 75 95
 
 ------------------------
 
 next() should return 95 : 95
 hasNext() should return false : false
 ----------------------
 
 
 The iterator is at the end of the list.
 Testing ListIterator's hasPrevious and previous methods
 by traversing backward:
 
 95 75 65 55 35
 
 The iterator is at the beginning of the list.
 Testing ListIterator's hasNext and next methods
 by traversing forward:
 
 35 55 65 75 95
 
 ----------------------
 
 
 
 
 Using Iterator methods, the list contains
 35 55 65 75 95
 
 
 
 Testing ListIterator's remove() method:
 
 
 Return iterator to beginning of list
 
 
 ------------------------
 
 Testing ListIterator's add, hasNext, nextIndex, hasPrevious, and previousIndex methods:
 
 List should contain
 Jamie Doug Jill
 
 List actually contains
 
 Jamie Doug Jill
 
 ------------------------
 
 
 nextIndex = 0; should be 0
 hasNext = true; should be true
 previousIndex = -1; should be -1
 hasPrevious = false; should be false
 
 next = Jamie; should be Jamie
 nextIndex = 1; should be 1
 hasNext = true; should be true
 
 previousIndex 0; should be 0
 hasPrevious   true; should be true
 previous      Jamie; should be Jamie
 nextIndex     0; should be 0
 hasNext       true; should be true
 next          Jamie; should be Jamie
 
 ------------------------
 
 Testing ListIterator's set method:
 
 
 
 Replace entry that next() just returned with Bob:
 
 Bob Doug Jill
 previousIndex 0    should be 0
 hasPrevious   true should be true
 nextIndex     1    should be 1
 hasNext       true should be true
 
 Bob Doug Jill
 Testing ListIterator's add method:
 
 Before add
 nextIndex     1 should be 1
 previousIndex 0 should be 0
 add Kerry before (or at) position 2
 
 Bob Kerry Doug Jill
 After add
 nextIndex     2 should be 2
 previousIndex 1 should be 1
 ======================================================
 ======================================================
 next          Doug should be Doug
 After removing Doug
 
 Bob Kerry Jill
 ======================================================
 ======================================================
 
 Bob Kerry Doug Jill
 Bob
 Kerry
 
 Bob Doug Jill
 
 Testing sequences of operations on a new list:
 
 List should contain
 Jamie Doug Jill
 
 List actually contains
 
 Jamie Doug Jill
 
 The sequence next, set, set, remove is legal.
 
 The following sequence is illegal and causes an exception: next, set, add, set
 
 Exception in thread "main" java.lang.IllegalStateException: Illegal call to set(); next() or previous() not called, OR add() or remove() called since then.
 at ArrayListWithListIterator$ListIteratorForArrayList.set(ArrayListWithListIterator.java:383)
 at Driver.testIllegalOps(Driver.java:321)
 at Driver.main(Driver.java:16)
 */
