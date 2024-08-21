import java.util.Scanner;

/*Fibonacci series with in N numbers too complex problem*/

public class Fibonacci_Series {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the Number: ");
        long nth_num = in.nextLong();
        long i;
        long count = 0;

        for ( i=1 ; i <= nth_num ; i+=1){

        long number = i;

        long reversed = 0;

        while (number != 0) {
            long fn = number % 10;
            reversed = reversed * 10 + fn;
            number = number / 10;
        }
        /*System.out.println("Reversed Number is:  " + reversed);*/

        if (i == reversed)
        {
            /*System.out.println("the given number  " + nth_num + "  is Fibonacci Series:");*/
            System.out.print( i +" ");
            count = count +1 ;
        }
       /* else
        {
            System.out.println("The given number  " + nth_num + "  is not a Fibonacci Series:");
        }*/

        }

        System.out.println("\n" + "Total Number of Occurrences is :  "+ count);

    }
}

