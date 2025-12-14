package Conditional.Scenario;
import java.util.*;
public class Atm_Pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check your atm pin: ");
        int storedPin = 1234;
        int entered = sc.nextInt();
        if (entered == storedPin) {
            System.out.println("PIN OK - Allow Withdrawal");
            System.out.println("Enter the amt to withdrwa: 12");
            int amt = sc.nextInt();
            System.out.println("Withdrawn = " + amt);
        } else {
            System.out.println("Wrong PIN");
        }
    }
}
