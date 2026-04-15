
// wild card ->
// without bound ->
// Upper bound ->
// lower bound ->
// extends
// super

// for every Number clss we have super class is NUmber.

// create Calculator Generic class
// used add method to add two value that will be number
// used Constructor to initialize variables
// variables extends number class
// perform additon two number and return result.

// import java.util.*;
// class Calculator<t extends Number> {
//     t a;
//     t b;

//     Calculator(t a, t b) {
//         this.a = a;
//         this.b = b;
//     }

//     double add() {
//         return a.doubleValue() + b.doubleValue();
//     }

// }

// class Main {
//     public static void main(String[] args) {
//         Calculator<Integer> c1 = new Calculator<>(34, 78);
//         c1.add();
//         Calculator<Float> c2 = new Calculator<>(45.6f, 98.34f);
//         c2.add();
//         System.out.println("Addition of Integer : "+ c1.add());
//         System.out.println("Addition of Float : "+ c2.add());
//     }
// }


// wild Card -> Unknown Type

// import java.util.*;
// class Box<t>{
//     t a;
//     void setData(t a){
//         this.a = a;
//     }
//     t getData(){
//         return a;
//     }
// }
// class wildcard{
//     public static void main(String[] args) {
//         Box<Integer>b1 = new Box<>();
//         b1.setData(45);
//         Box<String>b2 = new Box<>();
//         b2.setData("Sami");
//         System.out.println("Integer value : "+b1.getData());
//         System.out.println("String value : "+b2.getData());
        
//         // Wild Card Unknown Type -> "?"
//         Box<?> box;
//         box = b1;
//         System.out.println(box.getData());
//         box = b2;
//         System.out.println(box.getData());
//     }
// }


// UnBounded -> we dont have any boundation.
// LowerBounded -> super Keyword -> Initialize the parent class Variables.
// UpperBounded -> extends , Inheritance.

// Object -> Number -> Integer, Float, Double.
// Number -> Integer, Float, Double.

//import java.util.*;
class Demo<t>{
    t a;
    void set(t a)
    {
        this.a = a;
    }
    t get()
    {
        return a;
    }
}
class wildcard{
    static void reader(Demo<? extends Number>d)
    {
        System.out.println("Value of a : "+ d.get());
    }
    static void writer(Demo<? super Integer>d)
    {
        // in super we can update the value
        // some times we can read the value
        System.out.println("Value of a :"+ d.get());
        d.set(78);
        System.out.println("Value od a: "+d.get());   
    }
    public static void main(String[] args) {
        Demo<Integer>d = new Demo<>(); //object 
        d.set(34);
        Demo<String>d1=new Demo<>();
        d1.set("Sami");
    
        Demo<?>d3 =d; //simple variable
        System.out.println(d3.get());
        d3 = d1;
        System.out.println(d3.get());

        // (?) Wild Operator -> Unknown Type
        reader(d);
        writer(d);
    }
}
