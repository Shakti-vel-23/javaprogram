package Looping;
import java.util.*;
public class Amstrong {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int ams = a.nextInt(); //15
        int tem = ams;
        int ams1 = 0;
        while(ams!=0){
            int rem = ams%10; //3 -> 5
            ams1 += rem*rem*rem; //9 -> 25
            ams/=10; // 15 ->

        }

        System.out.println(ams1);

        if(ams1== tem){
            System.out.println("Its an Amstrong number");
        }
        else
            System.out.println("Its not an Amstrong number");

    }
}
