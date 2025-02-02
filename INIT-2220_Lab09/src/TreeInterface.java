/**
   An interface of basic methods for the ADT tree.
 
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public interface TreeInterface<T> {
   public T getRootData();
   public int getHeight();
   public int getNumberOfNodes();
   public boolean isEmpty();
   public void clear();
} // end TreeInterface
