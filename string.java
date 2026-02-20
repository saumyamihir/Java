
//  String : In java it is Immutable(We can't change) . Eg: Writing with Pen.

// import java.util.Scanner;

// class Main
// {
//     public static void main(String[] args) 
//      {

//     // It will create memory in String pool.
//     // In String pool for same String create memoory one time.
//     String name = "Saumya";
//     System.out.println(name); 

//     // Create memorry only for name and name1 points to name.
//     String name1 = "Saumya";
//     System.out.println(name1);

//     // It will create memory in both String Pool and Heap.
//     String name2 = new String("Saumya");
//     System.out.println(name2);

//     System.out.println(name == name1);
//     System.out.println(name == name2);
//     System.out.println(name.equals(name1));
//     System.out.println(name.equals(name2));

//     String name3 = new String("Saumya");
//     System.out.println(name2==name3);
//     System.out.println(name2.equals(name3));
//    }
// }



// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {

//         // We will take String from The user.
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter s String: ");

//         String s = sc.nextLine();
//         System.out.println("Given String is : " + s);

//         // To find the lngth of the string We have Length() Method or function.
//         System.out.println("Length of the String is : " + s.length());

//         // To find the Character of Particular index we have charAt(index) method.
//         System.out.println("Character at index 2 : " + s.charAt(2));

//         // Convert to UpperCase -> toUpperCase() method.
//         System.out.println("String in UpperCase : " + s.toUpperCase());

//         // Convert to LowerCase -> toLowerCase() method.
//         System.out.println("String in LowerCase : " + s.toLowerCase());

//         // Find The SubString(startindex, endindex);
//         System.out.println("Substring From index 0 to 4 : " + s.substring(0, 4));

//         // Find the indexof Character in String -> indexof(pass the character).
//         // If the Character present in String return index othrwise -1.
//         System.out.println("Index of Character 'a' : " + s.indexOf('a'));
//         System.out.println("Index of Character 'p' : " + s.indexOf('p'));

//     }
// }



// StringBuilder : It is Mutable(we can Change).We Can change String. Ef: Writing with Pencil.
// Only one Person can change string at a time.

// StringBuffer : same as StringBuilder but multiple person can change string at a time.
// multithreading  and Synchronization.

// Methods for Change the String :
// 1. append() -> to add the string in given string.
// 2. insert() -> to insert any text in between string.
// 3. delete() -> to delete any part of string.
// 4. reverse() -> to reverse the string.
// 5. replace() -> it will replace and update some string.

import java.util.*;

class Main
{
    public static void main(String[] args) {
        
        // normal String -> "javapromaming";
        
        // StringBuilder sb = new StringBuilder("javapromaming ");
        // System.out.println(sb);

        // // append() method
        // sb.append(" course");
        // System.out.println(sb);

        // // insert(index, text)
        // sb.insert(4," is a ");
        // System.out.println(sb);

        // // delete(startindex, endindex)
        // sb.delete(5,8);
        // System.out.println(sb);

        // // reverse()
        // sb.reverse();
        // System.out.println(sb);

        // // Replace(startindex, endindex, text)
        // sb.replace(0, 5, "Java");
        // System.out.println(sb);



        StringBuffer sb = new StringBuffer("javapromaming ");
        System.out.println(sb);

        // append() method
        sb.append(" course");
        System.out.println(sb);

        // insert(index, text)
        sb.insert(4," is a ");
        System.out.println(sb);

        // delete(startindex, endindex)
        sb.delete(5,8);
        System.out.println(sb);

        // reverse()
        sb.reverse();
        System.out.println(sb);

        // Replace(startindex, endindex, text)
        sb.replace(0, 5, "Java");
        System.out.println(sb);


    }
}


