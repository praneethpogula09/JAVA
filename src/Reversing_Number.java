import java.util.Scanner;

public class Reversing_Number {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int number = in.nextInt();

        int reversed = 0 ;

        while (number != 0){
            int fn = number % 10 ;
            reversed = reversed * 10 + fn ;
            number = number / 10 ;
        }
        System.out.println("Reversed Number is:  " + reversed);













    }


}
