package Conditional.Scenario;
import java.util.*;
public class Battery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Battery Percentage: ");
        int percent = sc.nextInt();
        if (percent <= 20)
            System.out.println("Low Battery");
        else if (percent <= 50)
            System.out.println("50% Consumed");
        else
            System.out.println("Battery Full");
    }
}
