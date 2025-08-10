
public class Dog extends Animal {

    String breed;
    int lives = 1;

    Dog(String breed) {
        super(); // Call the constructor of Animal
        this.breed = breed;
    }

    void bark() {
        System.out.println("The dog is barking.");
    }

    @Override
    void eat() {
        System.out.println("The dog is eating.");
    }

}
