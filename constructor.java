/*
Constructor is a special method that is used to initialize objects. 
The constructor is called when an object of a class is created. 
It can be used to set initial values for object attributes. 
A constructor has the same name as the class and does not have a return type.

Types of Constructors:
1. Default Constructor : There is no constructor define in the class . Automatically java compiler will create a default constructor for the class . 
2. No Parametrized Constructor : we Dont have any parameter int the class and it is initialized by the direct class name.
3. Parameterized Constructor : We have parameter in the class and it is initialized by the giving value in the class .
4. Copy Constructor : Pass obj as a parameter in the constructor.it is used to copy the values from one object to another object.

*/

import java.util.*;

class Student 
{
    public static int count ;
    int a;
    int b;
    int c;

    // No Parametrized Constructor 

    Student()
    {
        count++;
    }


    // Parameterized Constructor

    Student(int a,int b)
    {
        this.a = a;
        this.b = b;
        count++;
    }
    Student(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        count++;
    }


    // Copy Constructor

    Student(Student obj)
    {
        a = obj.a;
        b = obj.b;
        // Copy the values of obj in a and b.
        count++;
    }

}
class Main
{
    public static void main(String[] args) {

        // Whenever we create obj always call constructor.

        // No Parametrized Constructor
        Student s1 = new Student();
        System.out.println(Student.count);

        // Parameterized Constructor
        Student s2 = new Student(3, 4);
        System.out.println(Student.count);
        Student s3 = new Student(3, 4, 5);
        System.out.println(Student.count);

        // Copy Constructor
        Student s4 =  new Student(s2);
        System.out.println(Student.count);
    }
}


