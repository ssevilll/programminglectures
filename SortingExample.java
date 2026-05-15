import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String firstName;
    String lastName;

    public Student(int i, String f, String l) {
        id = i;
        firstName = f;
        lastName = l;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}

public class SortingExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student st = new Student(1, "Abuzer", "Jalilov");
        list.add(st);
        st = new Student(2, "Rena", "Husenova");
        list.add(st);
        st = new Student(3, "Husnu", "Qeribov");
        list.add(st);
        Collections.sort(list);
        // This will cause a compile-time error because Student does not implement
        // Comparable

        // also has overload version of sort() where you pass comparator object as
        // anonymous class
        Collections.sort(list, new java.util.Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.firstName.compareTo(s2.firstName);
            }
        });
        // why in class it was compareTo() method and here compare() method? because in
        // first case we are implementing Comparable interface and in second case we are
        // implementing Comparator interface. why? because in first case we are
        // comparing current object with another object and in second case we are
        // comparing two different objects. so in first case we have compareTo() method
        // and in second case we have compare() method.

        // but didn't we override compareTo() method in Student class? yes we did, but
        // that is for sorting by id. if we want to sort by first name, we need to use
        // Comparator interface and override compare() method.

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.firstName.compareTo(s2.firstName);
            }
        });
        // what is the difference between Collections.sort() and List.sort() methods?
        // Collections.sort() is a static method that takes a list as an argument and
        // sorts it. List.sort() is an instance method that sorts the list on which it
        // is called. both methods use the same sorting algorithm, but List.sort() is
        // more efficient because it can take advantage of the fact that the list is
        // already sorted.
    }

}