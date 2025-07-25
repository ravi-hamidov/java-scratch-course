import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Weight converter program
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to the weight converter program!");
      

        System.out.println("Choose the conversion type:");
        System.out.println("1. Convert from Pounds to Kilograms");
        System.out.println("2. Convert from Kilograms to Pounds");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter your weight (with lbs): ");
            weight = scanner.nextDouble();
            // Convert from pounds to kilograms
            newWeight = weight / 2.20462;
            System.out.printf("Your weight in Kilograms is: %.2f kg%n", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter your weight (with kg): ");
            weight = scanner.nextDouble();
            // Convert from kilograms to pounds
            newWeight = weight * 2.20462;
            System.out.printf("Your weight in Pounds is: %.2f lbs%n", newWeight);
        } else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }
        scanner.close();
    }
}
