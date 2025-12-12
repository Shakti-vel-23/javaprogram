package Decision_Making;
import java.util.*;
public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =  sc.nextInt();
        int y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("First Quad");
        }
        else if(x<0 && y>0){
            System.out.println("Second Quad");
        }
        else if(x<0 && y<0){
            System.out.println("Third Quad");
        }
        else if(x>0 && y<0){
            System.out.println("Fourth Quad");
        }
    }


}
