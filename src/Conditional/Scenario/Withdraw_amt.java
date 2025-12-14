package Conditional.Scenario;
import java.util.*;
public class Withdraw_amt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amt:");
        int balance = 5000;
        int amt = sc.nextInt();

        if (amt > balance)
            System.out.println("No Money");
        else if (amt % 100 != 0)
            System.out.println("Enter 100 Multiple");
        else {
            balance = balance - amt;
            System.out.println("Balance = " + balance);
        }
    }
}
