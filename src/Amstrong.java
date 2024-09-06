import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {

        //int num = 153;
        //int num2 = num;
        int sum= 0;
        int temp = 0;

        for (int i = 100 ; i < 1000 ; i++) {
            int dub = i ;

            while (dub > 0) {

                int rem = dub % 10;
                //int digit = rem ;
                int cube = rem * rem * rem;
                sum = temp + cube;
                temp = sum;
                 dub =  dub / 10;

            }

            if ( sum == i){
                System.out.println(i + "  ");
            }

        }

       /* if ( sum == num2){
            System.out.println("It is a Amstrong number");
        }
        else{
            System.out.println("not a n amstrong number");
        }
*/

    }
}
