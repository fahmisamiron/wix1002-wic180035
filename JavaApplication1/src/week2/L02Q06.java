package week2;
import java.util.Scanner;
public class L02Q06 {
    public static void main(String []args) {
        float init_temp, final_temp, Q;
        int M;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram : ");
        M = s.nextInt();
        System.out.print("Enter the initial temperature in Fahrenheit : ");
        init_temp = s.nextFloat();
        System.out.print("Enter the final temperature in Fahrenheit : ");
        final_temp = s.nextFloat();
        M = M/1000;
        init_temp = (float) ((init_temp-32)/1.8);
        final_temp = (float) (final_temp-32/1.8);
        Q = M*(final_temp-init_temp)*4184;
        System.out.println("The energy needed is " + Q + " Joules");
    }
}
