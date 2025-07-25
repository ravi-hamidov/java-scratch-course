public class App {
    public static void main(String[] args) throws Exception {
        
        // Example 1: Print numbers from 1 to 5
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++;
        }

        // Example 2: Sum numbers until total exceeds 10
        int sum = 0;
        int num = 1;
        while (sum <= 10) {
            sum += num;
            num++;
            System.out.println("Current sum: " + sum + ", adding: " + num);
        }
        System.out.println("Sum exceeded: " + sum);

        // Example 3: Infinite loop (be careful!)
        int count = 0;
        while (true) {
            System.out.println("This will run forever! Count: " + count);
            count++;
            if (count > 20) break; // Use break to exit
        }
    }
}
