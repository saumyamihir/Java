// // // Banking System (Single Inheritance): Create a class Account with variables AccountNumber and Balance.
// // // deposit() and withdraw() , display().
// // // Create a subclass SavingAccount that adds intrestRate metghods display_rate().


// // data Given by us 

// import java.util.*;

// // Parent class
// class Account {
//     int accountNumber;
//     int balance;

//     Account(int accountNumber, int balance) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//     }
// }

// // Child class (Single Inheritance)
// class SavingsAccount extends Account {
//     int interestRate;

//     SavingsAccount(int interestRate, int accountNumber, int balance) {
//         super(accountNumber, balance); // calling parent constructor
//         this.interestRate = interestRate;
//     }
// }

// // Main class
// public class single_inheritance {
//     public static void main(String[] args) {

//         SavingsAccount acc1 = new SavingsAccount(13, 1234, 12000);

//         System.out.println("Account Number is : " + acc1.accountNumber);
//         System.out.println("Balance is : " + acc1.balance);
//         System.out.println("Interest Rate is : " + acc1.interestRate + "%");
//     }
// }





// // // User Input 


// // import java.util.*;

// // class Account{
// //     int accountNumber ;
// //     int balance;
// //     Account(int accountNumber, int balance)
// //     {
// //         this.accountNumber=accountNumber;
// //         this.balance=balance;
// //     }
// //     void deposit(int amount)
// //     {
// //         balance = balance + amount;
// //         System.out.println(amount + " is deposited Sucessfully");
// //         System.out.println("Current Balance : " + balance);
// //     }
// //     void withdraw(int amount)
// //     {
// //         if (amount > balance) {
// //             System.out.println(" Sorry Insufficient Balance ! ");
// //         } else {
// //             balance = balance - amount;
// //             System.out.println(amount + " is withdrawn Sucessufully");
// //             System.out.println("Current Balance : " + balance);
// //         }
// //     }
// //     void display()
// //     {
// //         System.out.println("Account No is : " +accountNumber);
// //         System.out.println("Balance is : " + balance);
// //     }
// // }
// // class SavingsAccount extends Account{
// //     int intrestRate;
// //     SavingsAccount(int intrestRate, int accountNumber,int balance)
// //     {
// //         super(accountNumber, balance);
// //         this.intrestRate=intrestRate;
// //     }
// //     void display_rate()
// //     {
// //         System.out.println("IntrestRate is : " +intrestRate + "%");
// //     }
    
// // }
// // public class single_inheritance {
// //     public static void main(String[]args){
// //         Scanner sc = new Scanner(System.in);
// //         int accountNumber = sc .nextInt();
// //         int balance = sc.nextInt();
// //         int intrestRate = sc.nextInt();

// //         SavingsAccount acc1 = new SavingsAccount(intrestRate,accountNumber,balance);
// //         System.out.println("AccountNumber is : " + acc1.accountNumber);
// //         System.out.println("Balance is : " + acc1.balance);
// //         System.out.println("Intrest Rate is : " +acc1.intrestRate + "%");
// //         acc1.deposit(500);
// //         acc1.deposit(200);
// //         acc1.withdraw(300);
// //         acc1.display();
// //         acc1.display_rate();
// //     }
// // }












