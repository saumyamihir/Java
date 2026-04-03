
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
 
// throw 
// throws



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
// IOException

// ClassNotFoundException
import java.util.*;
class test{
    
}
class Exception{
    public static void main(String[] args) {
        try{
        Class.forName("test");
        System.out.println("class is found ");
        }catch(ClassNotFoundException e){
            System.out.println((e.getMessage()));
            System.out.println("We are getting ClassNotFoundException");

        }
    }
}


