package Operators.Scenario;
import java.util.Scanner;
public class Sal_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        int hra = sc.nextInt();
        int allowance = sc.nextInt();
        int totalSalary = basic + hra + allowance;
        System.out.println("Total Salary: "+ totalSalary);
    }
}

