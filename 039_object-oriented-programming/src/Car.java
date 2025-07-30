
public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2021;
    String color = "Red";
    double price = 55000.00;
    boolean isRunning = false;

    void start() {
        isRunning = true; // Example of accessing a property
        System.out.println("Car is starting...");
    }

    void stop() {
        isRunning = false; // Example of accessing a property
        System.out.println("Car is stopping...");
    }

    void drive() {
        if (isRunning) {
            System.out.println("You are driving the " + make + " " + model + ".");
        } else {
            System.out.println("Start the car first!");
        }
    }

    void brake() {
        if (!isRunning) {
            System.out.println("Actually, you can't brake a stopped car!");
        } else {
            System.out.println("You are braking the " + make + " " + model + ".");
        }
    }
}
