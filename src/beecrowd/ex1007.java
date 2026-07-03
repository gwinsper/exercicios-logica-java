/*
**Difference**
Read four integer values named A, B, C and D.
 Calculate and print the difference of product A and B by the product of C and D (A * B - C * D).

Input
The input file contains 4 integer values.

Output
Print DIFERENCA (DIFFERENCE in Portuguese) with all the capital letters, according to the following example,
 with a blank space before and after the equal signal.*/
package beecrowd;
import java.util.Scanner;
public class ex1007 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int dif = ((A*B)-(C*D));
        System.out.println("DIFERENCA = "+dif);





    }

}
