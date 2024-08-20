/* will be given 3 numbers A,B, C -
should print largest of the 3 numbers */

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;

        if (b >= max){
            max = b ;
        }
        if (c >= max ){
            max = c ;
        }

        System.out.printf("The Highest Number is:  %d%n", max);



    }
}
