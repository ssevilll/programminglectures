public class Final {
    public static void main(String[] args) {
        final String str = "Hello";
        str = new String(); // this will cause a compile-time error because str is declared as final, which
                            // means it cannot be reassigned to a new value. Once a final variable is
                            // assigned a value, it cannot be changed. In this case, we are trying to assign
                            // a new String object to the final variable str, which is not allowed.
        // because reference variable str is final, it cannot be reassigned to point to
        // a different object. However, the contents of the object that str points to
        // can still be modified if the object itself is mutable. In this case, since
        // String is immutable, we cannot modify the contents of the String object that
        // str points to either. Therefore, we cannot change the value of str or the
        // contents of the String object it references.
    }
}
