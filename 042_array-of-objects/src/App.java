
public class App {

    public static void main(String[] args) throws Exception {
        // Car car1 = new Car("Mustang", "blue");
        // Car car2 = new Car("Civic", "red");
        // Car car3 = new Car("Model S", "black");

        Car[] cars = {
            new Car("Mustang", "blue"),
            new Car("Civic", "red"),
            new Car("Model S", "black")
        };

        // Car[] cars = {car1, car2, car3};
        // for (int i = 0; i < cars.length; i++) {
        //     cars[i].drive();
        // }
        for (Car car : cars) {
            car.color = "black"; // Change color of each car to black
        }
        for (Car car : cars) {
            car.drive();
        }
    }
}
