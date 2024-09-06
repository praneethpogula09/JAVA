import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
      String greet =  new_Method();
        System.out.println(greet);

    }

    static String new_Method (){
            Scanner word = new Scanner(System.in);
        System.out.println("Enter a name or sentence:   ");
            String name = word.next();

            /*String name = "Hello World";
            System.out.println(name);
            return name;*/
                // or
            return name;

    }



}
