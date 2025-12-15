package Conditional.Scenario;
import java.util.*;
public class Weather {
     static void main() {
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the weather in Celsious: ");
         int cels = s.nextInt();
         if (cels >= 0 && cels <= 14) {
             System.out.println("Weather is Cold");
         } else if (cels >= 15 && cels <= 24) {
             System.out.println("Weather is Pleasent");
         } else if (cels >= 25 && cels <= 34) {
             System.out.println("Weather is Hot");
         } else
             System.out.println("Weather is HotWave");
     }
}