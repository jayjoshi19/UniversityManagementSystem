public class UniversityService {

    public static Person[] createPersons(){
        return new Person[] {
                new Student("Alice Smith", 20, "S1234", "Computer Science", 3.9),
                new Student("Jay Joshi", 30, "S1121", "Data Analysis", 3.6),
                new Student("Jackie Chan", 21, "S0012", "Business Analysis", 3.5),
                new Professor("Dr. John Doe", 45, "P4451", "Software Engineering", 95000),
                new Professor("Dr. Samir Chauhan", 39, "P1290", "Computer Engineering", 112000),
                new DepartmentHead("Dr. Sarah Lee", 57, "P9918", "Computer Science", 145000, "A-105")
        };
    }

    public static void displayPersons() {
        Person[] persons = createPersons();

        for (int i = 0; i < persons.length; i++) {

            if (persons[i].getType().equals(Student.class)) {
                System.out.println("---- Student ----");
                persons[i].displayInfo();
                University.incrementStudentCount();
            }

            else if (persons[i].getType().equals(Professor.class)) {
                System.out.println("---- Professor ----");
                persons[i].displayInfo();
                University.incrementProfessorsCount();
            } else {
                System.out.println("---- Department Head ----");
                persons[i].displayInfo();
                University.incrementDepartmentHeadCount();
            }
            System.out.println();
        }
    }

    public void showUniversityDetails() {

        displayPersons();
    }
}
