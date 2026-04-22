public class Person {

    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }

    // Main method
    public static void main(String[] args) {
        Person p1 = new Person("John", 20);
        p1.introduce();
    }
}