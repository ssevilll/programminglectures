public class Generics {
    public static void main(String[] args) {
        A<Integer> a = new A<>();
        a.doIt(1, 2, 3, 4, 5);
        a.doIt(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Generics.<Double>printArray(1.1, 2.2, 3.3);
        printArray("a", "b", "c");
        printArray(1, "yes", 3.14, true);
        // how does this method can work with different types of arguments? the method
        // is defined with a type parameter T, which allows it to accept arguments of
        // any type. When we call the method, we can specify the type argument (like
        // <Double>) to indicate the specific type we want to use for that call. If we
        // do not specify a type argument, the compiler will infer the type based on the
        // arguments we pass to the method. This flexibility is one of the key features
        // of generics in Java, as it allows us to write code that can work with
        // different types without needing to duplicate code for each specific type.

        // is it because java will remove T during compile? yes, this process is called
        // type erasure. During compilation, the Java compiler removes all generic type
        // information and replaces it with raw types. This means that the type
        // parameter T is replaced with Object (or the upper bound if there is one) in
        // the compiled bytecode. As a result, the compiled code does not retain any
        // information about the specific types used in the generic method, which allows
        // it to work with different types of arguments at runtime. However, this also
        // means that we need to be careful when using generics, as we can encounter
        // issues like ClassCastException if we try to use the wrong type of argument
        // with a generic method.

    }

    private static <T> void printArray(T... arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }
}

class A<T> {
    public void doIt(T... args) {
        // the varargs parameter (T... args) allows us to pass a variable number of
        // arguments of type T to the method. This means that we can call the doIt
        // method with any number of arguments, and they will be treated as an array of
        // type T within the method. This provides flexibility in how we can use the
        // method, as we are not limited to a fixed number of parameters.
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}
