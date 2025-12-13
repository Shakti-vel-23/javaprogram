package Operators.Scenario;
import java.util.Scanner;

public class Mango_Off {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pricePerMango = sc.nextInt();
        int mangoesPurchased = sc.nextInt();
        int freeMangoes = mangoesPurchased / 3;
        int totalMangoes = mangoesPurchased + freeMangoes;
        int amountToPay = mangoesPurchased * pricePerMango;
        System.out.println("Total Mango: "+totalMangoes);
        System.out.println("Total Amt: "+amountToPay);
    }
}

