import java.util.*;
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
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
