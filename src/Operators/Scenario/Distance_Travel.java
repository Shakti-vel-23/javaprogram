package Operators.Scenario;
import java.util.*;
public class Distance_Travel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Speed: ");
        int speed = sc.nextInt();
        System.out.println("Time: ");
        int time = sc.nextInt();
        System.out.println("Distance: " + speed*time);
    }
}
