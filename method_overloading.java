// Method Overloading

// 1.Change in no of parameters --> Function name will be same


// import java.util.*;
// public class method_overloading {
//     // Method signature -> add(int ,int)
//     void add(int a,int b)
//     {
//         System.out.println("sum is : " +(a+b));
//     }
//     // Method signature -> add(int ,int,int)
//     void add(int a,int b, int c)
//     {
//         System.out.println("sum is : " +(a+b+c));
//     }

//      public static void main(String[] args) 
//     {
//         method_overloading m1 = new method_overloading();
//         m1.add(2,3);
//         m1.add(3,7,9);   
//     }
// }



// 2.Change in datatypes and no of parameters will be same.


// import java.util.*;

// public class method_overloading 
// {
//     void add(int a, int b)
//     {
//         System.out.println("Sum is : " +(a+b));
//     }
//     void add(int a, double b)
//     {
//         System.out.println("Sum is : " +(a+b));
//     }
//     void add(double a, int b)
//     {
//         System.out.println("Sum is : " +(a+b));
//     }
//     void add(double a, double b)
//     {
//         System.out.println("Sum is : " +(a+b));
//     }

//     public static void main(String[] args) 
//     {
//         method_overloading m1 = new method_overloading();
//         m1.add(2,3);
//         m1.add(2,3.8);
//         m1.add(3.6, 4);
//         m1.add(2.3, 7.9);   
//     }
// }
