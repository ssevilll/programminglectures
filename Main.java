public class Main {
    public static void main(String[] args) {
        Account account = new Account(12345, "John Doe", 1000.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        Animal animal1 = new Animal("Charlie", "Bob", 3);
        Animal animal2 = new Animal("Charlie", "Bob", 3);
        Dog dog1 = new Dog("Buddy", "Alice", 5, "Golden Retriever");
        Dog dog2 = new Dog("Buddy", "Alice", 5, "Golden Retriever");
        Dog dog3 = new Dog("Charlie", "Bob", 3, "Labrador"); // same properties as animal1 but different class
        System.out.println("Animal 1: " + animal1);
        System.out.println("Animal 2: " + animal2);
        System.out.println("Dog 1: " + dog1);
        System.out.println("Dog 2: " + dog2);
        System.out.println("Dog 3: " + dog3);
        System.out.println("Animal 1 equals Animal 2: " + animal1.equals(animal2));
        System.out.println("Dog 1 equals Dog 2: " + dog1.equals(dog2));
        System.out.println("Animal 1 equals Dog 1: " + animal1.equals(dog1)); // should return false because they are different classes
        System.out.println("Animal 1 equals Dog 3: " + animal1.equals(dog3)); // should return false because they are different classes even though they have the same properties

        try {
            animal1.setAge(-1); // should throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Animal 1 age after setting to -1: " + animal1.getAge()); // should return 0 because we set the default age to 0 if invalid age is provided
        try {
            account.withdraw(200.0);
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
