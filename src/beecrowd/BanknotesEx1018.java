/*
In this problem you have to read an integer value and calculate the smallest possible number of banknotes in which the value may be decomposed.
 The possible banknotes are 100, 50, 20, 10, 5, 2 and 1. Print the read value and the list of banknotes.

Input
The input file contains an integer value N (0 < N < 1000000).

Output
Print the read number and the minimum quantity of each necessary banknotes in Portuguese language,
 as the given example. Do not forget to print the end of line after each line, otherwise you will receive “Presentation Error”.
 */
package beecrowd;
import java.util.Scanner;

public class BanknotesEx1018 {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int n= sc.nextInt();
    int cem = 0;
    int cinquenta = 0;
    int vinte = 0;
    int dez = 0;
    int cinco = 0;
    int dois = 0;
    int um = 0;
    int nn = n;



    while(100<=n){
        cem++;
        n -= 100;
    }
    while(50<=n){
        cinquenta++;
        n -= 50;
    }
    while(20<=n){
        vinte++;
        n -= 20;
    }
    while(10<=n){
        dez++;
        n -= 10;
    }
    while(5<=n){
        cinco++;
        n -= 5;
    }
    while(2<=n){
        dois++;
        n -= 2;
    }
    while(1<=n){
        um++;
        n -= 1;
    }
    System.out.println(nn);
    System.out.println(cem+" nota(s) de R$ 100,00");
    System.out.println(cinquenta+" nota(s) de R$ 50,00");
    System.out.println(vinte+" nota(s) de R$ 20,00");
    System.out.println(dez+" nota(s) de R$ 10,00");
    System.out.println(cinco+" nota(s) de R$ 5,00");
    System.out.println(dois+" nota(s) de R$ 2,00");
    System.out.println(um+" nota(s) de R$ 1,00");




}
}
