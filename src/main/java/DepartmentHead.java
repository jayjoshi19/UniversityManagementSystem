public class DepartmentHead extends Professor{

    private String officeRoom;
    public DepartmentHead(String name, int age, String employeeId, String department, double salary, String officeRoom) {
        super(name, age, employeeId, department, salary);
        this.officeRoom = officeRoom;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name : " + super.name);
        System.out.println("Age : " + super.age);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
        System.out.println("Office Room : " + officeRoom);    }
}
