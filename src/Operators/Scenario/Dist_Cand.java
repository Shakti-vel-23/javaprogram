package Operators.Scenario;
import java.util.Scanner;

public class Dist_Cand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int students = sc.nextInt();
        int perStudent = candies / students;
        int remaining = candies % students;
        System.out.println(perStudent);
        System.out.println(remaining);
    }
}
