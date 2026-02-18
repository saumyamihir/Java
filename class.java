import java.util.*;

class Student {

    //Fields(Variables)
    
    String name;
    int rollno;


    //Constructor(is a method which don't have any return type )
    //Name of the constructor same as the class name .
    //called automatically and initalize variables.

    Student(String name , int rollno ) 
    {
        this.name = name;
        this.rollno = rollno;
    }
    
    
    //Methods(Functions)

    void display()
    {
        System.out.println("Student name is : "+ name);
        System.out.println("Student roll no is : "+ rollno);
    }

}

 class Main {
    public static void main(String[] args) 
    {
        Student s1 = new Student("Mihir", 06 );
        Student s2 = new Student("Saumya",06);
        s1.display();
        s2.display();
    }
}