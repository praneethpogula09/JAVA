// Loops - While , Do while , For

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        /* For loop example with Tables of a number */
        /* for Syntax:

        for ( initialization ; condition ; increment / Decrement )
        {
        statements
        }

        */

        System.out.print("enter the Multiplication Table Number:    ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int i;
        int c=1;

        for (  i=num ; i <= num*10 ; i += num ) {

            System.out.println(num + " * " + c + " =" + i);
            c++;
                }





            // print numbers from 1 to n

            System.out.print("Enter the Number to print n numbers:   ");
            Scanner a = new Scanner(System.in);
            int n = a.nextInt();
            int b;

            for ( b=1 ; b<=n ; b+=1 ){
                System.out.print(b + " ");
            }






    }
}