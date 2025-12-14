package Conditional.Scenario;
import java.util.*;
public class Electric_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your unit");
        int units = sc.nextInt();
        double bill = 0;
        if (units <= 100) System.out.println("Free unit");
        else if (units <= 300) bill = (units - 100) * 5;
        else {
            bill = (200) * 5 + (units - 300) * 10;
        }
        if (units > 500) bill = bill + bill * 0.15;
        System.out.println("Bill = " + bill);
    }
}
