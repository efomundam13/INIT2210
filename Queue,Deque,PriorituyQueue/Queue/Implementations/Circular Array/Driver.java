/** 
   A driver that demonstrates the class ArrayQueue.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.1
*/
public class Driver 
{
	public static void main(String[] args) 
	{
		testQueueOperations();
		System.out.println("\n\nDone.");
	}  // end main

	public static void testQueueOperations()
	{
		System.out.println("Create a queue: ");
		QueueInterface<String> myQueue = new ArrayQueue<>();
		System.out.println("\n\nisEmpty() returns " + myQueue.isEmpty() + "\n");
		
		System.out.println("Add to queue to get\n" +
		                   "Joe Jess Jim Jill Jane Jerry\n");
		myQueue.enqueue("Joe");
		myQueue.enqueue("Jess");
		myQueue.enqueue("Jim");
		myQueue.enqueue("Jill");
		myQueue.enqueue("Jane");
		myQueue.enqueue("Jerry");

		System.out.println("\nisEmpty() returns " + myQueue.isEmpty() + "\n");

		System.out.println("\n\nTesting getFront and dequeue:\n");
		while (!myQueue.isEmpty())
		{
			String front = myQueue.getFront();
			System.out.println(front + " is at the front of the queue.");
			
			front = myQueue.dequeue();
			System.out.println(front + " is removed from the front of the queue.\n");
		} // end while

		System.out.print("\nThe queue should be empty: ");
		System.out.println("isEmpty() returns " + myQueue.isEmpty() + "\n\n");

		System.out.println("Add to queue to get\n" +
		                   "Joe Jess Jim\n");
		myQueue.enqueue("Joe");
		myQueue.enqueue("Jess");
		myQueue.enqueue("Jim");
		
		System.out.println("\nTesting clear:\n");
		myQueue.clear();
			
		System.out.println("\nisEmpty() returns " + myQueue.isEmpty() + "\n\n");

		System.out.println("Add to queue to get\n" +
		                   "Joe Jess Jim\n");
		myQueue.enqueue("Joe");
		myQueue.enqueue("Jess");
		myQueue.enqueue("Jim");
		
		while (!myQueue.isEmpty())
		{
			String front = myQueue.getFront();
			System.out.println(front + " is at the front of the queue.");
			
			front = myQueue.dequeue();
			System.out.println(front + " is removed from the front of the queue.\n");
		} // end while

		System.out.print("\n\nThe queue should be empty: ");
		System.out.println("isEmpty() returns " + myQueue.isEmpty() + "\n");
		
      System.out.println("The next calls will throw an exception." + "\n");
		System.out.println("myQueue.getFront() returns " +  myQueue.getFront());
		System.out.println("myQueue.dequeue() returns " +  myQueue.dequeue() + "\n");
	} // end testQueueOperations
}  // end Driver

/*
 Create a queue:
 
 
 isEmpty() returns true
 
 Add to queue to get
 Joe Jess Jim Jill Jane Jerry
 
 
 isEmpty() returns false
 
 
 
 Testing getFront and dequeue:
 
 Joe is at the front of the queue.
 Joe is removed from the front of the queue.
 
 Jess is at the front of the queue.
 Jess is removed from the front of the queue.
 
 Jim is at the front of the queue.
 Jim is removed from the front of the queue.
 
 Jill is at the front of the queue.
 Jill is removed from the front of the queue.
 
 Jane is at the front of the queue.
 Jane is removed from the front of the queue.
 
 Jerry is at the front of the queue.
 Jerry is removed from the front of the queue.
 
 
 The queue should be empty: isEmpty() returns true
 
 
 Add to queue to get
 Joe Jess Jim
 
 
 Testing clear:
 
 
 isEmpty() returns true
 
 
 Add to queue to get
 Joe Jess Jim
 
 Joe is at the front of the queue.
 Joe is removed from the front of the queue.
 
 Jess is at the front of the queue.
 Jess is removed from the front of the queue.
 
 Jim is at the front of the queue.
 Jim is removed from the front of the queue.
 
 
 
 The queue should be empty: isEmpty() returns true
 
 The next calls will throw an exception.
 
 Exception in thread "main" EmptyQueueException
 at ArrayQueue.getFront(ArrayQueue.java:49)
 at Driver.testQueueOperations(Driver.java:76)
 at Driver.main(Driver.java:12)
       */
