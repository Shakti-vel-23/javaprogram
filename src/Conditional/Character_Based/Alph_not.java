package Conditional.Character_Based;
import java.util.*;
public class Alph_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = Character.toUpperCase(a);
        if (b >= 'A' && b <= 'Z') {
            System.out.println("Alphabtes");
        } else {
            System.out.println("Not Alphabets");
        }
    }
}
