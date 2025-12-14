package Conditional.Scenario;
import java.util.*;
public class Senior_Citz {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            System.out.println("Enter your age: ");
            if (age >= 60) System.out.println("Senior Citizen");
            else System.out.println("Not Senior");
        }
}
