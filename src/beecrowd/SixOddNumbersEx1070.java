/*
Read an integer value X and print the 6 consecutive odd numbers from X, a value per line, including X if it is the case.

Input
The input will be a positive integer value.

Output
The output will be a sequence of six odd numbers.
*/
package beecrowd;
import java.util.Scanner;
public class SixOddNumbersEx1070 {
public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int odd =12+x;
 while(x<odd){


     if(x % 2 != 0){

     System.out.println(x);}
     x++;
 }




}




}


