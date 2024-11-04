import java.util.Scanner;

class AT{
    int total_amount=0;
    public void accbalance(){
        if (total_amount==0){
            System.out.println("Your account balance is 0.00Rs");
        }
        else {
            System.out.println(total_amount);
        }
    }

    public void amount_withdraw(int amount) {
        if (total_amount >= amount) {
            System.out.println("Your current Balance is " + total_amount);
            total_amount -= amount;
            System.out.println("Rs" + amount + " " + "Has been debited from your acc");
            System.out.println("Your remaining account balance is " + total_amount);
        }else
        System.out.println("You don't have enough amount to withdraw");
    }
    public void amnt_depo(int amount){
        System.out.println("Your Balance was"+total_amount);
        total_amount+=amount;
        System.out.println("After deposition your current balance is "+total_amount);
    }
}

public class task3 {
    public static void main(String[] args) {
        AT at = new AT();
        int amnt;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to XYZ Bank!");
        System.out.println("Choose your option below");
        System.out.print("1.Account Balance\n2.Amount Withdrawal\n3.Amount Deposite");
        System.out.print("\n4.Exit");
        int choose_number = sc.nextInt();
        while (flag) {

            switch (choose_number) {
                case 1:
                    at.accbalance();
                    flag = false;
                    break;

                case 2:
                    System.out.print("Enter amount you want to withdraw: ");
                    amnt = sc.nextInt();
                    at.amount_withdraw(amnt);
                    flag = false;
                    break;
                case 3:
                    System.out.print("Enter amount to deposit into your account: ");
                    amnt = sc.nextInt();
                    at.amnt_depo(amnt);
                    flag = false;
                    break;
                case 4:
                    System.out.println("Thank you for using XYZ Bank. Goodbye!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }

        }
    }

}
