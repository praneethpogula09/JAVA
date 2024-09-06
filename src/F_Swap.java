public class F_Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //swap(a,b);

        // created an object for class Work to use swap method inside it
        Work obj = new Work();

        //with this obj ref variable we can call the methods in side the Work class using below statement
        obj.swap(a,b);


        //System.out.println(obj.swap(a,b));


    }

    static class Work {

     void swap(int c, int d) {
        int temp = c;
        c = d;
        d = temp;
        //System.out.println(c+" " +d);
        //return (c,d);

         System.out.println(c+ " "+ d);
        }




    }





}
