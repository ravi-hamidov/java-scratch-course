
public class Person {

    String first;
    String last;

    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    void showName() {
        System.out.println("Name: " + first + " " + last);
    }
}
