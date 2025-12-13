package Operators.Scenario;
import java.util.Scanner;
public class Atm_Cur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int notes2000 = amount / 2000;
        amount = amount % 2000;
        int notes500 = amount / 500;
        amount = amount % 500;
        int notes100 = amount / 100;
        System.out.println("2000Rs Note: "+notes2000);
        System.out.println("500Rs Note: "+notes500);
        System.out.println("100Rs Note: "+notes100);
    }
}

