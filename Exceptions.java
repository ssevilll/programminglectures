public class Exceptions {
    public static void main(String[] args) {
        try {
            int result = 10/0; // this will throw an ArithmeticException
            System.out.println("Result: " + result);
        } catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            // the finally block is always executed, regardless of whether an exception was thrown or caught
            //even instead of throwing an exception, if we just return from the try block, the finally block will still be executed
            System.out.println("This will always be executed.");
        }
        //instead of trying different catch blocks, we can also catch the parent exception class, which is Exception
        // catch (Exception e) {
        //     System.out.println("Caught an exception: " + e.getMessage());
        // }


        
        
        
    }
    
    //using the throws keyword to declare that a method can throw an exception instead of handling it with a try-catch block
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    //using custom exceptions to provide more specific error messages and handle specific error conditions in a more controlled way
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
    }
}


// creating a custom exception by extending the Exception class or any of its subclasses (like RuntimeException for unchecked exceptions)
//it is better to override the constructor of the custom exception to accept a message that can be passed to the superclass constructor, which can then be retrieved later using the getMessage() method when the exception is caught
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
