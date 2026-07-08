/*
Make a program that reads five integer values.
 Count how many   of these values are even, odd, positive and negative.
 Print these information like following example.

Input
The input will be 5 integer values.

Output
Print a message like the following example with all letters in lowercase, indicating how many of these values
 are even, odd, positive and negative.
 */
package beecrowd;
import java.util.Scanner;

public class EvenOddPositiveAndNegativeEx1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;

        int a = sc.nextInt();
        if(a >= 1){positive ++;}else if(a<0){negative ++;}
        if(a % 2 == 0){even ++;}else{odd ++;}
        int b = sc.nextInt();
        if(b >= 1){positive ++;}else if(b<0){negative ++;}
        if(b % 2 == 0){even ++;}else{odd ++;}
        int c = sc.nextInt();
        if(c >= 1){positive ++;}else if(c<0){negative ++;}
        if(c % 2 == 0){even ++;}else{odd ++;}
        int d = sc.nextInt();
        if(d >= 1){positive ++;}else if (d<0){negative ++;}
        if(d % 2 == 0){even ++;}else{odd ++;}
        int e = sc.nextInt();
        if(e >= 1){positive ++;}else if(e<0){negative ++;}
        if(e % 2 == 0){even ++;}else{odd ++;}

        System.out.println(even+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(positive+ " valor(es) positivo(s)");
        System.out.println(negative+" valor(es) negativo(s)");


    }
}