package Operators.Scenario;
import java.util.Scanner;
public class Cost_P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sellingPrice = sc.nextInt();
        int loss = sc.nextInt();
        int costPrice = sellingPrice + loss;
        System.out.println("Cost Price: "+costPrice);
    }
}

