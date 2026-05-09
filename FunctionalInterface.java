public class FunctionalInterface {
    public static void main(String[] args) {

    }

}

@java.lang.FunctionalInterface
interface MyFunctionalInterface {
    // a functional interface is an interface that has exactly one abstract method.
    // It can have any number of default or static methods, but it must have only
    // one abstract method. Functional interfaces are used as the basis for lambda
    // expressions and method references in Java, allowing for more concise and
    // flexible code when working with functional programming concepts.
    public void myMethod();

    public static void myStaticMethod() {
        System.out.println("This is a static method in a functional interface.");
    }

    public default void myDefaultMethod() {
        System.out.println("This is a default method in a functional interface.");
    }
}