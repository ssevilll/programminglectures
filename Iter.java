
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iter {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        Iterator it = al.iterator();
        while (it.hasNext()) {
            // the hasNext() method returns true if there are more elements to iterate over,
            // and false if there are no more elements. It is used in a loop to control the
            // iteration process and to prevent the NoSuchElementException from being thrown
            // when trying to access an element that does not exist.
            String str = (String) it.next();
            // the next() method returns the next element in the iteration and advances the
            // iterator to the next position. It is used to retrieve elements from the
            // collection one at a time during iteration. If there are no more elements to
            // return, it will throw a NoSuchElementException.
            System.out.println("Next element: " + str);
            // we need to cast the object returned by the next() method to the appropriate
            // type (in this case, String) because the next() method returns an Object, and
            // we need to specify the type of the element we want to retrieve from the
            // collection. This is necessary because the Iterator interface is a generic
            // interface that can be used with different types of collections, and it does
            // not know the specific type of elements in the collection.

            // if we want to remove an element from the collection while iterating, we can
            // use the remove() method of the Iterator interface. This method removes the
            // last element returned by the next() method from the collection. It is
            // important to note that we should not modify the collection directly while
            // iterating, as this can lead to ConcurrentModificationException. Instead, we
            // should use the remove() method of the iterator to safely remove elements
            // during iteration.
            it.remove();
            // this method can be called only once per call to next() and will remove the
            // last element returned by the next() method from the collection. It is
            // important to note that we should not call the remove() method before calling
            // the next() method, as this will throw an IllegalStateException.
        }

        // after the iteration is complete, the collection will be empty because we
        // removed all the elements during the iteration.
        // if we try to call the next() method after the iteration is complete, it will
        // throw a NoSuchElementException because there are no more elements to return.
        // we should create a new collection and add elements to it again if we want to
        // iterate over it again.
        ArrayList al2 = new ArrayList();
        al2.add("X");
        al2.add("Y");
        al2.add("Z");
        ListIterator it2 = al2.listIterator(al2.size());
        // the listIterator() method of the List interface can take an optional index
        // parameter, which specifies the starting point for the iteration. If we
        // provide an index, the listIterator will start iterating from that index
        // instead of the beginning of the list. This can be useful when we want to
        // iterate over a specific portion of the list or when we want to skip a certain
        // number of elements at the beginning of the list. If we do not provide an
        // index, the listIterator will start from the beginning of the list by default.
        System.out.println("Iterating backwards:");
        while (it2.hasPrevious()) {
            // the hasPrevious() method returns true if there are more elements to iterate
            // over in the reverse direction, and false if there are no more elements. It is
            // used in a loop to control the iteration process when iterating backwards
            // through a list.
            System.out.println(it2.previous());
        }

        // in case you will not modify the collection while iterating, you can also use
        // the enhanced for loop (for-each loop) to iterate over the elements of a
        // collection. This provides a more concise and readable syntax for iterating
        // over collections without the need for an explicit iterator.
        ArrayList al3 = new ArrayList();
        al3.add("P");
        al3.add("Q");
        al3.add("R");

        System.out.println("Iterating using enhanced for loop:");
        for (Object obj : al3) {
            System.out.println(obj);
        }
    }
}