public class LongVsCompact {
    public static void main(String[] args) {
        Account account1 = new Account("john doe", -100, "savings");
        System.out.println(account1.accountType()); // savings
        // why is accountType() like a method? Because it's a record, and records automatically generate accessor methods for their components.
        // what is accessor methods and why because of that component is method? Accessor methods are methods that allow you to access the values of the components of a record. In a record, each component is automatically given an accessor method with the same name as the component. So, in this case, accountType() is an accessor method that allows you to access the value of the accountType component of the Account record.
    }
}
record Account (String customerName, double balance, String accountType) { // when declaring record, there has to be inputs in the parentheses. These are called components. They are like fields in a class, but they are final and immutable. They are also automatically given accessor methods with the same name as the component.

    public Account{ // compact constructor only exists in record.
        customerName = customerName == null || customerName.trim().isEmpty()? "Unnamed Customer" : customerName;
        customerName = customerName.substring(0,1).toUpperCase() + customerName.substring(1).toLowerCase();
        balance = balance < 0 ? 0 : balance;
    }
    // LONG CONSTRUCTOR'S JOB IS DONE IMPLICITLY. WE DON'T NEED THIS. = INPUT THING.
}