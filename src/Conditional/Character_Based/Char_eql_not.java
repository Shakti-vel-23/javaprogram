package Conditional.Character_Based;
import java.util.*;
public class Char_eql_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        if (a == b) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal");
        }
    }
}
