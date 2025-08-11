
public class Student extends Person {

    String first;
    String last;
    int gpa;

    Student(String first, String last, int gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    void showGpa() {
        System.out.println("Name: " + first + " " + last + ", Grade: " + gpa);
    }
}
