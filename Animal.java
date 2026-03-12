public class Animal {
    private String animalName;
    private String ownerName;
    private int age;
    public Animal(String animalName, String ownerName, int age) {
        this.animalName = animalName;
        this.ownerName = ownerName;
        this.age = age;
    }
    public String getAnimalName() {
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;}
    public String getOwnerName() {
        return ownerName;}
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;}
    public int getAge() {
        return age;}
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
            throw new IllegalArgumentException("Age must be a positive integer.");
        }
    }
    
    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", age=" + age +
                '}';}
    @Override // if we didn't override, we could just write Animal obj as argument.
    public boolean equals(Object obj) {       
        if (obj == null || getClass() != obj.getClass()) return false; // why do we need to check if obj is null or if the classes are different? because if obj is null, we cannot cast it to Animal and it will throw a NullPointerException. If the classes are different, we cannot compare them and it will return false.
        Animal animal = (Animal) obj;
        return age == animal.age &&
                animalName.equals(animal.animalName) &&
                ownerName.equals(animal.ownerName);
    }
}
