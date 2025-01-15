/*
	Use polymorphism to change the output based on the Person reference type.
 */

public class Student extends Person{

    // creating Person class fields as private to avoid access outside the class
    private String studentId;
    private String course;
    private double gpa;

    public Student(String name, int age, String studentId, String course, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
        this.gpa = gpa;

    }

    @Override
    public void displayInfo() {
        System.out.println("Name : " + super.name);
        System.out.println("Age : " + super.age);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
    }
}
