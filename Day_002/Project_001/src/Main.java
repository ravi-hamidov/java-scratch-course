import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Scanners

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.next();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your GPA: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("You are Student ? (true/false) ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old.");
//        System.out.println("Your GPA is " + gpa);
//        System.out.println("Student: " + isStudent);
//
//        if (isStudent) {
//            System.out.print("You are Student!");
//        } else {
//            System.out.print("You are not Student!");
//        }
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        // Calculate area of reactAngle

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width:");
        width = scanner.nextDouble();

        System.out.print("Enter the height:");
        height = scanner.nextDouble();

        area = height * width;

        System.out.print("The area is "+ area);

        scanner.close();
    }
}