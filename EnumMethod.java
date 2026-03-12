public class EnumMethod {
    public static void main(String[] args) {
        Fruit f = Fruit.Apple;
        System.out.println("Fruit: " + f.getPrice()); // output: Fruit: 2
        Fruit f2 = Fruit(4); // This line will cause a compilation error because enums cannot be instantiated like this.
        System.out.println("Fruit: " + f2.getPrice()); // output: Fruit: 4
        // Fruit f3 = Fruit(); // This line will also cause a compilation error because enums cannot be instantiated without parameters.
        // why? empty constructor exists in enum below
        // Enums cannot be instantiated like regular classes because they are designed to represent a fixed set of constants. The empty constructor in the enum is not meant to be called directly; it is used internally by the Java compiler to create the enum constants. When you define an enum constant like Apple(2), the compiler automatically calls the constructor with the specified value (2 in this case) to initialize that constant. However, you cannot create new instances of the enum using the constructor directly, as enums are meant to be a predefined set of constants rather than a class that can be instantiated multiple times.
        Fruit f3 = Fruit.Strawberry; // This is the correct way to access an enum constant without parameters.
        System.out.println("Fruit: " + f3.getPrice()); // output: Fruit: -1
    }
}

enum Fruit {
    Apple(2), Banana(2), Grapes(3), Plum(4), Strawberry();

    private int price;

    Fruit() {
        this.price = -1;
    }

    Fruit(int p) {
        this.price = p;
    }
    int getPrice() {
        return price;
    }
    // why does constructors exist here?
    // Enums can have constructors to initialize their fields. In this case, the constructor is used to set the price for each fruit. When you define an enum constant like Apple(2), it calls the constructor with the value 2, which sets the price for that fruit. This allows you to associate specific data (like price) with each enum constant.
    // what would happen if I don't use constuctors in enums?
    // If you don't use constructors in enums, you won't be able to associate any additional data with the enum constants. In that case, you would only have the enum constants themselves without any additional properties or methods. For example, if you defined the Fruit enum without constructors, you would not be able to set or retrieve the price for each fruit, and you would only be able to use the enum constants as simple identifiers without any associated data.
    // is it like dictionary?
    // Enums are not exactly like dictionaries, but they can be used to achieve similar functionality. An enum is a special data type that represents a group of constants (unchangeable variables). Each constant in an enum can have associated data and methods, which allows you to store additional information about each constant. In this way, enums can be thought of as a more structured and type-safe way to represent a collection of related constants, similar to how a dictionary might store key-value pairs. However, enums are more restrictive than dictionaries because they are designed to represent a fixed set of constants, while dictionaries can have dynamic keys and values.
}

// ESC -> makes agent mode ai pop-up cancel.