package Conditional.Character_Based;
import java.util.*;
public class Dig_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if (a >= '0' && a <= '9') {
            System.out.println("Digits");
        } else {
            System.out.println("Not Digits");
        }
    }
}
