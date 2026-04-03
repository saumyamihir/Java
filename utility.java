// Utility class  -> In this class every method will be static
// we can't create object of this 
// That why we take constructor as Private
// With help of class name we access the methods.
// mathutility class
// Stringutility class
// date and time utility class

// In normal method -> first create object then access.
// In static method -> directly access with class name.


// import java.util.*;
// class mathUtility{
//     private mathUtility()
//     {

//     }
//     static void add(int a , int b)
//     {
//         System.out.println("Sum of a and b is : "+(a+b));
//     }
//     static void multi(int a ,int b)
//     {
//         System.out.println("Multiply of a and b is : "+(a*b));
//     }
//     static void max(int a,int b)
//     {
//         if(a>b)
//         {
//             System.out.println("Max is a "+ a);
//         }
//         else{
//             System.out.println("Max is b "+ b);
//         }
//     }
// }
// public class utility {
//     public static void main(String[] args) {
//         mathUtility.add(2,3);
//         mathUtility.multi(4, 8);
//         mathUtility.max(78, 34);
//     }
// }



// import java.util.*;
// class Stringutility{
//     private Stringutility()
//     {

//     }
//     static void print(String name)
//     {
//         System.out.println("Name is : "+name);
//     }
//     static void reverse(String name)
//     {
//         StringBuilder str = new StringBuilder(name);
//         str.reverse();
//         System.out.println("Reverse String is : "+str);
//     }
//     static void checkpalindrome(String name)
//     {
//         StringBuilder str = new StringBuilder(name);
//         str.reverse();
//         String str1 = str.toString();
//                 if(str1.equals(name))
//         {
//             System.out.println("String is Palindrome ");
//         }
//         else{
//             System.out.println("String is not Palindrome");
//         }
//     }
// }
// public class utility {
//     public static void main(String[] args) {
//         Stringutility.print("Sami");
//         Stringutility.reverse("Sami");
//         Stringutility.checkpalindrome("madam");

//     }
// }





// date and time utility class
// old method
// new method with Api ->

// import java.util.Date;
// import java.time.LocalDate;
// import java.time.LocalTime;
// import java.time.LocalDateTime;
// import java.time.ZoneId;
// import java.time.ZonedDateTime;

// public class utility {
//     public static void main(String[] args) {
//         // old date method 
//         Date date = new Date();
//         System.out.println("Current date : "+ date);

//         System.out.println("Current date : "+ LocalDate.now());
//         System.out.println("Current date : "+ LocalTime.now());
//         System.out.println("Current date : "+ LocalDateTime.now());
//         ZoneId id = ZoneId.of("Asia/Kolkata");
//         ZonedDateTime time = ZonedDateTime.now(id);
//         System.out.println(time);

//     }
// }


// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.util.Date;

// class DateTimeUtility{
//     private DateTimeUtility()
//     {

//     }
//     static void getcurrenttime()
//     {
//         System.out.println("Current time is : "+ LocalTime.now());
//     }
//     static void getcurrentDae()
//     {
//         System.out.println("Current date is : "+ LocalDate.now());
//     }
//     static void getcurrentDateTime()
//     {
//         System.out.println("Current date and time is : "+ LocalDateTime.now());
//     }
// }
// public class utility{
//     public static void main(String[] args) {
//         Date date = new Date();
//         System.out.println(date);
//         DateTimeUtility.getcurrenttime();
//         DateTimeUtility.getcurrentDae();
//         DateTimeUtility.getcurrentDateTime();
//     }
// }



// import java.time.LocalDate;
// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;

// public class utility{
//     public static void main(String[] args) {
//         LocalDate date = LocalDate.now();
//         DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//         System.out.println("Current date is : " + date.format(f));


//         LocalTime time = LocalTime.now();
//         DateTimeFormatter f1 = DateTimeFormatter.ofPattern("HH:mm:ss");
//         System.out.println("Time is : "+ time.format(f1));
//     }
// }



// Calendar
// inside the java.util.Calendar;

import java.util.Calendar;
import java.util.TimeZone; //for time zone 

class utility
{
    public static void main(String[]args)
    {
        Calendar c = Calendar.getInstance();
        System.out.println("Current Time : "+ c.getTime());
        System.out.println("Current year : "+c.get(Calendar.YEAR));
        
        // In java Calendar Library Month Start From Zero
        System.out.println("Current Month : "+(c.get(Calendar.MONTH)+1));

        // Date or Current Date 
        System.out.println("Current Date : "+c.get(Calendar.DATE));

        // Hour Minute Second
        System.out.println("Curren Hour : "+ c.get(Calendar.HOUR));
        System.out.println("Curren Minute : "+ c.get(Calendar.MINUTE));
        System.out.println("Curren Second : "+ c.get(Calendar.SECOND));



        // Find the Curent Time with help of TimeZone
        // Currrent Api Or Classes -> ZoneId , ZoneDateTime

        TimeZone id = TimeZone.getTimeZone("Asia/Kolkata");
        Calendar c1 = Calendar.getInstance(id);
        System.out.println("Current Time in Asia/Kolkata : "+ c1.getTime());

        // Europe/London
        TimeZone id1 = TimeZone.getTimeZone("Europe/London");
        Calendar c2 = Calendar.getInstance(id1);
        System.out.println("Current Time in Europe/London : "+ c2.getTime());


        // America/New York
        TimeZone id2 = TimeZone.getTimeZone("America/New York");
        Calendar c3 = Calendar.getInstance(id2);
        System.out.println("Current Time in America/New York : "+ c3.getTime());

    }
}




