import java.util.*;

public class for_each_loop {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        // Print the array
        int n = arr.length;
        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Array using For Each Loop : ");
        for (int it : arr) {
            System.out.println(it + "");
        }
        int sum = 0;
        for (int it : arr) {
            sum += it;
        }
        System.out.println("Sum is : " + sum);
    }
}
