package Conditional.Scenario;
import java.util.Scanner;
public class Valid_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        if (mobile.length() >= 10) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }

        sc.close();
    }
}

