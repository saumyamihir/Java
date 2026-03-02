// Hierarchial Inheritance .
// class A -> Parent class
//  class B -> child class ->inherit class A
//  class c -> child class ->inherit class A

import java.util.*;

class Animal
{
    void eat()
    {
        System.err.println("Eating...");
    }
    
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Barking...");
    }
}
class Cat extends Animal
{
    void mew()
    {
        System.out.println("Mew ...Mew ...");
    }
}
public class hierarchial_inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();
        d1.bark();
        
        Cat c1 = new Cat();
        c1.eat();
        c1.mew();
    }
    
}
