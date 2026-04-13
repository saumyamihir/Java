
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
// UnBound -> we dont have any boundation.
// LowerBound -> super Keyword -> Initialize the parent class Variables.
// UpperBound -> eextends , Inheritance.
import java.util.*;
class Box<t>{
    t a;
    void setData(t a){
        this.a = a;
    }
    t getData(){
        return a;
    }
}
class wildcard{
    public static void main(String[] args) {
        Box<Integer>b1 = new Box<>();
        b1.setData(45);
        Box<String>b2 = new Box<>();
        b2.setData("Sami");
        System.out.println("Integer value : "+b1.getData());
        System.out.println("String value : "+b2.getData());
        
        // Wild Card Unknown Type -> "?"
        Box<?> box;
        box = b1;
        System.out.println(box.getData());
        box = b2;
        System.out.println(box.getData());
    }
}