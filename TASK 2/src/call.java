//base class
class Person {
    String name = "user1";
    int age=30;
}

//subclass
class Employee extends Person {
    int employeeId = 564;
    int salary= 25000;
    void print(){

        System.out.println("Name: " + super.name);//super keyword used to inhert name and age from base class.
        System.out.println("Age: " + super.age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

}
public class call{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.print();
    }


}


