import java.util.*;
import java.util.Scanner;

 class ATMM {
    private Bankaccount account;

    public ATMM(Bankaccount account) {
        this.account = account;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
    private void checkBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }


    private void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }
    private void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
}

 class Bankaccount {
    private double balance;

    public Bankaccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Amount withdrawn: " + amount);
            return true;
        }
    }

    // Check balance method
    public double getBalance() {
        return balance;
    }
}



public class ATMSimulator {
    public static void main(String[] args) {
        // Initialize the bank account with an initial balance
        Bankaccount account = new Bankaccount(1000.0); // Starting balance of 1000
        ATMM atm = new ATMM(account);
        atm.displayMenu();
    }
}
