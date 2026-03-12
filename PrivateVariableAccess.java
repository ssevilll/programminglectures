class test {
    private int x = 10; // instance variable

    public int getX() {
        return x;
    }
}

class test1 extends test {
}

public class PrivateVariableAccess {
    public static void main(String[] args) {
        test1 obj = new test1();
        System.out.println("Value of x using getX(): " + obj.getX()); // Accessing superclass variable through method
        // how can we access the variable x directly in test1 class without using getX()
        // method?
        // We cannot access the variable x directly in test1 class because it is private
        // in the superclass test. Private variables are not accessible outside the
        // class they are declared in, even in subclasses.
        // then how does child class use getX() method to access the value of x?
        // The child class can use the getX() method to access the value of x because
        // getX() is a public method in the superclass test. The child class inherits
        // the getX() method, which allows it to access the value of x indirectly
        // through the method. The getX() method provides a way to access the private
        // variable x without directly accessing it, thus maintaining encapsulation.
    }
}