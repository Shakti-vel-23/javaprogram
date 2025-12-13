package Conditional.Number_Based;
import java.util.*;
public class Div_three_five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("Divsible by 3 and 5");
        } else {
            System.out.println(" Not Divsible by 3 and 5");
        }
    }
}
