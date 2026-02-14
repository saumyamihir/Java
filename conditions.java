import java .util.*;

class conditions{
    public static void main(String[]args)
    {
        //Take input from user and check whether the number is even or odd
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even number");
        }
        else{
            System.out.println(num+" is Odd number");
        }*/

        //Take a no from user and check the no is prime 
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime && num>1){
            System.out.println(num+" is a Prime number");
        }
        else{
            System.out.println(num+" is not a Prime number");
        }*/


        //Take a no from user and check every digit of no is prime or not
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        while(num>0){
            int digit=num%10;
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(digit);i++){
                if(digit%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime && digit>1){
                System.out.println(digit+" is a Prime digit");
            }
            else{
                System.out.println(digit+" is not a Prime digit");
            }
            num=num/10;
        }*/

        
    }
}
