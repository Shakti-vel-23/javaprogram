package Conditional.Number_Based;
import java.util.*;
public class Check_bitwise {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();

        if((a&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");

        }
}
}
