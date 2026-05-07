import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        System.out.println("Array size: " + al.size());

        al.remove("C"); // removes the first occurrence of "C" from the list
        al.remove(2); // removes the element at index 2 (which is "D" after removing "C")
        al.set(0, "Z"); // replaces the element at index 0 (which is "A") with "Z"
        System.out.println("Array size: " + al.size());

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        Object[] arr = al.toArray(); // converts the ArrayList to an array of Objects
        // if we want to prioritize speed over memory, we can use an array instead of an
        // ArrayList, because an array is a fixed-size data structure that stores
        // elements in contiguous memory locations, which allows for faster access and
        // iteration compared to an ArrayList, which is a dynamic data structure that
        // uses an underlying array to store elements and may require resizing and
        // copying when the size exceeds the current capacity.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        // methods that come from deque interface
        ll.addFirst("Y");
        ll.addLast("X");

        // does linkedlist improve performance when we need to add or remove elements
        // from the middle of the list? yes, because a linked list is a data structure
        // that consists of nodes that are connected by pointers, which allows for
        // efficient insertion and deletion of elements at any position in the list,
        // while an array-based list (like ArrayList) requires shifting elements to
        // accommodate new insertions or deletions, which can be inefficient for large
        // lists.
        System.out.println("Linked List size: " + ll.size());

        HashSet hs = new HashSet();
        hs.add(3);
        hs.add(2);
        hs.add(5);
        hs.add(2); // this will not be added to the set because sets do not allow duplicate
                   // elements
        // sets are useful when we want to store unique elements and do not care about
        // the order of the elements, while lists are useful when we want to store
        // elements in a specific order and allow duplicate elements.
        System.out.println(hs); //[2,3,5]

        // Map map = new Map();
        // map.put("B","Brown");
        // map.put("G","Green");
        // map.put("R","Red");
        // map.put("B","Blue"); // this will replace the value associated with the key "B" from "Brown" to "Blue"
        // map.put("P", "Pink");
        // maps are useful when we want to store key-value pairs and allow for fast


        //array sort
        int [] intArr = { 5,-1,2,3,55,3,-5}; 
        String [] strArr = { "Konul", "Sariyya", "Aydin", "Habil", "Natavan"}; 
        Arrays.sort(intArr); //sort in increasing order by default
        Arrays.sort(strArr);  //sort in lexicographical order by default
        for (int i : intArr) {
             System.out.print(i + " "); 
        }
        System.out.println(); 
        for (String s : strArr) {
            System.out.print(s + " ");
        }


        //array binary search
        int idx = Arrays.binarySearch(intArr, 3); // returns the index of the element 3 in the sorted array intArr, or a negative value if the element is not found
        System.out.println("\nIndex of 3: " + idx);


        //array fill
        int[][] matrixOfOnes = new int[3][3]; // creates a 2D array (matrix) of size 3x3 filled with zeros by default
        for (int[] row : matrixOfOnes) {
            Arrays.fill(row, 1); // fills each row of the matrix with 1s
            //this method works with one-dimensional arrays, so we need to iterate through each row of the matrix and fill it with 1s.
        }

        for (int i=0;i<matrixOfOnes.length;i++) {
            for (int j=0;j<matrixOfOnes[i].length;j++) {
                System.out.print(matrixOfOnes[i][j] + " ");
            }
            System.out.println();
        }


        //array mismatch
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 0, 4, 5};
        int mismatchIndex = Arrays.mismatch(arr1, arr2); // returns the index of the first mismatch between the two arrays, or -1 if the arrays are identical


        
    }
}
