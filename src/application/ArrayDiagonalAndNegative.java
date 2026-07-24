package application;
import java.util.Scanner;

public class ArrayDiagonalAndNegative {
public static void main(String []args){
    Scanner sc= new Scanner(System.in);

    System.out.print("Digite o tamanho da matriz: ");
    int n = sc.nextInt();
    int [][] mat =  new int [n][n];
    int count = 0;
    for(int i=0; i<n; i++){
        for(int j=0;j<n;j++) {
            mat[i][j] = sc.nextInt();
           if(mat[i][j]<0){
               count++;
           }
        }
    }
    System.out.print("Main diagonal: ");

    for(int i=0; i<n; i++){
        System.out.println(mat[i][i]+" ");
    }
    System.out.println("Negative numbers: "+count);



}

}
