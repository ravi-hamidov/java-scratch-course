
public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Alice Smith", 20, 3.8, true);
        Student student2 = new Student("Bob Johnson", 22, 3.5, false);
        Student student3 = new Student("Charlie Brown", 19, 3.9, true);

        System.out.println("Student 1 Name: " + student1.name);
        System.out.println("Student 1 Name: " + student1.age);
        System.out.println("Student 1 Name: " + student1.gpa);
        System.out.println("Student 1 Name: " + student1.isEnrolled);

        System.out.println("Student 2 Name: " + student2.name);
        System.out.println("Student 2 Name: " + student2.age);
        System.out.println("Student 2 Name: " + student2.gpa);
        System.out.println("Student 2 Name: " + student2.isEnrolled);

        student3.displayInfo();
    }
}
