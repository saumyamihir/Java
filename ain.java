// Array utility CLass
// Inutility class we have predfined method
// sort
// binarySearch()
// toString()

import java.util.*;
import java.util.Arrays;

class Main{
    public static void main(String[]args){
        // Take a array from user
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();  // No of Element in Array
        // int []arr = new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     arr[i] = sc.nextInt();

        // }
        // // Print the Array
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(arr[i] +" ");
        // }
        // System.out.println();
        
        
        // // toString() -> Print Array
        // System.out.println(Arrays.toString(arr));

        // // To Sort the Array 
        // // sort()
        // Arrays.sort(arr);
        // System.out.println("Sorted Array : "+ Arrays.toString(arr));

        
        // // binarySearch(arr,target);
        // int index =Arrays.binarySearch(arr, 70);
        // if(index >= 0)
        // { 
        //     System.out.println("Target is found at : "+ index);
        // }
        // else
        // {
        //     System.out.println("Target is not found");
        // }


        // // copyOf(arr , no of element or length )
        // int []arr1 = Arrays.copyOf(arr, 3);
        // System.out.println("Array1 is : "+ Arrays.toString(arr1)); 

       
        // // copyOfRange(arr , start index , end index)
        // int []arr2 = Arrays.copyOfRange(arr, 2, 4);
        // System.out.println( Arrays.toString(arr2)); 

       
        // // You Can Compare two Array
        // // equals(first array, second array)
        // int []arr3 ={10,20,30,40,50};
        // int []arr4 ={10,20,35,40,50};
        // int []arr5 ={10,20,30,40,50};
        // System.out.println(Arrays.equals(arr3, arr4));
        // System.out.println(Arrays.equals(arr3, arr5));


        // //fill(name of array, value fill in each block)
        // int []arr6 = new int[7];
        // Arrays.fill(arr6, -1);
        // System.out.println(Arrays.toString(arr6));





        //  Q1> You have no 1 to n
        //  take a array from user -> find mising number 
        // find the sum of all from 1 to n -> n(n+1)/2 = sum1
        // find the sum of all elements array -> sum2
        //Missing no will be sum1-sum2

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int []arr = new int[n];

//         for(int i=0;i<n-1;i++)
//         {
//             arr[i] = sc.nextInt();
            
//         }
//         int sum1 = n*(n+1)/2;
//         int sum2 =0;
//         for(int i=0;i<n-1;i++)
//         {
//             sum2 += arr[i];
//         }
//         System.out.println("Missing No is : "+ (sum1-sum2));






// Q2> Take a array from the user and find the unique element(remove Duplicates) from the array 
// and print in increasing order.

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int []arr = new int[n];

// for(int i=0;i<n;i++)
// {
//     arr[i]= sc.nextInt();
// }
// Arrays.sort(arr);
// System.out.print(arr[0]+" ");
// // 2 2 3 3  4 4 5 6 7
// for(int i=1;i<n;i++)
// {
//     if(arr[i] != arr[i-1])
//     {
//         System.out.print(arr[i]+" ");
//     }
// }





   }
}


