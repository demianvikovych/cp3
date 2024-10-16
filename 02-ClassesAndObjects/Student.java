public class Student {
    String name;
    int age;
    String studentID;
    boolean valid;
    int semesterNumber;
    double AverageGrade;

    
    public Student(String name, int age) {
        this.name = (name);
        this.age = (age);
        
    }
    
     void sayHello() {
        System.out.println("Hello from " + name);
    }
    void displayName() {
        System.out.println("Student's name is: " + name);
    }
    void displayAge() {
        System.out.println("Student's age is: " + age);
    }
    

    public static void main(String[] args) {
        Student student = new Student("John", 21);
        
        
        student.sayHello();
        student.displayName();
        student.displayAge();
    }
}