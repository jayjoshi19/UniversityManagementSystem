public class Professor extends Person{

    String employeeId;
    String department;
    double salary;

    public Professor(String name, int age, String employeeId, String department, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name : " + super.name);
        System.out.println("Age : " + super.age);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Department : " + department);
        System.out.println("Salary : $" + salary);
    }
}
