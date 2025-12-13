package Conditional.Year_Based;
import java.util.*;
public class Century {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 100 == 0) {
            System.out.println("Century Year");
        } else {
            System.out.println("Not Century Year");
        }
    }
}
