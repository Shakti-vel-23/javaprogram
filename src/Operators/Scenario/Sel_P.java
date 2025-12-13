package Operators.Scenario;
import java.util.Scanner;

public class Sel_P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int costPrice = sc.nextInt();
        int profit = sc.nextInt();
        int sellingPrice = costPrice + profit;
        System.out.println("Selling Price: "+sellingPrice);
    }
}

