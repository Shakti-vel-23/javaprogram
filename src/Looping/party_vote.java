package Looping;
import java.util.*;
public class party_vote {
    public static void main(String[] args){
        System.out.println("To Start Vote Press 1");
        Scanner b = new Scanner(System.in);
       // int part = b.nextInt();
        int s=10;
        System.out.println("Enter 1 for TVK: ");
        System.out.println("Enter 2 for DMK: ");
        System.out.println("Enter 3 for ADMK: ");
        Scanner a = new Scanner(System.in);
        int vote = a.nextInt();

        int tvk = 0;
        int dmk = 0;
        int admk = 0;

        while(s!=0){
            if(vote==1){
                tvk++;
                System.out.println("Voted for TVK");
                s--;

            }
            else if(vote==2){
                dmk++;
                System.out.println("Voted for DMK");
                s--;

            }
            else if(vote==3){
                admk++;
                System.out.println("Voted for ADMK");
                s--;

            }
            else if(vote==-1){
                System.out.println("Exited");
                break;
            }
            else {
                System.out.println("Invalid Input");

            }

        }


        System.out.println("Total for Tvk: " + tvk);
        System.out.println("Total for Dmk: " + dmk);
        System.out.println("Total for Admk: " + admk);

    }

}
