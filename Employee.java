import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void total_salary(double per_HRA, double per_DA) {
        double HRA = salary * per_HRA;
        double DA = salary * per_DA;
        double total_salary = salary + HRA + DA;
        System.out.println("Total Salary of " + name + " Employee is : " + total_salary);
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Saumya ", 1000);
        e1.total_salary(.20, .10);

        Employee e2 = new Employee("Mihir", 2000);
        e2.total_salary(.20, .10);
    }
}
