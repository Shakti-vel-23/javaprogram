package Looping;
import java.util.*;
public class Prime_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        while (n != 0) {
            if (n > 2 && n % 2 == 0) {
                System.out.println("Its not prime");
                break;
            } else {
                System.out.println("Prime");
                break;
            }
        }
    }
}