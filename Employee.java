public class Employee extends Person {

    double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Method
    public void displaySalary() {
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("David", 30, 55000);
        e1.introduce();
        e1.displaySalary();
    }
}