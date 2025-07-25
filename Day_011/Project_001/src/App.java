public class App {
    // Local & Class Scope Example

    static int x = 3; // Class scope
    public static void main(String[] args) throws Exception {
        // int x = 1; // Local scope

        doSomething();
    }

    static void doSomething() {
        // int x = 2; // Local scope

        System.out.println(x);
    }
}
