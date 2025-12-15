package Looping;
import java.util.*;
public class twisted_prime {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int num= 0;
        int cp= 0;
        while (n != 0) {
            if (n > 2 && n % 2 == 0) {
                System.out.println("Its Not Prime");
                num+=n;
                cp+=1;
                break;
            } else {
                System.out.println("Its Prime");
                num += n;
                break;

            }
        }
        int temp_num= num;
        int rev = 0;
        int dcp=0;
        while(temp_num!=0){
            int dig = temp_num%10;
            rev= rev*10+dig;
            temp_num/=10;

        }
        System.out.println("Reversed Number: "+ rev);
        if(rev>2 && rev%2==0){
            System.out.println("Its Not Prime");
        }
        else{
            System.out.println("Its Prime");
        }
        if(cp==dcp){
            System.out.println("Not Twisted Prime");
        }
        else
            System.out.println("Twisted Prime");

    }

}
