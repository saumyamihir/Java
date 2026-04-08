
// Exception -> Abnormal behaviour of program during Execution of program.
// Compile Time / Run Time 
// unChecked Exception -> Run Time

// Arthmetic Exception
// import java.util.*;
// public class Exception {
//     public static void main(String[] args) {
//         int a = 4;
//         int b = 2;
//         System.out.println("Division of a and b is "+(a/b));

//         // // Divide any No by 0 
//         int c =5;
//         int d =0;
//         System.out.println("Division of c and d : "+(c/d));
    

// keyWords -> 
// try -> In which line we are getting Exception  write inside try block.
// catch -> Exception handle karne ke liye catch block use karte hai.
//         int z =5;
//         int x =0;
//         try{
//             System.out.println("Division of z and x : "+(z/x));
//         }catch(ArithmeticException e){
//             System.out.println(e.getMessage());
//             System.out.println("We are getting devide by zero Exception.");
//         }
//     }
// }
 


// NullPointer Exception
// import java.util.*;
// public class Exception {
//     public static void main(String[] args) {
//         String name ="";
//         System.out.println("Size of name is : "+name.length());

//         String name1 = "Arun";
//         System.out.println("Size of name1 is : "+name1.length());

//         try{
//         String name2 = null; // it is not pointing to Any String.
//         System.out.println("Size of name2 is : "+name2.length());
//         }catch(NullPointerException e){
//             System.out.println(e.getMessage());
//             System.out.println("We are getting NullPointer Exception");
//         } 
//     }
// }



// ArrayIndexOutOfBounds Exception
// import java.util.*;
// class Exception {
//     public static void main(String[] args) {
//         int arr[] ={10,20,30,40};

//         System.out.println("Size of array :" +arr.length);
//         int n = arr.length;
//         System.out.println("array ");
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]+" ");
//         }
//         System.out.println("Element At Index 2 is :" +arr[2]);
//         try{
//         System.out.println("Arr[n] Element :" +arr[n]);
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println(e.getMessage());
//             System.out.println("We are getting ArrayIndexOutOfBounds Exception.");
//         }
//     }
// }



// StringIndexOutOfBounds Exception
// import java.util.*;
// class Exception {
//     public static void main(String[] args) {
//         String name = "Arun";
//         // size of the name is 4 -> we can olny access o to 3 index.
//         System.out.println(name.charAt(0));
//         System.out.println(name.charAt(1));

//         try{
//         System.out.println(name.charAt(10));
//         }catch(StringIndexOutOfBoundsException e ){
//             System.out.println((e.getMessage()));
//             System.out.println("we are getting StringIndexOutOfBounds Exception.");
//         }
//     }
// }





// NumberFormat Exception
// "123" -> 123 possible
// "String " -> int not possible

// import java.util.*;
// class Exception {
//     public static void main(String[] args) {
//         int a = Integer.parseInt("123");
//         System.out.println("Value of a is : "+a);
//         try{
//         int b = Integer.parseInt("abc");
//         System.out.println("Value of b is : "+ b);
//         }catch(NumberFormatException e ){
//             System.out.println(e.getMessage());
//             System.out.println(("We are getting NumberFormatException "));
//         }
//     }
// }



// Checked Exception -> Exception During Compile Time
// It must be Remove / Handle .

// FileNotFoundException ->
// import java.util.*;
// import java.io.*;
//  class Exception {
//     public static void main(String[] args) {

//         try{
//         FileReader r = new FileReader("abcd.txt");
//         }catch(FileNotFoundException e ){
//             System.out.println(e.getMessage());
//             System.out.println("We are getting FileNotFoundException");
//         }
//     }
//  }




// ClassNotFoundException
// import java.util.*;
// class test{
    
// }
// class Exception{
//     public static void main(String[] args) {
//         try{
//         Class.forName("test");
//         System.out.println("class is found ");
//         }catch(ClassNotFoundException e){
//             System.out.println((e.getMessage()));
//             System.out.println("We are getting ClassNotFoundException");

//         }
//     }
// }



// try -> I  which line you are getting Exception inside try block

// try()
// {

// }
// catch -> Exception we catch catch block and print the message of Exception.

// catch(ExceptionType e)
// {
//     System.out.println(e.getMessage());
// }

// finally -> it will excecute always in program.

// throw -> with this keyword we create our own message for exception or throw obj of Exeption.

// throw new ArithmeticException("we can not devide any no by zero");

// throws -> it tells method types of excetion can occur inside method.

// void withdraw(int amount) throws IllegalArgumentException,ArithmeticException
// {

// }

// import java.util.*;

// class Exception {
//     public static void main(String[] args) {
//         int a = 6;
//         int b = 0;
//         try{
//         if(b == 0)
//         {
//             throw new ArithmeticException("We can not divide any no by zero.");
//         }
//         System.out.println(a/b);
//     }catch(ArithmeticException e){
//         System.out.println(e.getMessage());
//         System.out.println("We are getting ArithmeticException");
//     }
//     }
// }



