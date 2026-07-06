/*
Read an integer value, which is the duration in seconds of a certain event in a factory,
 and inform it expressed in hours:minutes:seconds.

Input
The input file contains an integer N.

Output
Print the read time in the input file (seconds) converted in hours:minutes:seconds like the following example.
*/
package beecrowd;
import java.util.Scanner;
public class TimeConversionEx1019 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int sec = sc.nextInt();
        int hours=0;
        int minutes=0;
        int secs=0;
        while(sec>=3600){
            hours++;
            sec-=3600;
        }
        while(sec>=60){
            minutes++;
            sec-=60;
        }
        while(sec>=1){
            secs++;
            sec-=1;
        }

        System.out.println(hours+":"+minutes+":"+secs);


    }
}
