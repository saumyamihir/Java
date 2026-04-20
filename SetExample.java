
// set -> In set we have only unique elements.
//  10 20 30 10 45
//  10 20 30 45
//  4
//  HashSet -> In this Order of Element Can be Anyhing.
//  HashTable + Closed Hashing
// Linear Probing
// Quadratic Probing
// Double Hashing


// LinkedHashSet -> HAshTable + LinkedList
// Open Hashing
// Order of element will be same like insertion of order of element.



// TreeSet 
// All will be in sorted Order.


// import java.util.*;

// class SetExample {
//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>();
//         set.add(34);
//         set.add(78);
//         set.add(90);
//         set.add(34); // duplicate ignore hoga
//         System.out.println(set);
//     }
// }



import java.util.*;
class SetExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner();
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        Set<Integer>set = new HashSet<>() ;

        System.out.println("Enter the n element: ");
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            set.add(data);
        }
        System.out.println("Unique no of element is "+set.size());
   }
}
