import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {


        Scanner num = new Scanner(System.in);

        System.out.println("enter the Marks: ");
        int a = num.nextInt();

        /*System.out.println("enter the English: ");
        int a = num.nextInt();

        System.out.println("enter the Math: ");
        int b = num.nextInt();

        System.out.println("enter the Science: ");
        int c = num.nextInt();

        System.out.println("enter the Arts: ");
        int d = num.nextInt();

         int total =  a+b+c+d ;
         */

        int total =  a ;


        if ( (90<= total) &&  (total <= 100) ) {
            System.out.println("Grade A");
        }
        else if ((80<= total) &&  (total <= 89) ) {
            System.out.println("Grade B");
        }
        else if (70<= total &&  total <= 79 ) {
            System.out.println("Grade C");
        }
        else if (60<= total &&  total <= 69 ) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }


    }


}
