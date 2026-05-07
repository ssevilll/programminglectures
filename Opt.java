
import java.util.Optional;

public class Opt {
    public static void main(String[] args) {
        Optional <String> optional = startWith("Hello");
        // Optional is a container object which may or may not contain a non-null value. If a value is present, isPresent() will return true and get() will return the value.
        // Optional is used to avoid null pointer exceptions and to provide a more functional programming style when dealing with potentially null values. It provides methods to check for the presence of a value, to retrieve the value if it is present, and to provide a default value if the value is not present.
        if (optional.isPresent()) {
            System.out.println("Value is present: " + optional.get());
            //if the value is present, we can use the get() method to retrieve the value from the Optional object. 
        } else {
            System.out.println("Value is not present.");
        }
    }

    public static Optional<String> startWith(String str) {
        if (str != null && !str.isEmpty()) {
            return Optional.of(str);
        } else {
            return Optional.empty();
        }
    }
}
