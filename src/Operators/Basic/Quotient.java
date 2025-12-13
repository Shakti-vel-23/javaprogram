package Operators.Basic;

import java.util.Scanner;
public class Quotient {
    public static void main(String[] args) {
        Scanner a  = new Scanner(System.in);
        int n = a.nextInt();
        int m = a.nextInt();
        int c = n/m;
        System.out.println(c);
    }
}
