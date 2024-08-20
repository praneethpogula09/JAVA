import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {

        /*WHILE LOOP
        Syntax:

        initialisation();

        while ( condition) {

        statements;

        increment/ Decrement
        }

        */


        // printing the numbers from 1 to n using While loop:

        System.out.print("Enter the Number:   ");
        Scanner a = new Scanner(System.in);
        int n= a.nextInt();

        int b = 1;
        while (b <= n){
            System.out.print(b + " ");
            b++;
        }



        /* same qn using DO While:
        Syntax:

        initialise ;

        do {
        statement;
        }
        while( condition);

         so it will execute at least execute one time

         */
        System.out.println(" ");
        System.out.println("this is DO while");

        System.out.print("Enter the Number:   ");
        Scanner d = new Scanner(System.in);
        int num= d.nextInt();
        int c =1;

        do {
            System.out.print(c + " ");
            c +=1;

        } while(c <=num);

    }
}
