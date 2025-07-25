import java.util.Random;

public class Main {
    public static void main(String[] args) {
//         Random random = new Random();
//         int number;
//         number = random.nextInt(1,6);
//         System.out.println(number);
        // *****************************
//            Random random = new Random();
//            int number;
//            number = random.nextInt();
//            System.out.println(number);
        // *****************************
        Random random = new Random();
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1,666);
        number2 = random.nextInt(1,666);
        number3 = random.nextInt(1,666);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}