
public class App {

    public static void main(String[] args) {

        // OOP concepts in Java
        Car car1 = new Car();
        Car car2 = new Car();

        // Accessing properties
        System.out.println("Car1 reference: " + car1);
        System.out.println("Car1 works: " + car1.isRunning);
        System.out.println("Car1 maker: " + car1.make);
        System.out.println("Car1 model: " + car1.model);
        System.out.println("------------------------------");
        // System.out.println("Car2 model: " + car2.model);

        System.out.println(car1.isRunning);
        car1.start();
        System.out.println(car1.isRunning);
        car1.stop();

        car1.drive();
        car1.brake();
    }

}
