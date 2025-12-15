package Conditional.Scenario;
import java.util.*;
public class Discount {
    public static void main(String[] args){
        System.out.println("Discount Based on your PURCHASE:" );
        System.out.println("Enter your Purchase Amt: ");
        Scanner s = new Scanner(System.in);
        double amt = s.nextInt();
        if(amt>=500 || amt<1000){
            double Disc = amt * 0.1;
            System.out.println("Your Disc Amt: "+ Disc);
            System.out.println("Your Disc Amt: "+ (amt-Disc));
        }
        else if(amt>=1000 || amt<2000){
            double Disc= amt* 0.2;
            System.out.println("Your Disc Amt: "+ Disc);
            System.out.println("Your Disc Amt: "+ (amt-Disc));
        }
        else
            System.out.println("Not Applicable for Discount");

    }

}
