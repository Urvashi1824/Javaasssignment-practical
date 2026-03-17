import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    // Parameterized Constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Total Balance: " + balance);
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }

    // Display Account Details
    void display() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        // Creating object using parameterized constructor
        BankAccount acc = new BankAccount(accNo, name, bal);

        acc.display();

        // Deposit
        System.out.print("\nEnter amount to deposit: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        // Withdraw
        System.out.print("\nEnter amount to withdraw: ");
        double wd = sc.nextDouble();
        acc.withdraw(wd);

        sc.close();
    }
}
