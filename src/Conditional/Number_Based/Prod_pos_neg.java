package Conditional.Number_Based;
import java.util.*;
public class Prod_pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prd = a * b;
        if (prd > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("negative");
        }
    }
}
