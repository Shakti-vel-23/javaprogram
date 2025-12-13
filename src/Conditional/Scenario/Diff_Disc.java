package Conditional.Scenario;
import java.util.*;
public class Diff_Disc {
    public static void main(String[] args) {
        System.out.println("Enter the Bill Amt: ");
        Scanner a = new Scanner(System.in);
        int amt = a.nextInt();
        if(amt>=500 && amt<1000){
            double disc = amt * 0.10;
            System.out.println("Your discounted value: " + "Rs"+disc);
            System.out.println("Your Price Amt: "+ "Rs"+(amt-disc));
        }
        else if(amt>=1000 && amt<=5000){
            double disc = amt * 0.20;
            System.out.println("Your discounted value: " + "Rs"+ disc);
            System.out.println("Your Price Amt: "+ "Rs"+(amt-disc));

        }
    }
}
