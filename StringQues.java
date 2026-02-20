// take A string from the user and remove duplicate from string 
// aabccdafghd -> abcdfgh
// deepak -> depak
// arun -> arun

// import java.util.*;

// class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a String : ");
//         String s = sc.nextLine();
//         String result = " ";
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (result.indexOf(ch) == -1) {
//                 result = result + ch;
//             }
//         }
//         System.out.println("After Deletion of Duplicate character : " + result);

//     }
// }


// Q2. Take a string from the useer and check whether given string is a plaindrome or not.

import java.util.*;

class Main
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        
        String s = sc.nextLine();
        String rev = " ";
        for(int i = s.length()-1; i>=0; i--)
        {
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println("Given String is a Plaindrome");
        }
        else
        {
            System.out.println("Given String is not a Plaindrome");
        }
    }
}