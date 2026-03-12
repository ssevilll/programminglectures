public class Dog extends Animal {
    private String breed;
    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Dog{" +
                "breed='" + breed + '\'' + 
                '}'; // why this.breed? because breed is a instance variable, we can access it directly without using this keyword, but we can also use this keyword to make it clear that we are referring to the instance variable.
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false; // why do we need to call super.equals(obj)? because we want to compare the properties of the parent class (Animal) first before comparing the properties of the child class (Dog). If the properties of the parent class are not equal, then we can return false without comparing the properties of the child class.
        Dog dog = (Dog) obj;
        return breed.equals(dog.breed);
    }
}
