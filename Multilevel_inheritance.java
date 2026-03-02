import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    int empid;
    int salary;

    Employee(int empid, int salary, String name, int age) {
        super(name, age);
        this.empid = empid;
        this.salary = salary;
    }
}

class Manager extends Employee {
    int bonus;

    Manager(int bonus, int empid, int salary, String name, int age) {
        super(empid, salary, name, age);
        this.bonus = bonus;
    }

    // Method to calculate total salary
    int getTotalSalary() {
        return salary + bonus;
    }
}

public class Multilevel_inheritance {
    public static void main(String[] args) {

        Manager m1 = new Manager(1000, 12, 1200000, "Sami", 21);

        System.out.println("Employee Id : " + m1.empid);
        System.out.println("Employee Name : " + m1.name);
        System.out.println("Employee Age : " + m1.age);
        System.out.println("Employee Salary : " + m1.salary);
        System.out.println("Employee Bonus : " + m1.bonus);

        // Total Salary
        System.out.println("Total Salary : " + m1.getTotalSalary());
    }
}