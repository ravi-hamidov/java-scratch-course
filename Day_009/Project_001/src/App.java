
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature:");
        temp = scanner.nextDouble();

        System.out.println("Enter the unit (C for Celsius, F for Fahrenheit):");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp = (temp * 9/5) + 32) : (temp = (temp - 32) * 5/9);

        System.out.printf("%.1f°%s", newTemp, unit);

        scanner.close();
    }
}
