import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int a = num.nextInt();

        if (a%2 == 0){
            System.out.println("given number is Even");
        }
        else {
            System.out.println("given number is Odd");
        }
    }
}
