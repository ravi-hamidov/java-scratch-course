import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // if statements
        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if ( age >= 65 ){
            System.out.println("You are old school Pragmatic Software Engineer !");
        } else if ( age >= 18 ) {
            System.out.println("You are just a adult,but you can be a middle level engineer !");
        } else if ( age < 0 ) {
            System.out.print("You haven't born yet !");
        }

        scanner.close();
    }
}