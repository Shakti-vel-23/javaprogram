package Operators;
import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String c = (n==m)?"True":"False";
        System.out.println(c);
    }
}
