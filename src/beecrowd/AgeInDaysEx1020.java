/*
Read an integer value corresponding to a person's age (in days) and print it in years, months and days,
 followed by its respective message “ano(s)”, “mes(es)”, “dia(s)”.

Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days every month.
 In the cases of test there will never be a situation that allows 12 months and some days, like 360, 363 or 364.
 This is just an exercise for the purpose of testing simple mathematical reasoning.

Input
The input file contains 1 integer value.

Output
Print the output, like the following example.
*/
package beecrowd;
import java.util.Scanner;
public class AgeInDaysEx1020 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int agedays = sc.nextInt();
        int year = 0;
        int month = 0;
        int day = 0;


        while(agedays>=365){
             year++;
            agedays-=365;
        }
        while(agedays>=30){
            month++;
            agedays-=30;
        }
        while(agedays>=1){
            day++;
            agedays-=1;
        }

        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(day + " dia(s)");


    }

}
