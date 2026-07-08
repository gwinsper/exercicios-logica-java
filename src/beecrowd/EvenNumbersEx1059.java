/*
Write a program that prints all even numbers between 1 and 100, including them if it is the case.

Input
In this extremely simple problem there is no input.

Output
Print all even numbers between 1 and 100, including them, one by row.
*/
package beecrowd;

public class EvenNumbersEx1059 {
    public static void main(String[] args) {


        for(int x=2; x % 2 ==0 && x<=100;x++){
            System.out.println(x);
            x++;

        }





    }
}
