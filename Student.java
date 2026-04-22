public class Student extends Person {

    String school;

    // Constructor
    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    // Override method
    @Override
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
        System.out.println("I attend " + school + ".");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Maria", 19, "Rutgers");
        s1.introduce();
    }
}