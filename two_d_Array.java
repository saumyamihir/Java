import java.util.*;

public class two_d_Array 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.print("Enter elements of 2D array:");

        // Input
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }


        // Output
      /*  System.out.println("Your 2D Array is:");
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
            
        }
 */
        //Find the max and min in this array
/*
        int max = arr[0][0];
        int min = arr[0][0];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }

                if(arr[i][j] < min)
                {
                    min = arr[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);


        //To find the all the sum of the array

        int sum = 0;

        // Calculate sum
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                sum += arr[i][j];
            }
        }

        System.out.println("Total Sum = " + sum);

    
        //Linear search in 2D array
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(arr[i][j] == key)
                {
                    System.out.println("Element found at position: Row " + i + " Column " + j);
                    found = true;
                }
            }
        }

        if(!found)
        {
            System.out.println("Element not found");
        }
 */

        //Count no of Prime Element in 2D array
        int count = 0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                int temp = arr[i][j];
                int count1 =0;
                for(int k =1;k<=temp;k++)
                {
                    if(temp%k==0)
                    {
                        count1++;
                    }
                }
                if(count1==2)
                {
                    count++;
                }
            }
        }
        System.out.println("Prime No in 2D array is : "+ count);
        

        
        sc.close();
    }
}
