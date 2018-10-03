package week2;

import java.util.Scanner;

public class L02Q01 {
    public static void main(String []args) {
        double fahrenheit, celcius;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit : ");
        fahrenheit = s.nextDouble();
        celcius = (fahrenheit-32)/1.8;
        System.out.printf("Temperature in Celcius is " + "%6.2f", celcius);
        System.out.printf("\n");
    }
}
