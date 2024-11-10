public class ATMSimulator {
    public static void main(String[] args) {
        // Initialize the bank account with an initial balance
        BankAccount account = new BankAccount(1000.0); // Starting balance of 1000
        ATM atm = new ATM(account);
        atm.displayMenu();
    }
}
