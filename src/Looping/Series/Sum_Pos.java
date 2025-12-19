package Looping.Series;
import java.util.Scanner;
public class Sum_Pos {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        int sum=0;
        while(true){
            n=sc.nextInt();
            if(n<0){
                break;}
            sum=sum+n;
            System.out.println(sum);
        }

        sc.close();}
}
