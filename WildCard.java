
import java.util.List;

public class WildCard {
    public static void main(String[] args) {

    }

    public void printList(List<?> list) {
        // the wildcard character (?) is used to represent an unknown type in a generic
        // type declaration. It can be used in method parameters, return types, and
        // variable declarations to indicate that the type can be any type. This allows
        // for greater flexibility and reusability of code, as the same method can work
        // with different types of lists without needing to specify the exact type.
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    //upper bound wildcard
    public void PrintList(List<? extends Number> list) {
        // the wildcard with an upper bound (<? extends Number>) is used to indicate
        // that the type can be any type that is a subclass of the specified upper
        // bound (in this case, Number). This allows us to use the methods of the
        // Number class on the elements of the list, while still maintaining flexibility
        // in our code. However, we cannot add elements to the list because we do not
        // know the specific type of the elements in the list, and adding an element of
        // an incompatible type would violate type safety.
        for (Number num : list) {
            System.out.println(num.doubleValue());
        }
    }

    //lower bounded wildcard
    public void calcProperties(List<? super Integer> list) {
        // the wildcard with a lower bound (<? super Integer>) is used to indicate
        // that the type can be any type that is a superclass of the specified lower
        // bound (in this case, Integer). This allows us to add elements of the
        // specified lower bound type (Integer) and its subclasses to the list, while
        // still maintaining flexibility in our code. However, we cannot use the
        // methods of the Integer class on the elements of the list because we do not
        // know the specific type of the elements in the list, and using a method of an
        // incompatible type would violate type safety.
        list.add(42); // we can add an Integer to the list because it is a subclass of Integer
    }
}
