/*
Read a value of floating point with two decimal places.
This represents a monetary value. After this, calculate the smallest possible number of notes and coins on which the value can be decomposed.
 The considered notes are of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10, 0.05 and 0.01.
  Print the message “NOTAS:” followed by the list of notes and the message “MOEDAS:” followed by the list of coins.

Input
The input file contains a value of floating point N (0 ≤ N ≤ 1000000.00).

Output
Print the minimum quantity of banknotes and coins necessary to change the initial value, as the given example.
*/
package beecrowd;
import java.util.Scanner;
public class BanknotesAndCoinsEx1021 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double money = sc.nextDouble();
        money = Math.round(money * 100) / 100.0;
        double cem=0;
        double cinquenta=0;
        double vinte=0;
        double dez=0;
        double cinco=0;
        double dois=0;
        double um=0;
        double cinquentac=0;
        double vintecincoc=0;
        double dezc=0;
        double cincoc=0;
        double umc=0;

        while(money>=100){
            cem++;
            money-=100;
        }
        while(money>=50){
            cinquenta++;
            money-=50;
        }
        while(money>=20){
            vinte++;
            money-=20;
        }
        while(money>=10){
            dez++;
            money-=10;
        }
        while(money>=5){
            cinco++;
            money-=5;
        }
        while(money>=2){
            dois++;
            money-=2;
        }
        while (money>=1){
            um++;
            money = Math.round((money - 1.0)*100) / 100.0;
        }
        while(money>=0.50){
            cinquentac++;
            money = Math.round((money - 0.50)*100) / 100.0;
        }
        while(money>=0.25){
            vintecincoc++;
            money = Math.round((money - 0.25)*100) / 100.0;
        }
        while(money>=0.10){
            dezc++;
            money = Math.round((money - 0.10)*100) / 100.0;
        }
        while(money>=0.05){
            cincoc++;
            money = Math.round((money - 0.05)*100) / 100.0;
        }
        while(money>=0.01){
            umc++;
            money = Math.round((money - 0.01)*100) / 100.0;
        }
        System.out.println("NOTAS:");
        System.out.printf("%.0f nota(s) de R$ 100.00\n",cem);
        System.out.printf("%.0f nota(s) de R$ 50.00\n",cinquenta);
        System.out.printf("%.0f nota(s) de R$ 20.00\n",vinte);
        System.out.printf("%.0f nota(s) de R$ 10.00\n",dez);
        System.out.printf("%.0f nota(s) de R$ 5.00\n",cinco);
        System.out.printf("%.0f nota(s) de R$ 2.00\n",dois);
        System.out.println("MOEDAS:");
        System.out.printf("%.0f moeda(s) de R$ 1.00\n",um);
        System.out.printf("%.0f moeda(s) de R$ 0.50\n",cinquentac);
        System.out.printf("%.0f moeda(s) de R$ 0.25\n",vintecincoc);
        System.out.printf("%.0f moeda(s) de R$ 0.10\n",dezc);
        System.out.printf("%.0f moeda(s) de R$ 0.05\n",cincoc);
        System.out.printf("%.0f moeda(s) de R$ 0.01\n",umc);

    }

}
