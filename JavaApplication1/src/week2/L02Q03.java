package week2;

import java.util.Random;

public class L02Q03 {
    public static void main(String []args) {
        Random g = new Random();
        int num;
        num = g.nextInt(41) + 10;
        System.out.println(num);
    }
    
}
