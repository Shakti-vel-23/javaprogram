package Operators;
import java.util.Scanner;
public class Pass_Fail {
    public static void main(String[] args) {
        System.out.print("Enter your mark: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = (a>50)?"Pass":"Fail";
        System.out.println("Your result is: "+b);

    }
}
