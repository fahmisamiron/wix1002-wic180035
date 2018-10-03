package week2;

import java.util.Random;

public class L02Q05 {
    public static void main(String []args) {
        Random g = new Random();
        int num, sum = 0;
        num = g.nextInt(10001);
        System.out.println("The random number is " + num);
        
        while(num>0) {
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("The sum of digits in the number is " + sum);
    }
    
}
