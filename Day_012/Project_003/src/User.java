
public class User {

    String name;
    String email;
    int age;

    User() {
        this.name = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username) {
        this.name = username;
        this.email = "Not provided";
        this.age = 0;
    }

    User(String username, String email) {
        this.name = username;
        this.email = email;
        this.age = 0;
    }

    User(String username, String email, int age) {
        this.name = username;
        this.email = email;
        this.age = age;
    }

}
