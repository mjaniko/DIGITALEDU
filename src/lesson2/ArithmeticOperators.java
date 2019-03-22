package lesson2;

/**
 * არითმეტიკული ოპერაციები
 */
public class ArithmeticOperators {

    public static void main(String args[]) {

        int a = 10;
        int b = 21;
        int c = 25;
        int d = 25;


        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));

        System.out.println("c % a = " + (c % a));


        // მეტად ყურადღება მისაქცევია თუ რა სხვაობაა d++ და ++d -ს შორის
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));

    }
}
