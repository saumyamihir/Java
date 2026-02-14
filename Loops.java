import java.util.*;

class Loops{
    public static void main(String[]args)
    {
        //Print numbers from 1 to 10 using for loop
        /*System.out.println("Using for loop:");
        for(int i=1;i<=10;i++){
            System.out.print(i+" "); 
        } */

        //Print numbers from 10 to 1 using For loop
        /*for(int i=10;i>=1;i--){
            System.out.print(i+" ");
        }*/


        //Take input from user and print numbers from 1 to n using for loop

       /* Scanner sc= new Scanner(System.in);
        System.out.println("\nEnter a number:");
        int n=sc.nextInt();
        System.out.println("Using for loop:");
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");*/ 

        //Print All Even numbers from 1 to n using for loop
        /*Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("\nEven numbers from 1 to "+n+":");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }*/

        //Print All ODD numbers from 1 to n using for loop
        /*Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("\nOdd numbers from 1 to "+n+":");
        for(int j=1;j<=n;j+=2)
        {
            System.out.print(j+" ");
        }*/

        //Take a no from user and find the sum of all digit of no
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("Sum of digits: "+sum);*/

        //Take a no from user and reverse the number
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        System.out.println("Reversed Number: "+reverse); */

        //Take a no from and check whether it is a palindrome or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(temp==rev){
            System.out.println(temp+" is a Palindrome number");
        }
        else{
            System.out.println(temp+" is not a Palindrome number");
        }


}

}
