import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Factorial number:  ");
        int a = in.nextInt();


        /*factorial number is
        4! = 1 X 2 X 3 X 4
         */
        double b=1;
        int i ;
        for (i=1; i <= a ; i+=1){
            b= b * i ;

        }
        System.out.println("Enter the Factorial value is :  " + b);




    }
}
