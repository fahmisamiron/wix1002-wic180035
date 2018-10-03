package week2;

import java.util.Scanner;

public class L02Q02 {
    public static void main(String []args) {
        double p, d, r, y, m;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the price of the car : ");
        p = s.nextDouble();
        System.out.print("Enter the down payment : ");
        d = s.nextDouble();
        System.out.print("Enter the interest rate in percentage : ");
        r = s.nextDouble();
        System.out.print("Enter the loan duration in year : ");
        y = s.nextDouble();
        m = (p-d)*(1+r*y/100)/(y*12);
        System.out.printf("Your monthly payment is " + "%6.2f",m);
        System.out.printf("\n");
        }
    
}
