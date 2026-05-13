import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Account implements Comparable<Account> {

    public String firstname;
    public String lastname;
    public double balance;

    public Account(String firstname, String lastname, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getFullName() {
        return this.firstname + " " + this.lastname;
    }

    @Override
    public int compareTo(Account other) {
        return this.getFullName().compareTo(other.getFullName());
    }

}

public class Comparing {
        public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("John", "Doe", 1000.0));
        accounts.add(new Account("Jane", "Smith", 2000.0));
        accounts.add(new Account("Alice", "Johnson", 1500.0));

        for (Account account : accounts) {
            System.out.println(account.toString());
        }

        accounts.sort(null); // Sorts using the natural ordering defined by compareTo
        System.out.println("Sorted accounts:");
        for (Account account : accounts) {
            System.out.println(account.toString());
        }

        Comparator<Account> balanceComparator =  new Comparator<Account>() {
            @Override
            public int compare(Account a1, Account a2) {
                return Double.compare(a1.balance, a2.balance);
            }
        };
        accounts.sort(balanceComparator);
        System.out.println("Sorted accounts (by balance):");
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
    }
}
