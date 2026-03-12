public class StringPool {
    public static void main(String[] args) {

        // \\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // \\\\\CASE 1: SAME LITERAL\\\\\
        // \\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        String a1 = "Java";
        String b1 = "Java";
        System.out.println("a1 == b1: " + (a1 == b1)); // true, because a1 and b1 refer to the same string literal in
                                                       // the string pool
        System.out.println("a1.equals(b1): " + a1.equals(b1)); // true, because equals() compares the content of the
                                                               // strings

        // \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // \\\\\CASE 2: NEW STRING VS LITERAL\\\\\
        // \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        String a2 = new String("Java");
        String b2 = "Java";
        System.out.println("a2 == b2: " + (a2 == b2)); // false, because a2 is a new object created on the heap, while
                                                       // b2 refers to the string literal in the string pool
        System.out.println("a2.equals(b2): " + a2.equals(b2)); // true, because equals() compares the content of the
                                                               // strings

        // \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // \\\\\CASE 3: COMPILE-TIME CONCATENATION \\\\
        // \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        String a3 = "Ja" + "va";
        String b3 = "Java";
        System.out.println("a3 == b3: " + (a3 == b3)); // true, because a3 is optimized to "Java" and stored in the
                                                       // string pool, which is the same as b3
        System.out.println("a3.equals(b3): " + a3.equals(b3)); // true, because equals() compares the content of the
                                                               // strings

        // \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // \\\\\CASE 4: RUNTIME CONCATENATION\\\\\
        // \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        String a4 = "Ja";
        String b4 = a4 + "va"; // This will not be optimized and will create a new string object on the heap
        String c4 = "Java";
        System.out.println("b4 == c4: " + (b4 == c4)); // false, because b4 is a new object created on the heap, while
                                                       // c4 refers to the string literal in the string pool
        System.out.println("b4.equals(c4): " + b4.equals(c4)); // true, because equals() compares the content of the
                                                               // strings

        // \\\\\\\\\\\\\\\\\\\\\\\\\\
        // \\\\\CASE 5: INTERN()\\\\\
        // \\\\\\\\\\\\\\\\\\\\\\\\\\
        String a5 = "ja";
        String b5 = a5 + "va"; // This will not be optimized and will create a new string object on the heap
        String c5 = b5.intern(); // This will return a reference to the string
        String d5 = "Java";
        System.out.println("b5 == c5: " + (b5 == c5)); // false, because b5 is a new object created on the heap, while
                                                       // c5 refers to the string literal in the string pool
        System.out.println("c5 == d5: " + (c5 == d5)); // true, because c5 is interned and refers to the same string
                                                       // literal in the string pool as d5
        System.out.println("b5.equals(c5): " + b5.equals(c5)); // true, because equals() compares the content of the
                                                               // strings

        // \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // \\\\\CASE 6: NEW STRING(), INTERN()\\\\\
        // \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        String a6 = new String("Java");
        String b6 = a6.intern(); // This will return a reference to the string literal "Java" in the string pool
        String c6 = "Java";
        System.out.println("a6 == b6: " + (a6 == b6)); // false, because a6 is a new object created on the heap, while
                                                       // b6 refers to the string literal in the string pool
        System.out.println("b6 == c6: " + (b6 == c6)); // true, because b6 is interned and refers to the same string
                                                       // literal in the string pool as c6
        System.out.println("a6.equals(b6): " + a6.equals(b6)); // true, because equals() compares the content of the
                                                               // strings

        // CONCLUSION:
        // In Java, string literals are stored in a special area of memory called the
        // string pool. When you create a string literal, Java checks if an identical
        // string already exists in the pool. If it does, it returns a reference to that
        // string. If not, it creates a new string in the pool and returns a reference
        // to it. The equals() method compares the content of the strings, so it returns
        // true for all cases where the content is the same, regardless of whether they
        // are the same object or not.



        // Main idea of string pool is to optimize memory usage by reusing string
        // literals. When you create a string literal, Java checks if an identical
        // string already exists in the string pool. If it does, it returns a reference
        // to that string. If not, it creates a new string in the pool and returns a
        // reference to it. This means that multiple string literals with the same
        // content will refer to the same object in memory, which can save memory and
        // improve performance. However, when you create a string using the new keyword,
        // it creates a new object on the heap, even if the content is the same as a
        // string literal in the pool. This is why using new String("Java") creates a
        // different object than the string literal "Java" in the pool. The intern()
        // method can be used to return a reference to the string literal in the pool,
        // which can be useful for optimizing memory usage when you have many strings
        // with the same content.

    }
}
