import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username;
        String email;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if( email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Here your domain: " + domain);
            System.out.println("Here your name: " + username);
        } else {
             System.out.println("Invalid email format ! Email need to contain '@' character.");
        }

        scanner.close();
    }
}
