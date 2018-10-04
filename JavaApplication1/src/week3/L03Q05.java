package week3;

import java.util.Scanner;

public class L03Q05 {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f : ");
        
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double d = s.nextDouble();
        double e = s.nextDouble();
        double f = s.nextDouble();
        
        if ((a*d - b*c) == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double x = ((e*d) - (b*f))/((a*d) - (b*c));
            double y = ((a*f) - (e*c))/((a*d) - (b*c));
            
            System.out.printf("x is %4.2f and y is %4.2f",x,y);
            System.out.print("\n");
        }
    }
}
