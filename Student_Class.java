import java.util.*;

class Student {
    int Id;
    String name;
    int marks;

    Student(int Id, String name, int marks) {
        this.Id = Id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student Id is : " + Id);
        System.out.println("Student name is : " + name);
        System.out.println("Student marks is : " + marks);
    }

    void grade() {
        if (marks <= 50) {
            System.out.println("Student is Fail");
        } else if (marks <= 80) {
            System.out.println("Student is Average");
        } else if (marks >= 90) {
            System.out.println("Student is Excellent");
        }
    }

}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(01, "Mihir", 90);
        Student s2 = new Student(02, "Saumya ", 80);
        Student s3 = new Student(03, "Sami", 50);
        s1.display();
        s1.grade();
        s2.display();
        s2.grade();
        s3.display();
        s3.grade();
    }
}
