import java.util.*;

class BankAccount {
    String HolderName;
    int balance;

    BankAccount(String HolderName, int balance) {
        this.HolderName = HolderName;
        this.balance = balance;
    }

    void BalanceEnquiry() {
        System.out.println(" Current Balance : " + balance);
    }

    void deposit(int amount) {

        balance += amount;
        System.out.println(amount + " is deposited Sucessfully");
        System.out.println("Current Balance : " + balance);
        System.out.println();

    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println(" Sorry Insufficient Balance : ");
            System.out.println();
        } else {
            balance -= amount;
            System.out.println(amount + " is withdrawn Sucessufully");
            System.out.println("Current Balance : " + balance);
            System.out.println();
        }
    }

}

class Main {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Saumya", 1000);
        b1.BalanceEnquiry();
        b1.deposit(1000);

        BankAccount b2 = new BankAccount("Mihir", 1500);

        b2.deposit(1500);
        b2.withdraw(3000);
        b2.BalanceEnquiry();
        BankAccount b3 = new BankAccount("Sami", 2000);
        b3.withdraw(3500);
    }

}
