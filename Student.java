
// Constructor Overloading in Java
// Constructor Overloading: Same constructor name with different parameters
// It allows an object to be initialized in different ways

// import java.util.*;

//   public class Student{
//     Student()
//     {
//         System.out.println("No parameter constructor");
//     }
//     Student(int id)
//     {
//         System.out.println("Student id : " + id);
//     }
//     Student(int id ,String name)
//     {
//         System.out.println(" Student id : " + id + " Student name : " +name);
//     }
//     Student(String name)
//     {
//         System.out.println("Student name : " +name);
//     }
//     public static void main(String[] args) {
//             Student s1  = new Student();
//             Student s2  = new Student(32);
//             Student s3  = new Student(32 , "Sami");
//             Student s4  = new Student("Sami");


//         }
//     }


//  Constructor Chaining 
//  this() --> Call the constructor of same class
// super()  --> call the constructor of different class(parent class).it will only occur in inheritance.


import java.util.*;

  public class Student{
    Student()
    {
        this(32,"Sami");
        System.out.println("No parameter constructor");
    }
    Student(int id)
    {
        System.out.println("Student id : " + id);
    }
    Student(int id ,String name)
    {
        this(id);
        System.out.println(" Student id : " + id + " Student name : " +name);
    }
    Student(String name)
    {
        System.out.println("Student name : " +name);
    }
    public static void main(String[] args) {
            Student s1  = new Student();
            Student s2  = new Student(32);
            Student s3  = new Student(32 , "Sami");
            Student s4  = new Student("Sami");


        }
    }



