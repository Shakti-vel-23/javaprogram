package Conditional.Number_Based;
import java.util.*;
public class Last_same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int last1 = a % 10;
        int last2 = b % 10;
        if (last1 == last2) {
            System.out.println("last digits same value");
        } else {
            System.out.println("Not equal");
        }
    }
}
