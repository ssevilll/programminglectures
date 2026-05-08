public class BoundedTypes {
    public static void main(String[] args) {
    }
}

class NumberArrayOps<T extends Number> {
    // the type parameter T is bounded by the Number class, which means that it can
    // only be instantiated with types that are subclasses of Number (like Integer,
    // Double, etc.). This allows us to use the methods of the Number class (like
    // doubleValue()) on the elements of the array, while still maintaining type
    // safety and flexibility in our code.
    private T[] arr;

    public NumberArrayOps(T[] arr) {
        this.arr = arr;
    }

    public double sum() {
        double sum = 0.0;
        for (T num : arr) {
            sum += num.doubleValue();
        }
        return sum;
    }
}

interface SomeInt<T extends Number> {
    void doSomething(T num);
}

// when implementing the SomeInt interface, we need to specify a type argument
// that is a subclass of Number, which is required by the bounded type parameter
// T in the interface declaration. This ensures that the implementation of the
// doSomething method can safely use the methods of the Number class on the
// parameter num without violating type safety.
class someIntImpl<T extends Number> implements SomeInt<T> {
    @Override
    public void doSomething(T num) {
        System.out.println("Doing something with: " + num);
    }
}
