package Looping;
import java.util.*;
public class Magic_no {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int sum = 0;
        while(n!=0){
            int rem = n%10;//9
            sum += rem;
            n/=10;

        }
        int sumcpy = sum;
        System.out.println(sum);
        int  rev= 0;
        while(sumcpy!=0){
            int dig= sumcpy%10; //9
            rev= rev*10+dig;  //  9
             sumcpy/=10;


        }
         int ttl = rev*sum;

        System.out.println(rev);

        System.out.println(ttl);
    }
}
