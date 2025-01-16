public class University {

    static String universityName;
    static int totalStudents;
    static int totalProfessors;

    static int totalDepartmentHeads;

    public static String getUniversityName() {
        return universityName;
    }

    public static String setUniversityName(String universityName) {
        return universityName;
    }

    public static void incrementStudentCount() {
        totalStudents++;
    }

    public static void incrementProfessorsCount(){
        totalProfessors++;
    }

    public static void incrementDepartmentHeadCount() {
        totalDepartmentHeads ++;
    }

    public static void getStatistics(){
        System.out.println();

        System.out.println("--- University Statistics ---");

        System.out.println("Total Students : " + totalStudents);
        System.out.println("Total Professors : " + totalProfessors);
    }

}
