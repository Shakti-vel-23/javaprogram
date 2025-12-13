package Conditional.Year_Based;
import java.util.*;
public class First_Last_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int firstTwo = year / 100;
        int lastTwo = year % 100;

        if (firstTwo == lastTwo) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
