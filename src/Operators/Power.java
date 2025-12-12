package Operators;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        int n = 32;  // change this number to test

        String[] result = {n + " is NOT a power of 2", n + " is a power of 2"};

        // Index becomes 1 if power of 2, otherwise 0
        int index = (n > 0 && (n & (n - 1)) == 0) ? 1 : 0;

        System.out.println(result[index]);
    }
}
