/** 
   A driver that demonstrates the class HeapPriorityQueue.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class Driver
{
	public static void main(String[] args)
	{
		testPriorityQueueOperations();
		System.out.println("\n\nDone.");
	}  // end main
	
	public static void testPriorityQueueOperations()
	{
		// Create 9 Things with priorities 1 - 9
		Entry<String, Integer> one   = new Entry<>("one",   1);
		Entry<String, Integer> two   = new Entry<>("two",   2);
		Entry<String, Integer> three = new Entry<>("three", 3);
		Entry<String, Integer> four  = new Entry<>("four",  4);
		Entry<String, Integer> five  = new Entry<>("five",  5);
		Entry<String, Integer> six   = new Entry<>("six",   6);
		Entry<String, Integer> seven = new Entry<>("seven", 7);
		Entry<String, Integer> eight = new Entry<>("eight", 8);
		Entry<String, Integer> nine  = new Entry<>("nine",  9);
		
		// Add them to a priority queue
		System.out.println("Create a priority queue: ");
		PriorityQueueInterface<Entry<String, Integer>> myPQ = new HeapPriorityQueue<>();
		System.out.println("\n\nisEmpty() returns " + myPQ.isEmpty() + "\n");

		System.out.println("Add 9 entries in no particular order");

		myPQ.add(nine);
		myPQ.add(eight);
		myPQ.add(seven);
		myPQ.add(one);
		myPQ.add(three);
		myPQ.add(two);
		myPQ.add(four);
		myPQ.add(six);
		myPQ.add(five);

		System.out.print("\nThe priority queue should not be empty: ");
		System.out.println("\nisEmpty returns " + myPQ.isEmpty() + "\n");

		System.out.println("\nThe priority queue should have 9 entries.\n " + 
		                   "getSize returns " + myPQ.getSize());

		System.out.println("\n\nTesting peek and remove:\n");
		System.out.println("Entries should appear in priority order.\n");
		while (!myPQ.isEmpty())
		{
			Entry<String, Integer> front = myPQ.peek();
			System.out.println(front + " is at the front of the priority queue.");
			
			front = myPQ.remove();
			System.out.println(front + " is removed from the front of the priority queue.\n");
		} // end while

		System.out.print("\nThe priority queue should be empty: ");
		System.out.println("isEmpty() returns " + myPQ.isEmpty() + "\n\n");
		
		System.out.println("Add 4 entries:");

		myPQ.add(three);
		myPQ.add(nine);
		myPQ.add(one);
		myPQ.add(seven);

		System.out.print("\nThe priority queue should not be empty: ");
		System.out.println("\nisEmpty returns " + myPQ.isEmpty() + "\n");
		System.out.println("\nThe priority queue should have 4 entries.\n " + 
		                   "getSize returns " + myPQ.getSize());

		System.out.println("\nTesting clear:\n");
		myPQ.clear();
		
		System.out.print("\nThe priority queue should be empty: ");
		System.out.println("isEmpty returns " + myPQ.isEmpty() + "\n\n");
		System.out.println("\nThe priority queue should have no entries.\n " + 
		                   "getSize returns " + myPQ.getSize());
	} // end testPriorityQueueOperations
} // end Driver
/*
 Create a priority queue:
 
 
 isEmpty() returns true
 
 Add 9 entries in no particular order
 
 The priority queue should not be empty:
 isEmpty returns false
 
 
 The priority queue should have 9 entries.
 getSize returns 9
 
 
 Testing peek and remove:
 
 Entries should appear in priority order.
 
 item/priority <nine, 9> is at the front of the priority queue.
 item/priority <nine, 9> is removed from the front of the priority queue.
 
 item/priority <eight, 8> is at the front of the priority queue.
 item/priority <eight, 8> is removed from the front of the priority queue.
 
 item/priority <seven, 7> is at the front of the priority queue.
 item/priority <seven, 7> is removed from the front of the priority queue.
 
 item/priority <six, 6> is at the front of the priority queue.
 item/priority <six, 6> is removed from the front of the priority queue.
 
 item/priority <five, 5> is at the front of the priority queue.
 item/priority <five, 5> is removed from the front of the priority queue.
 
 item/priority <four, 4> is at the front of the priority queue.
 item/priority <four, 4> is removed from the front of the priority queue.
 
 item/priority <three, 3> is at the front of the priority queue.
 item/priority <three, 3> is removed from the front of the priority queue.
 
 item/priority <two, 2> is at the front of the priority queue.
 item/priority <two, 2> is removed from the front of the priority queue.
 
 item/priority <one, 1> is at the front of the priority queue.
 item/priority <one, 1> is removed from the front of the priority queue.
 
 
 The priority queue should be empty: isEmpty() returns true
 
 
 Add 4 entries:
 
 The priority queue should not be empty:
 isEmpty returns false
 
 
 The priority queue should have 4 entries.
 getSize returns 4
 
 Testing clear:
 
 
 The priority queue should be empty: isEmpty returns true
 
 
 
 The priority queue should have no entries.
 getSize returns 0
 
 
 Done.

 */
