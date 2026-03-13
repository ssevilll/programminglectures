public class PrintingOrderInInheritedClasses {
    public static void main(String[] args) {
        Child child = new Child();

        // When we create an instance of the Child class, the constructor of the Parent
        // class is called first, followed by the constructor of the Child class. This
        // is because the Child class inherits from the Parent class, and the Parent
        // class's constructor is called before the Child class's constructor to ensure
        // that the Parent class is properly initialized before the Child class is
        // initialized. The output of this code will be:
        // Parent
        // Child

        // what if in child constructor we wrote sout("Child") before super()?
        // If you try to write System.out.println("Child") before calling super() in the
        // Child class constructor, you will get a compilation error. This is because
        // the call to super() must be the first statement in the constructor of a
        // subclass. The Java compiler enforces this rule to ensure that the superclass
        // is properly initialized before any code in the subclass is executed. So, you
        // cannot have any statements before the call to super() in the constructor of a
        // subclass. If you want to print "Child" before calling super(), you would need
        // to move the print statement after the call to super() in the Child class
        // constructor.


        // 1. Parent class constructor is called first to initialize the Parent class.
        // 2. After the Parent class constructor has completed, the Child class constructor is called to initialize the Child class.
        

    }
}

class Parent {
    public Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public Child() {
        super();

        System.out.println("Child");
    }
}
