package Operators.Basic;

import java.util.Scanner;
public class Lastnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a.charAt(a.length()-1));
    }
}
