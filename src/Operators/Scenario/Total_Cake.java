package Operators.Scenario;
import java.util.Scanner;

public class Total_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cakesPerHour = sc.nextInt();
        int totalHours = sc.nextInt();
        int totalCakes = cakesPerHour * totalHours;
        System.out.println("Total Cake: "+totalCakes);
    }
}

