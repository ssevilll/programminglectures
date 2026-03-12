public class WrapperClasses {
    public static void main(String[] args) {
        // Wrapper classes in Java are used to convert primitive data types into
        // objects(encapsulates). Each primitive type has a corresponding wrapper class:
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // char -> Character
        // boolean -> Boolean

        // why do we need wrapper classes?
        // 1. Object Methods: Wrapper classes provide methods for converting between
        // types, parsing strings, and other utility functions that are not available
        // with primitive types. (e.g., Integer.parseInt() to convert a String to an
        // int).
        // 2. Collections: Java's collection framework (like ArrayList, HashMap, etc.)
        // can only store objects, so if you want to store primitive values in a
        // collection, you need to use their corresponding wrapper classes.
        // 3. Nullability: Wrapper classes can be null, which can be useful in certain
        // situations where you want to represent the absence of a value. Primitive
        // types cannot be null and will have default values (e.g., 0 for int, false for
        // boolean).

        // Advantages
        // 1. Call by reference: Wrapper classes are objects, so they are passed by
        // reference. This means that when you pass a wrapper class to a method, you can
        // modify the object inside the method, and the changes will be reflected
        // outside the method. Primitive types are passed by value, so they cannot be
        // modified inside a method.
        // 2. Data serialization: Wrapper classes can be serialized, which means they
        // can be converted into a byte stream and saved to a file or sent over a
        // network. Primitive types cannot be serialized directly.
        // 3. Data synchronization: Wrapper classes can be used in synchronized blocks
        // or methods to ensure thread safety when accessing shared data. Primitive
        // types cannot be used in synchronized blocks or methods.

        int primitiveInt = 42;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Boxing: converting primitive to wrapper
        int unboxedInt = wrapperInt.intValue(); // Unboxing: converting wrapper back to primitive

        System.out.println("Primitive int: " + primitiveInt); // 42
        System.out.println("Wrapper Integer: " + wrapperInt); // 42
        System.out.println("Unboxed int: " + unboxedInt); // 42

        // Autoboxing and Unboxing
        Integer autoBoxedInt = primitiveInt; // Autoboxing: automatic conversion from primitive to wrapper
        int autoUnboxedInt = autoBoxedInt; // Auto-unboxing: automatic conversion from wrapper to primitive

        System.out.println("Autoboxed Integer: " + autoBoxedInt); // 42
        System.out.println("Auto-unboxed int: " + autoUnboxedInt); // 42

        // can all primitive and corresponding wrapper class be boxed automatically?
        // Yes, all primitive types and their corresponding wrapper classes can be
        // autoboxed and auto-unboxed automatically by the Java compiler. This feature
        // was introduced in Java 5 to simplify the code and reduce the need for
        // explicit conversions between primitives and their wrapper classes. So you can
        // use autoboxing and auto-unboxing with any of the primitive types (byte,
        // short, int, long, float, double, char, boolean) and their corresponding
        // wrapper classes (Byte, Short, Integer, Long, Float, Double, Character,
        // Boolean) without any issues.
    }
}
