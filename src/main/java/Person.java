public class Person {

    String name;
    int age;

    // usage of this keyword
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // a final method getType() that returns "Person"
    public final String getType(){
        return "Person";
    }
}
