import java.util.*;

class Basic{
    public static void main(String[]args)
    {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        short a =4;

        System.out.println(a);

        System.out.println("Enter the value of b :");

        

        short b = sc.nextShort();

        System.out.println("value of b " + b);

    //To find the size of short data type
        System.out.println("Size of Short data type " + Short.BYTES + "Bytes");

        //Repeat same for other data types
        //Int long float double boolean char byte
    
    }
}