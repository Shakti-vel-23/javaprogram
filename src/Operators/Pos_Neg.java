package Operators;
import java.util.Scanner;
public class Pos_Neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String c = (a>0)?"Positive":"Negative";
        System.out.println(c);
    }
}
