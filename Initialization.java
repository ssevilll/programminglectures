
public class Initialization {

    public static void main(String[] args) {
        int a;
        System.out.println("a = " + a); // This will cause a compile-time error because 'a' is not initialized.
        System.out.println("Hello, World!");
        Value v = new Value();
        System.out.println("v.b = " + v.b); // This will print 'v.b = 0' because 'b' is initialized to its default value.

        //int class fields default value for int is 0, but local variables must be initialized before use.
    }
}

class Value {

    int b;
}
