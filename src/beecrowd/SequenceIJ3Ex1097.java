/*Make a program that prints the sequence like the following exemple.

Input
This problem doesn't have input.

Output
Print the sequence like the example below.*/
package beecrowd;

public class SequenceIJ3Ex1097 {
    public static void main(String[]args){
        int i=1;
        int j=7;
        while(i<=9){


            System.out.println("I="+i+" J="+j);
            j-=1;
            System.out.println("I="+i+" J="+j);
            j-=1;
            System.out.println("I="+i+" J="+j);
            j+=4;
            i+=2;
        }



    }


}
