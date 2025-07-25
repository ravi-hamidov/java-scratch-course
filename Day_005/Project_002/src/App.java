import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Compound interest calculator
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Welcome to the Compound Interest Calculator!");
            double principial;
            double rate;
            double timesCompounded;
            int years;
            double amount;
            
            System.out.println("Enter the principal amount: ");
            principial = scanner.nextDouble();

            System.out.println("Enter the annual interest rate (in %): ");
            rate = scanner.nextDouble() / 100;

            System.out.println("Enter the number of times interest is compounded per year: ");
            timesCompounded = scanner.nextInt();  

            System.out.println("Enter the number of years: ");
            years = scanner.nextInt();

            amount = principial * Math.pow((1 + rate / timesCompounded), timesCompounded * years);

            System.out.println("The amount after + " + years + " years is: " + "$" + amount);
        }
    }
}
