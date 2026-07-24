package application;
import java.util.Scanner;

public class ArrayPosition {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite os tamanho de linha e coluna da matriz: ");
    int m = sc.nextInt();
    int n = sc.nextInt();

    int [][]mat = new int[m][n];
    System.out.println("Digite a MATRIZ abaixo:");
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            mat[i][j] = sc.nextInt();
        }
    }

    System.out.print("Digite o número que quer saber a posição: ");
    int x = sc.nextInt();

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if (x==mat[i][j]){
                System.out.print("Position "+i+","+j+":\n");
               if(j>0){
                   System.out.print("Left: "+mat[i][j-1]+"\n");
               }
               if(i>0){
                   System.out.print("Up: "+mat[i-1][j]+"\n");
               }
               if(j<n-1){
                   System.out.print("Right: "+mat[i][j+1]+"\n");
               }
               if(i<m-1){
                   System.out.print("Down: "+mat[i+1][j]+"\n");
               }

            }

        }
    }


}

}
