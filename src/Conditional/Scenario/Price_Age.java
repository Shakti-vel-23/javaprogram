package Conditional.Scenario;
import java.util.*;
public class Price_Age {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your age to get your price:");
        int price;
        int age = a.nextInt();
        if(age>=0 && age<=12){
            price=199;
            System.out.println("Your Ticket Price: "+"Rs"+price);
        }
        else if(age>=13 && age <=55){
            price = 300;
            System.out.println("Your Ticket Price: "+"Rs"+price);
        }
        else
            System.out.println("Your TIcket Price: " + "Rs"+199);
    }
}
