import java.util.*;

class ATM {
    int balance;

    ATM(int balance) {
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println(" Current Balance : " + balance);
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " is deposited Sucessfully");
        System.out.println("Current Balance : " + balance);
        // checkBalance();
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println(" Sorry Insufficient Balance : ");
            System.out.println();
        } else {
            balance -= amount;
            System.out.println(amount + " is withdrawn Sucessufully");
            System.out.println("Current Balance : " + balance);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(10000);
        int choice;
        do {

            System.out.println(" Welcome to the ATM!");
            System.out.println();
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println(" Thank you for using the ATM. Have a Good Day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}