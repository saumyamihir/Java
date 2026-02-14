import java.util.*;

class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arithematic Operators

        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println(" Sum of a + b is : " + (a + b));
        System.out.println(" Subtraction of a - b is : " + (a - b));
        System.out.println(" Multiplication of a * b is : " + (a * b));
        System.out.println(" Division of a / b is : " + (a / b));
        System.out.println(" Modulus of a % b is : " + (a % b));

        // Ternary Operators
        // Find Maximum and Minimum between two numbers

        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        System.out.println("Minimum value is : " + min);
        System.out.println("Maximum value is : " + max);

        // Unary Operators

        int c = 35;
        System.out.println("Value of c is : " + c);
        System.out.println("Value of c after pre increment : " + (++c));// fisrt increment then print the value
        System.out.println("Value of c after pre decrement : " + (--c));// first decrement then print the value
        System.out.println("Value of c after post increment : " + (c++));// first print the value then increment
        System.out.println("Value of c after post decrement : " + (c--));// first print the value then decrement

        System.out.println(-c);// chnage the value to negative
        System.out.println(-(-c));// change the value to positive

        // Logical Operators
        // && , || , !
        // Short Circuit Conditiion for (&& , || ) logical operators
        // In And(&&) if X is true we dont check for Y
        // In Or(||) if X is false we dont check for Y

        boolean x = true;
        boolean y = false;
        System.out.println(x && y); // It will print false
        System.out.println(x || y); // It wil print true
        System.out.println(!x); // It will print false
        System.out.println(!y); // It will print true

        // Bitwise Operators
        // & , | , ^ , << , >>

        System.out.println(a & b);// Bitwise AND
        System.out.println(a | b);// Bitwise OR

        // Assignment Operators
        // = , += , -= , *= , /= , %=

        int d = 10;

        d += 2;
        System.out.println(d);

        d -= 3;
        System.out.println(d);

        d *= 4;
        System.out.println(d);

    }
}