
public class App{

    public static void main(String[] args) {
        User user1 = new User("Alice");
        User user2 = new User("Bob", "33@gmail.com");
        User user3 = new User("Ali", "42@gmail.com", 33);
        User user4 = new User();

        System.out.println(user4.name);
        System.out.println(user4.email);
        System.out.println(user4.age);
        System.out.println(user3.name);
        System.out.println(user3.email);
        System.out.println(user3.age);
    }
}
