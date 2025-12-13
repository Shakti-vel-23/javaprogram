package Conditional.Scenario;
import java.util.*;
public class Eligible_vote {
    public static void main(String[] args){
        System.out.print("Enter your age: ");
        Scanner a = new Scanner(System.in);
        int age = a.nextInt();
        if(age>=18)
            System.out.println("Your Eligible for VOTE!!!");

        else
        System.out.println("Your not Eligible for VOTE!!!");
    }
}
