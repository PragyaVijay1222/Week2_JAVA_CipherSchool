// Class demonstrating encapsulation
class Student {
    // Private variables
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter methods for private variables
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    // Setter methods for private variables
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating an object of Student class
        Student student1 = new Student("John", 20, "A");

        // Accessing private variables using getter methods
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());

        // Modifying private variables using setter methods
        student1.setName("Alice");
        student1.setAge(22);
        student1.setGrade("B");

        // Accessing modified private variables
        System.out.println("\nModified values:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Grade: " + student1.getGrade());
    }
}
