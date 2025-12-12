package Operator_Scenario;
import java.util.Scanner;
public class Price_Discount {
    public static void main(String[] args){
        System.out.println("Enter the Price Amt: ");
        Scanner sc = new Scanner(System.in);
        int Price = sc.nextInt();
        System.out.println("Enter the Discount Amt: ");
        int Discount = sc.nextInt();
        int Disc= (Price * Discount/100);
        int Total= Price - Disc;
        System.out.println("Your Discount Amt is: "+ Disc);
        System.out.println("Your Final Price: "+ Total);

    }
}
