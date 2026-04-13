//  Generic .> 
// 1. Reusability

// import java.util.*;
// class Demo{
//     int a ;
//     Demo(int a)
//     {
//         this.a = a ;
//     }
//     void print()
//     {
//         System.out.println("Value of a is "+ a);
//     }
// }
// class Demo1
// {
//     String a ;
//     Demo1(String a)
//     {
//         this.a = a ;
//     }
//     void print()
//     {
//         System.out.println("Value of a is : "+a);
//     }
// }
// public class Generic {
//     public static void main(String[] args) {
//         Demo obj = new Demo(34);
//         obj.print();
//         Demo1 obj1 = new Demo1("Sami");
//         obj1.print();
//     }
// }

// Reusability of code -> For One Variable
// import java.util.*;

// class Demo<T> {
//     T a;

//     Demo(T a) {
//         this.a = a;
//     }

//     void print() {
//         System.out.println("Value of a is: " + a);
//     }

// }

// public class Generic {
//     public static void main(String[] args) {
//         Demo<String> obj = new Demo<>("Sami");
//         obj.print();
//         Demo<Integer> obj1 = new Demo<>(6);
//         obj1.print();
//         Demo<Float> obj2 = new Demo<>(1.0f);
//         obj2.print();
//         Demo<Double> obj3 = new Demo<>(1.0);
//         obj3.print();

//     }
// }

// // Reusability of code -> For Two Variable
// import java.util.*;

// class Pair<k,v> {
//     k a;
//     v b;

//     Pair(k a , v b) {
//         this.a = a;
//         this.b = b;
//     }

//     void print() {
//         System.out.println("Value of a is: " + a);
//         System.out.println("Value of b is: "+b);
//     }

// }

// public class Generic {
//     public static void main(String[] args) {
//         Pair<String,Integer> obj = new Pair<>("Sami",2);
//         obj.print();
//         Pair<Integer,String> obj1 = new Pair<>(6,"abc");
//         obj1.print();
//         Pair<Float,String> obj2 = new Pair<>(1.0f,"bgc");
//         obj2.print();
//         Pair<Double,Float> obj3 = new Pair<>(1.0,20.9f);
//         obj3.print();

//     }
// }

// Reusability of code -> For Three Variable
// import java.util.*;

// class Triple<x,y,z> {
//     x a;
//     y b;
//     z c;

//     Triple(x a , y b , z c) {
//         this.a = a;
//         this.b = b;
//         this.c = c;
//     }

//     void print() {
//         System.out.println("Value of a is: " + a);
//         System.out.println("Value of b is: "+b);
//         System.out.println("Value of c is: "+c);
//     }

// }

// public class Generic {
//     public static void main(String[] args) {
//         Triple<String,Integer,Double> obj = new Triple<>("Sami",2,1.0);
//         obj.print();
//         Triple<String,String,String> obj1 = new Triple<>("bgc","abc","nhj");
//         obj1.print();
//         Triple<Integer,Float,String> obj2 = new Triple<>(9,1.0f,"bgc");
//         obj2.print();
//         Triple<Double,Float,Integer> obj3 = new Triple<>(1.0,20.9f,0);
//         obj3.print();

//     }
// }

// 2. Type Safety -> we can convert run time to compile time error.So we remove error during complation easily.
// getters and satters
// private number class we access with the help of getter and setter method.

// import java.util.*;
// class Demo
// {
//     private int a ;
//     // this method update the value of a. a is private variable of Demo class.
//     public void setData(int a)
//     {
//         this.a = a;
//     }
//     public int getData()
//     {
//         return a;
//     }
// }
// class Generic{
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         //System.out.println(d.a);
//         d.setData(45);
//         System.out.println("Value of a : "+ d.getData());
//     }
// }

// ------------------------------------------ QUESTION ------------------------------------------------------------

// Student marks and Student name is private member of Student class.
// Create getters and setters for both.

// import java.util.*;
// class StudentClass
// {
//     private int Student_Marks ;
//     private String Student_name ;

//     // this method update the value of a. a is private variable of Demo class.
//     public void setMarks(int Student_Marks )
//     {
//         this.Student_Marks = Student_Marks;
//     }
//     public int getMarks()
//     {
//         return Student_Marks;
//     }
//     public void setname(String Student_name )
//     {
//         this.Student_name = Student_name;
//     }
//     public String getname()
//     {
//         return Student_name;
//     }
// }
// class Generic{
//     public static void main(String[] args) {
//         StudentClass s = new StudentClass();
//         s.setMarks(85);
//         s.setname("Sami");
//         System.out.println("Student Marks : "+ s.getMarks());
//         System.out.println("Student Name : "+ s.getname());
//     }
// }

// Type Safety without Generics -> 
// import java.util.*;
// class Demo
// {
//     Object a;

//     void setData(Object a)
//     {
//         this.a = a;
//     }
//     Object getData()
//     {
//         return a;
//     }
// }
// class Generic{
//     public static void main(String[] args) {
//         Demo d = new Demo();
//         d.setData("Sami");
//         System.out.println(d.getData());
//         Integer num = (Integer)d.getData();
//     }
// }

// Same code with the help of Generics -> to convert runtime to compile time.
// import java.util.*;
// class Demo<t>
// {
//     t a;

//     void setData( t a)
//     {
//         this.a = a;
//     }
//     t getData()
//     {
//         return a;
//     }
// }
// class Generics
// {
//     public static void main(String[] args) {
//         Demo<String> d = new Demo<>(); // Object Creation 
//         d.setData("Sami");
//         System.out.println(d.getData());
//         // Integer num = d.getData();
//         String num = d.getData();
//     }
// }

//  Student Management system using Generic function .
// class Student<t> {
//     t a;

//     public void setData(t a) {
//         this.a = a;
//     }

//     t getData() {
//         return a;
//     }

// }
// class Main {
//     public static void main(String[] args) {
//         Student<String> name = new Student<>();
//         name.setData("Sami");
//         Student<Integer> marks = new Student<>();
//         marks.setData(85);
//         Student<Double> CGPA = new Student<>();
//         CGPA.setData(8.5);
//         System.out.println("Student Name: " + name.getData());
//         System.out.println("Student Marks: " + marks.getData());
//         System.out.println("Student CGPA : " + CGPA.getData());

//     }
// }


