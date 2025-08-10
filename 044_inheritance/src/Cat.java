
public class Cat extends Animal {

    String color;
    int lives = 9;

    Cat(String color) {
        super(); // Call the constructor of Animal
        this.color = color;
    }

    void meow() {
        System.out.println("The cat is meowing.");
    }

    @Override
    void eat() {
        System.out.println("The cat is eating.");
    }

}
