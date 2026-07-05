/*
Read the four values corresponding to the x and y axes of two points in the plane,
 p1 (x1, y1) and p2 (x2, y2) and calculate the distance between them, showing four decimal places,

Input
The input file contains two lines of data. The first one contains two double values: x1 y1
 and the second one also contains two double values with one digit after the decimal point: x2 y2.

Output
Calculate and print the distance value using the provided formula, with 4 decimal places.*/
package beecrowd;
import java.util.Scanner;
public class DistanceBetweenTwoPointsEx1015 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.nextLine();
        double xx = sc.nextDouble();
        double yy = sc.nextDouble();

        double distance = Math.sqrt(((xx - x)*(xx - x))+((yy - y)*(yy - y)));

        System.out.printf("%.4f\n",distance);

    }
}
