package Operator_Scenario;
import java.util.*;
public class Split {
    public static void main(String[] args){
        System.out.println("Total Bill: ");
        Scanner sc = new Scanner(System.in);
        int Bill = sc.nextInt();
        System.out.println("How many Members: ");
        int Mem = sc.nextInt();
        int total = Bill/Mem;
        System.out.println("Your Split: "+ total);

    }
}
