package Conditional.Number_Based;
import java.util.*;
public class Giv_three_ {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a/100!=0 && a/1000==0){
            System.out.println("3 digit number");
        }
        else{
            System.out.println("Not a 3 digit number");
        }
    }
}
