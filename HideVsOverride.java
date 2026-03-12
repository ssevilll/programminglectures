public class HideVsOverride {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.makeSound(); // Haf-haf
        a2.makeSound(); // Meow
        a1.staticMethod(); // Static method in Animal
        // how do we call static method with an object of the class?
        // we can call static methods using the class name, but we can also call them
        // using an object of the class. However, when we call a static method using an
        // object, it is not overridden, it is hidden. So, in this case,
        // a1.staticMethod() will call the static method in the Animal class, not the
        // Dog class. Similarly, a2.staticMethod() will call the static method in the
        // Animal class, not the Cat class.
        a2.staticMethod(); // Static method in Animal
        // why is it like that? Because static methods are not overridden, they are
        // hidden.
        Animal.staticMethod(); // Static method in Animal
        Dog.staticMethod(); // Static method in Dog
        Cat.staticMethod(); // Static method in Cat

        // the reference type of a1 and a2 is Animal, so they can only call the static
        // method in the Animal class. If we want to call the static method in the Dog
        // or Cat class, we need to use the class name to call the static method. This
        // is because static methods are not polymorphic, they are resolved at compile
        // time based on the reference type, not the actual object type.
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Any sound");
    }

    public static void staticMethod() {
        System.out.println("Static method in Animal");
    }

}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Haf-haf");
    }

    public static void staticMethod() {
        System.out.println("Static method in Dog");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }

    public static void staticMethod() {
        System.out.println("Static method in Cat");
    }
}