/*
Write a program that reads 6 numbers. These numbers will only be positive or negative (disregard null values). Print the total number of positive numbers.

Input
Six numbers, positive and/or negative.

Output
Print a message with the total number of positive numbers.
*/
package beecrowd;
import java.util.Scanner;

public class PositiveNumbersEx1060 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int positivos=0;
        double a = sc.nextDouble();
        if(a>0){positivos++;}
        double b = sc.nextDouble();
        if(b>0){positivos++;}
        double c = sc.nextDouble();
        if(c>0){positivos++;}
        double d = sc.nextDouble();
        if(d>0){positivos++;}
        double e = sc.nextDouble();
        if(e>0){positivos++;}
        double f = sc.nextDouble();
        if(f>0){positivos++;}

       System.out.println(positivos+" valores positivos");


        }


    }

