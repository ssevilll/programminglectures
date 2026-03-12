public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // why not this.balance += amount; ? because balance is a instance variable, we can access it directly without using this keyword
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            throw new InvalidAmountException("Invalid withdrawal amount or insufficient funds.");
        }
    }
    
}
class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String message) {
        super(message); // unchecked exception, we don't need to declare it in the method signature
        // runtime exception is a type of exception that can be thrown during the normal operation of the Java Virtual Machine. It is a subclass of Exception and is not checked at compile time, meaning that the programmer does not need to handle it explicitly. Examples of runtime exceptions include NullPointerException, ArrayIndexOutOfBoundsException, and IllegalArgumentException.
    }
}
