/*
**Sphere**
Make a program that calculates and shows the volume of a sphere being provided the value of its radius (R) .
 The formula to calculate the volume is: (4/3) * pi * R3. Consider (assign) for pi the value 3.14159.


Input
The input contains a value of floating point (double precision).

Output
The output must be a message "VOLUME" like the following example with a space before and after the equal signal.
 The value must be presented with 3 digits after the decimal point.*/
package beecrowd;
import java.util.Scanner;
public class SphereEx1011 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double x = sc.nextDouble();

        double vol = (4.0/3) * pi * x * x * x;

        System.out.printf("VOLUME = %.3f\n",vol);





    }
}
