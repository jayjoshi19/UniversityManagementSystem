
/*
- Set the university name using the static method in the University class.
- Create an array of Person references containing a mix of Student, Professor, and DepartmentHead objects.
- Iterate over the array and call displayInfo() on each object (demonstrating polymorphism).
- Increment the totalStudents and totalProfessors counters whenever a Student or Professor object is added.
- Display the university statistics at the end.

 */
public class Main {

    public static void main(String[] args) {

        University.setUniversityName("Global Tech University");

        Person[] persons = new Person[5];
        persons[0] = new Student("Alice Smith", 20, "S1234", "Computer Science", 3.9);
        persons[1] = new Student("Jay Joshi", 30, "S1121", "Data Analysis", 3.6);
        persons[2] = new Professor("Dr. John Doe", 45, "P4451", "Software Engineering", 95000);
        persons[3] = new Professor("Dr. Samir Chauhan", 39, "P1290", "Computer Engineering", 112000);
        persons[4] = new DepartmentHead("Dr. Sarah Lee", 57, "P9918", "Computer Science", 145000, "A-105");

        for (Person p : persons) {
            p.displayInfo();
            System.out.println();
        }

        System.out.println("--- University Statistics ---");
        System.out.println("Total Students : " + University.totalStudents);
        System.out.println("Total Professors : " + University.totalProfessors);
    }
}
