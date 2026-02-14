import java.util.*;
public class array1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int []arr ={10,20,30,40};
        int n=arr.length;

        for(int i =0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        int sum =0;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }
        System.out.println();
        for(int it:arr)
        {
            System.out.print(it + " ");
        }
        int sum1=0;
        for(int it:arr)
        {
            sum += it;
        }
    }
}
