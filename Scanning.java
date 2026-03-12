
import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: " + userInput);
        scanner.close();
        // why do we need to close the scanner? Because it is a good practice to release
        // resources when they are no longer needed. Closing the scanner will free up
        // any resources associated with it, such as memory and file handles.
        // Additionally, if the scanner is reading from a file or network stream,
        // closing it will ensure that the underlying stream is also closed properly.
        // so even if we dont close the scanner, the program will still work, but it may
        // lead to resource leaks if we create multiple scanners without closing them.





        //ANOTHER WAY TO READ USER INPUT WITHOUT USING SCANNER CLASS:
        
        /*
        * public static void main(String[] args) throws IOException {
        * int userInput = (int)System.in.read();
        * }
        */

        // in this case, we would need to handle IOException, and it would read a single
        // byte from the input stream, which may not be what we want if we are trying to
        // read an integer. The Scanner class provides a more convenient way to read
        // different types of input, including integers, and it also handles the
        // necessary parsing and error handling for us.

        // also we need to cast the result of System.in.read() to int because it returns
        // an int representing the byte read, and we want to store it in an integer
        // variable. However, using Scanner is generally recommended for reading user
        // input in Java, as it provides more functionality and is easier to use for
        // various types of input.

    }
}
