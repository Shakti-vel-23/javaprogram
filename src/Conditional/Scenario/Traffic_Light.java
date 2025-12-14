package Conditional.Scenario;
import java.util.*;
public class Traffic_Light {
    public static void main(String[] args) {
        System.out.println("Enter the Signal Colour");
        Scanner sc = new Scanner(System.in);
        String c = sc.next().toLowerCase();
        if (c.equals("red"))
            System.out.println("Stop");
        else if (c.equals("yellow"))
            System.out.println("Ready");
        else if (c.equals("green"))
            System.out.println("Go");
        else
            System.out.println("Invalid");
    }
}
