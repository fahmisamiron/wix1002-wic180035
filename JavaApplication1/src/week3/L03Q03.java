package week3;

import java.util.Scanner;

public class L03Q03 {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        double init_vol, final_vol;
        System.out.print("Enter your sales volume : ");
        init_vol = s.nextDouble();
        
        if (init_vol <= 100) {
            final_vol = init_vol*5/100;
            System.out.printf("Your commision is " + "%6.2f",final_vol);
            System.out.print("\n");
        } else if (init_vol > 100 && init_vol <= 500) {
            final_vol = init_vol*7.5/100;
            System.out.printf("Your commision is " + "%6.2f",final_vol);
            System.out.print("\n");
        } else if (init_vol > 500 && init_vol <= 1000) {
            final_vol = init_vol*10/100;
            System.out.printf("Your commission is " + "%6.2f",final_vol);
            System.out.print("\n");
        } else {
            final_vol = init_vol*12.5/100;
            System.out.printf("Your commission is " + "%6.2f",final_vol);
            System.out.print("\n");
        }
    }
    
}