// MarkChecker
// import java.util.*;
// class MarkChecker {
//     void marcheck(int marks)
//     {
//         if(marks < 0)
//         {
//             throw new IllegalArgumentException("marks can not be negative");
//         }
//         else if(marks > 100)
//         {
//             throw new ArithmeticException("marks can not ne greater than 100");
//         }
//         else {
//             System.out.println("marks : "+marks);
//         }
//     }
// } 
//  class Exception{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         MarkChecker obj = new MarkChecker();
//         int marks = sc.nextInt();
//         try{
//         obj.marcheck(marks);
//         }
        // Multiple Catch -> We will take more than one Catch Block.
        // catch(IllegalArgumentException e){
        //     System.out.println(e.getMessage());
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e.getMessage());
        // }
    
        // Multi Catch -> We will only One Catch Block for more than one Exception.
//         catch(IllegalArgumentException | ArithmeticException  e)
//         {
//             System.out.println(e.getMessage());
//         }
//     }
// }  


// One try Block we can handle only one Exception.

// import java.util.*;
//  class Exception {
//     public static void main(String[] args) {
//         try{
//             String str = null;
//             System.out.println(str.length());
//             int a = 10/0;
//         }catch(ArithmeticException | NullPointerException e)
//         {
//             System.out.println(e.getMessage());
//         }
//     }  
// }


// Custom Exception -> Exception create by user.

// checked Custom Exception -> compile Time  Exception. It will Create bu user.
// Marks can not be negative -> Create by user

// class MarksCanNotNegativeException extends Exception
// {
// }

// import java.util.*;
// class MarksCanNotNegativeExcepttion extends RuntimeException
// {
//     MarksCanNotNegativeExcepttion(String message)
//     {
//         super(message);
//     }
// }
// public class Exception{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int marks = sc.nextInt();
//         try{
//         if(marks < 0)
//         {
//             throw new MarksCanNotNegativeExcepttion("Marks Can not be Negative .");
//         }
//         }catch(MarksCanNotNegativeExcepttion e){
//             System.out.println(e.getMessage());
//         }
//     }
// }



// // unchekced Custom Exception -> Run Time Exception.
// // devide by zero -> Create by developer . -> Create by Logic

// class DivideByZeroException extends RuntimeException
// {

// }

// import java.util.*;
// class DivideByZeroException extends RuntimeException
// {
//     DivideByZeroException(String message)
//     {
//         super(message);
//     }
// }
// public class Exception{
//     public static void main(String[] args) {
//         int a = 6;
//         int b = 0;
//         try {
//         if(b == 0)
//         {
//             throw new DivideByZeroException("We can not divide any number by zero");
//         }
//     }catch(DivideByZeroException e)
//     {
//         System.out.println(e.getMessage());
//     }
//     }
// }



// Create PasswordLengthException -> Custom Exception
// length Should be greater than 10
// import java.util.*;

// class PasswordLengthException extends RuntimeException {
//     PasswordLengthException(String message) {
//         super(message);
//     }
// }

// class Exception {
//     public static void main(String[] args) {
//         String password = "Sami@123";

//         try {
//             if (password.length() <= 10) {
//                 throw new PasswordLengthException("Password length should be greater than 10");
//             } else {
//                 System.out.println("Password is Strong.");
//             }
//         } catch (PasswordLengthException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }


// ---------------------------------  QUESTION -------------------------------------------------

// You have to create custom Exception use try catch and finally throw throws
// You have to take Marks from user if(marks<0 || marks>100 )throw IllegalMarksException
// if(marks<33) throw FailedException if(marks<50) ->throw AverageException

// IllegalMarksException , FailedException , AverageException these Custom Exception

// use try and catch block for exception Handling
// finally block -> print message -> marks check successfully.


import java.util.*;

class IllegalMarksException extends RuntimeException
{
        IllegalMarksException(String message)
        {
                super(message);
        }
        
}
class FailedException extends RuntimeException
{
        FailedException(String message)
        {
                super(message);
        }
}
class AverageException extends RuntimeException
{
        AverageException(String message)
        {
                super(message);
        }
}
public class Exception {
        public static void main(String[] args) throws IllegalMarksException,FailedException,AverageException
         {
                Scanner sc = new Scanner(System.in);
                int marks = sc.nextInt();
                try{
                if(marks<0 || marks>100)
                {
                        throw new IllegalMarksException("Marks Should be between 0 And 100.");
                }
                if(marks<33 )
                {
                        throw new FailedException("Failed The Exam.");
                }
                if(marks<50 )
                {
                        throw new AverageException("Average Marks.");
                }
                else{
                        System.out.println("You Pass The Exam with Good Marks.");
                }
        }catch(IllegalMarksException | FailedException | AverageException e)
        {
                System.out.println(e.getMessage());
        }finally{
                System.out.println("Marks check successfully.");
        }
        }
}


