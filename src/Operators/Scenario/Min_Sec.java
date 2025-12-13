package Operators.Scenario;
import java.util.*;
public class Min_Sec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the min: ");
        int min = sc.nextInt();
        int sec = min*60;
        System.out.println("Converted Sec: " + sec);
    }
}
