// Alt + Shift + F to format code in tab.
class MyEnums {
    enum Color {
        Red, Green, Blue, White, Black, Gray, Yellow
    };
}

public class EnumTest {
    public static void main(String[] args) {
        try {
            MyEnums.Color argCol = MyEnums.Color.valueOf(args[0]); // valueOf() is a static method of enum type that returns the enum constant of the specified string name.
            System.out.println("Exists: " + argCol);
        } 
        catch (java.lang.IllegalArgumentException iae) {
            System.out.println(args[0] + " does not exist. ");
            MyEnums.Color colors[] = MyEnums.Color.values();
            System.out.println("Choose one the following colors: ");
            for (MyEnums.Color c : colors)
                System.out.println(" - " + c);
        }
    }
}