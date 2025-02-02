import java.util.Vector;
import java.util.Iterator;

/**
 A class that implements a dictionary by using a vector.
 The dictionary is sorted and has distinct search keys.
 Search keys and associated values are not null.
 
 @author Frank M. Carrano
 @author Timothy M. Henry
 @version 5.0
*/
public class SortedVectorDictionary<K extends Comparable<? super K>, V> 
             implements DictionaryInterface<K, V>
{
	private Vector<Entry> dictionary; 	

	public SortedVectorDictionary()
	{
		dictionary = new Vector<>(); // Doubles in size, as necessary
	} // end default constructor

	public SortedVectorDictionary(int initialCapacity)
	{
		dictionary = new Vector<>(initialCapacity);
	} // end constructor

   public V add(K key, V value)
   {
      if ((key == null) || (value == null))
         throw new IllegalArgumentException("Cannot add null to a dictionary.");
      else
      {
         V result = null;
         
         // Search until either you find an entry containing key or
         // you pass the point where it should be
         int keyIndex = locateIndex(key);
         
         if ( (keyIndex < dictionary.size())  &&
             key.equals( (dictionary.get(keyIndex)).getKey() ) )
         {
            // Key found; return and replace old value
            Entry currentEntry = dictionary.get(keyIndex);
            result = currentEntry.getValue();  // Get current value for return
            currentEntry.setValue(value);      // Replace value
         }
         else                                   // Add new entry
         { //System.out.println("adding at index = " + index);
            Entry newEntry = new Entry(key, value);
            dictionary.add(keyIndex, newEntry);
         } // end if
         
         return result;
      } // end if
   } // end add

   public V remove(K key)
	{
   	V result = null;  // Return value
   	
      // search until either you find an entry containing key or
      // you pass the point where it should be
      int keyIndex = locateIndex(key);
	
		if ( (keyIndex < dictionary.size()) && 
		      key.equals( (dictionary.get(keyIndex)).getKey() ) )
		{
			Entry currentEntry = dictionary.remove(keyIndex); // Get and remove entry
			result = currentEntry.getValue();                 // Get current value for return
		} // end if

      return result;  
   } // end remove

   public V getValue(K key)
   {
      V result = null;  // Return value

      // Search until either you find an entry containing key or
      // you pass the point where it should be
      int keyIndex = locateIndex(key);
		
		if ( (keyIndex < dictionary.size()) && 
		      key.equals( (dictionary.get(keyIndex)).getKey() ) )
		{
         result = (dictionary.get(keyIndex)).getValue();
		} // end if
		
		return result;
   } // end getValue

	public boolean contains(K key)
   {
   	return getValue(key) != null; 
   } // end contains

   public boolean isEmpty()
   {
      return dictionary.isEmpty();
   } // end isEmpty
	
   public int getSize()
   {
      return dictionary.size();
   } // end getSize

 	public final void clear()
	{
		dictionary.clear();		
   } // end clear

	public Iterator<K> getKeyIterator()
	{
		return new KeyIterator();
	} // end getKeyIterator
	
	public Iterator<V> getValueIterator()
	{
		return new ValueIterator();
	} // end getValueIterator


   // Returns the index of either the entry that contains key or
   // the location that should contain key, if no such entry exists.
   private int locateIndex(K key)
   {
      // Search until either you find an entry containing key or
      // discover that it doesn not exist.
      int numberOfEntries = dictionary.size();
      return binarySearch(0, numberOfEntries - 1, key);
   } // end locateIndex
   
   // Searches anArray[first] through anArray[last] for desiredItem.
   // first >= 0 and < anArray.length.
   // last >= 0 and < anArray.length.
   private  <T extends Comparable<? super T>>
   int binarySearch(int first, int last, K key)
   {
      int result;
      int mid = first + (last - first) / 2;
      
      if (first > last)
         result = first;
      else if (key.compareTo((dictionary.get(mid)).getKey()) == 0)
         result = mid;
      else if (key.compareTo((dictionary.get(mid)).getKey()) < 0)
         result = binarySearch(first, mid - 1, key);
      else
         result = binarySearch(mid + 1, last, key);
      
      return result;
   } // end binarySearch
   
// Since iterators implement Iterator, methods must be public
	private class KeyIterator implements Iterator<K>
	{
		private Iterator<Entry> traverser;
		
		private KeyIterator()
		{
			traverser = dictionary.iterator();
		} // end default constructor
		
		public boolean hasNext() 
		{
			return traverser.hasNext();
		} // end hasNext
		
		public K next()
		{
			Entry nextEntry = traverser.next();
			return nextEntry.getKey();
		} // end next
		
		public void remove()
		{
			throw new UnsupportedOperationException();
		} // end remove
	} // end KeyIterator 
	
	private class ValueIterator implements Iterator<V>
	{
		private Iterator<Entry> traverser;
		
		private ValueIterator()
		{
			traverser = dictionary.iterator();
		} // end default constructor
		
		public boolean hasNext() 
		{
			return traverser.hasNext();
		} // end hasNext
		
		public V next()
		{
			Entry nextEntry = traverser.next();
			return nextEntry.getValue();
		} // end next
		
		public void remove()
		{
			throw new UnsupportedOperationException();
		} // end remove
	} // end ValueIterator
	
	private class Entry
	{
		private K key;
		private V value;
		
	// Since no setKey method exists, a default constructor is useless
		private Entry(K searchKey, V dataValue)
		{
			key = searchKey;
			value = dataValue;
		} // end constructor
		
		private K getKey()
		{
			return key;
		} // end getKey
		
		private V getValue()
		{
			return value;
		} // end getValue
		
		private void setValue(V dataValue)
		{
		 	value = dataValue;
		} // end setValue
	} // end Entry
} // end SortedVectorDictionary
		
