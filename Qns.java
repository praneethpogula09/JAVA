import java.util.Scanner;

public class Qns {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        /*System.out.println("enter the Letter:  ");
        char letter = input.next().charAt(0);*/

        // qn 1) vowel or Consonant

       /* if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println(letter + " is a vowel");
        }
        else {
            System.out.println(letter + " is a consonant");
        }
        */

        //2 nd qn reversing a number

       /* System.out.println("enter the Number:  ");
        int num = input.nextInt();

        int i ;
        int reminder ;
        int output = 0;

        while (num !=0 ){
            reminder = num % 10 ;
            output = output * 10 + reminder;
            num  = num / 10 ;
        }
        System.out.println(output);
        */

        //3rd qn prime number check

        /*System.out.println("enter the Number:  ");
        int num = input.nextInt();
        int a = 0 ;

        for ( int i =2; i < num ; i ++){
            if ( num % i == 0) {
                System.out.println("it is not a Prime Number");
                 a ++ ;
                break;
                }

            }
            if ( a == 0){
                System.out.println("it is a  Prime Number");
            }*/


            // 4 qn - Fibinacci series

                /*System.out.println("Enter the Number:  ");
                int num = input.nextInt();
                int i ;
                int a = 0;
                int b = 1;
                int c = 0 ;

                for ( i = 1 ; i < num ; i++ ){
                     c = a + b ;
                     a = b;
                     b = c;
                }
                System.out.println(c);*/

            // 5 Qn - Pattern Printing

                /*System.out.println("Enter the Number:  ");
                int num = input.nextInt();

                for ( int i = 1; i <= num ; i ++){

                    for ( int j = 1 ; j <= i ; j ++){
                        System.out.print("* ");

                    }
                    System.out.println();

                }*/


                // Qn 6- Counting Occurrences

                System.out.println("Enter the Number:  ");
                int num = input.nextInt();
                System.out.println("Enter the digit to check:  ");
                int digit = input.nextInt();
                int count = 0;
                int ref;

                while ( num > 0 ){
                     ref = num % 10 ;
                     if ( ref == digit){
                         count ++;
                     }
                     num = num /10 ;
                }
                System.out.println("The Digit "+ digit + " repeated  " + count + " times");











        }

    }

