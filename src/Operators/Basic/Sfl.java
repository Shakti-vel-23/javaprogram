package Operators.Basic;

import java.util.Scanner;
public class Sfl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n/100;//first
        int b = n%10;
        System.out.println(a+b);
    }
}
