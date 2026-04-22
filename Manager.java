public class Manager extends Employee {

    int teamSize;

    // Constructor
    public Manager(String name, int age, double salary, int teamSize) {
        super(name, age, salary);
        this.teamSize = teamSize;
    }

    // Override method
    @Override
    public void displaySalary() {
        System.out.println("Salary: $" + salary);
        System.out.println("I manage a team of " + teamSize + " people.");
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Tom", 28, 45000);
        Manager m1 = new Manager("Lisa", 40, 80000, 10);

        e1.introduce();
        e1.displaySalary();

        System.out.println();

        m1.introduce();
        m1.displaySalary();
    }
}