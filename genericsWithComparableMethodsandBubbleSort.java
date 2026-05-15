/*
a.	Define 5 arrays. (of types int, double, String, Task and Point)
b.	Define a generic method to print the elements of an array.
c.	Overload the print method so that it can accept the lower and upper indexes to print a specified range of the array. If the range is out of bounds of the array, the method throws an exception.
d.	Overload the print method so that it prints Tasks as only two Tasks are printed in a single line.
e.	Define a generic method to return the middle element of an array.
f.	Define a generic method to return the maximum element of an array.
g.	Define a generic method to sort an array. (Use bubble sort algorithm for simplicity)
i.	You may need to swap some elements of the array, define a generic swap method.

 */
public class genericsWithComparableMethodsandBubbleSort {
    public static void main(String[] args) {
        // Define 5 arrays
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        String[] stringArray = { "Hello", "World", "Generics", "Java" };
        Task[] taskArray = { new Task("Task1"), new Task("Task2"), new Task("Task3") };
        Point[] pointArray = { new Point(1, 2), new Point(3, 4), new Point(5, 6) };

        // Print elements of the arrays
        print(intArray);
        print(doubleArray);
        print(stringArray);
        print(taskArray);
        print(pointArray);

        // Print a specified range of the array
        print(intArray, 1, 3);
        print(doubleArray, 0, 2);
        print(stringArray, 1, 3);
        print(taskArray, 0, 2);
        print(pointArray, 1, 2);

        // Get the middle element of the arrays
        System.out.println("Middle element of int array: " + getMiddle(intArray));
        System.out.println("Middle element of double array: " + getMiddle(doubleArray));
        System.out.println("Middle element of string array: " + getMiddle(stringArray));
        System.out.println("Middle element of task array: " + getMiddle(taskArray));
        System.out.println("Middle element of point array: " + getMiddle(pointArray));

        // Get the maximum element of the arrays
        System.out.println("Maximum element of int array: " + getMax(intArray));
        System.out.println("Maximum element of double array: " + getMax(doubleArray));
        System.out.println("Maximum element of string array: " + getMax(stringArray));
    }

    public static <T> void print(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> void print(T[] array, int lower, int upper) {
        if (lower < 0 || upper >= array.length || lower > upper) {
            throw new IllegalArgumentException("Invalid range");
        }
        for (int i = lower; i <= upper; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static <T> T getMiddle(T[] array) {
        return array[array.length / 2];
    }

    public static <T extends Comparable<T>> T getMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
}
class Task {
    String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}