package Conditional.Scenario;
import java.util.*;
public class Pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int marks = sc.nextInt();
        if (marks >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
