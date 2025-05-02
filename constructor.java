
class Student {
    String name;
    int age;

    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class constructor {
    public static void main(String[] args) {
        
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);
      
        System.out.println("Student 1:");
        s1.displayInfo();

        System.out.println("\nStudent 2:");
        s2.displayInfo();
    }
}
