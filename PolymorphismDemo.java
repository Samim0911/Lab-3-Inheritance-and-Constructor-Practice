public class PolymorphismDemo {

    public static void main(String[] args) {

        Person[] people = new Person[3];

        people[0] = new Person("Alex", 22);
        people[1] = new Student("Nina", 18, "Rutgers");
        people[2] = new Employee("Mark", 35, 60000);

        for (Person p : people) {
            p.introduce();
            System.out.println();
        }
    }
}