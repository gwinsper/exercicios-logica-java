/*
Make a program that reads five integer values. Count how many of these values ​​are even and  print this information like the following example.

Input
The input will be 5 integer values.

Output
Print a message like the following example with all letters in lowercase, indicating how many even numbers were typed.
*/

package beecrowd;
import java.util.Scanner;
public class EvenBetweenFiveNumbersEx1065 {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
     int even = 0;
    int a = sc.nextInt();
    if (a % 2==0){even++;}
    int b = sc.nextInt();
    if (b % 2==0){even++;}
    int c = sc.nextInt();
    if (c % 2==0){even++;}
    int d = sc.nextInt();
    if (d % 2==0){even++;}
    int e = sc.nextInt();
    if (e % 2==0){even++;}

    System.out.println(even+" valores pares");




}

}
