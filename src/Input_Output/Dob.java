package Input_Output;

import java.util.*;
public class Dob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int date = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        System.out.println(date + "/" + month + "/" + year);
    }
}
