package Conditional.Scenario;

import java.util.Scanner;
import java.util.*;
public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle speed (km/h): ");
        int speed = sc.nextInt();

        if (speed > 100) {
            System.out.println("Warning: Speed exceeds 100 km/h!");
        } else {
            System.out.println("Speed is within the limit.");
        }

        sc.close();
    }
}
