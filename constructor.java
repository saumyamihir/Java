/*
Constructor is a special method that is used to initialize objects. 
The constructor is called when an object of a class is created. 
It can be used to set initial values for object attributes. 
A constructor has the same name as the class and does not have a return type.

Types of Constructors:
1. Default Constructor
2. Parameterized Constructor
3. Copy Constructor

*/

import java.util.*;

class Student 
{
    public static int count ;

    Student()
    {
        count++;
    }
}
class Main
{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(Student.count);
    }
}


