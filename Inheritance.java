// import java.util.*;

// class Employee
// {
//     int salary = 100000;
// }
// class Programmer extends Employee
// {
//     int bonus = 10000;
// }

// public class Inheritance  {
//     public static void main(String[] args)
//     {
//         Programmer p1 = new Programmer();
//         System.out.println("Programmer Salary : "+ p1.salary);
//         System.out.println("Programmer Bonus : "+ p1.bonus);

//     }
// }







import java.util.*;

class Animal
{
    void eat()
    {
        System.out.println("Dog is Eating .. " );
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is Barking...");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }
}
