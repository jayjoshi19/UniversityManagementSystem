
/*
- Set the university name using the static method in the University class.
- Create an array of Person references containing a mix of Student, Professor, and DepartmentHead objects.
- Iterate over the array and call displayInfo() on each object (demonstrating polymorphism).
- Increment the totalStudents and totalProfessors counters whenever a Student or Professor object is added.
- Display the university statistics at the end.

 */
public class Main {
    public static void main(String[] args) {

        UniversityService service = new UniversityService();

        //University.setUniversityName("Global Tech University");
        System.out.println();
        //System.out.println("University Name : "+University.getUniversityName());
        System.out.println("University Name : Global Tech University");
        System.out.println();

        service.showUniversityDetails();

        University.getStatistics();

    }
}
