import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("enter the Year: ");
        int a = num.nextInt();

        if ( a%4 == 0){
            System.out.println(a +  " is a Leap Year");
        }
        else{
            System.out.println(a +  " is not a Leap Year");
        }

    }
}
