public class App {
    public static void main(String[] args)  {
        
        boolean a = true;
        boolean b = false;
        System.out.println("a && b: " + (a && b)); // false

        System.out.println("a || b: " + (a || b)); // true

        System.out.println("!a: " + (!a)); // false
        System.out.println("!b: " + (!b)); // true

        int x = 5;
        int y = 10;
        System.out.println("(x > 0 && y > 0): " + (x > 0 && y > 0)); // true
        System.out.println("(x < 0 || y > 0): " + (x < 0 || y > 0)); // true
        System.out.println("!(x == y): " + !(x == y)); // true
    }
}
