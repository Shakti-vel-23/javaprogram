package Operators;
import java.util.Scanner;
public class Got {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        int d = a.nextInt();
        int e = (b>=c)?b:c;
        int f = (c>=d)?c:d;
        int g = (d>=e)?d:e;
        System.out.println(g);
    }
}
