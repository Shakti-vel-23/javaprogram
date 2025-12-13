package Operators.Scenario;
import java.util.Scanner;

public class Pen_Off {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pricePerPen = sc.nextInt();
        int pensBought = sc.nextInt();
        int freePens = pensBought / 5 * 2;
        int pensToPay = pensBought - freePens;
        int totalCost = pensToPay * pricePerPen;
        System.out.println(pensToPay);
        System.out.println(totalCost);
    }
}

