public class InitializationBlock {
    public static void main(String[] args) {
        Example example = new Example();

        // When you run this code, the output will be:
        // This is a static initialization block.
        // This is an instance initialization block.
        // This is the constructor.

        // The static initialization block is executed only once when the class is
        // loaded, while the instance initialization block is executed every time an
        // instance of the class is created, before the constructor is called. In this
        // example, when we create an instance of the Example class, the static
        // initialization block runs first (if it hasn't already been executed),
        // followed by the instance initialization block, and finally the constructor.

        // if we create another instance of the Example class, the output will be:

        Example example2 = new Example();

        // This is an instance initialization block.
        // This is the constructor.

        // The static initialization block will not run again because it has already
        // been executed when the class was loaded. However, the instance initialization
        // block and the constructor will run again for the new instance of the Example
        // class.
    }
}

// An initialization block in Java is a block of code that is executed when an
// instance of a class is created. It is used to initialize instance variables
// or perform any setup tasks that need to be done when an object is
// instantiated. There are two types of initialization blocks in Java: instance
// initialization blocks and static initialization blocks.

class Example {
    int x;
    static int y;
    // Instance initialization block
    {
        x = 10;

        // y=10; // This is allowed because static variables can be accessed from
        // instance initialization blocks, but it is generally not recommended to modify
        // static variables in instance initialization blocks.

        System.out.println("This is an instance initialization block.");
    }

    // Static initialization block
    static {

        // x=20; // This will cause a compile-time error because static blocks cannot
        // access instance variables directly.
        y = 20; // This is allowed because y is a static variable.
        System.out.println("This is a static initialization block.");
    }

    public Example() {
        System.out.println("This is the constructor.");
    }
}