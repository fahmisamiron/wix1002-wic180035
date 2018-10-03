package week2;

import java.util.Scanner;

public class L02Q04 {
    public static void main(String []args) {
        int sec_old, hour, min, sec_new;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of seconds : ");
        sec_old = s.nextInt();
        hour = sec_old/3600;
        min = (sec_old%3600)/60;
        sec_new = ((sec_old%3600)%60);
        System.out.println(sec_old + " seconds is " + hour + " hours " + min + " minutes and " + sec_new + " seconds" );
    }
    
}
