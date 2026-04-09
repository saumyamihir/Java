//  Generic 
//  Reusability

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
import java.util.*;

class Triple<x,y,z> {
    x a;
    y b;
    z c;

    Triple(x a , y b , z c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void print() {
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: "+b);
        System.out.println("Value of c is: "+c);
    }

}

public class Generic {
    public static void main(String[] args) {
        Triple<String,Integer,Double> obj = new Triple<>("Sami",2,1.0);
        obj.print();
        Triple<String,String,String> obj1 = new Triple<>("bgc","abc","nhj");
        obj1.print();
        Triple<Integer,Float,String> obj2 = new Triple<>(9,1.0f,"bgc");
        obj2.print();
        Triple<Double,Float,Integer> obj3 = new Triple<>(1.0,20.9f,0);
        obj3.print();

    }
}