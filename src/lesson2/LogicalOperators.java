package lesson2;

/**
 * ლოგიკური ოპერაციები
 */
public class LogicalOperators {

    public static void main(String args[]) {
        boolean a = false;
        boolean b = true;

        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a || b) = "+ !(a || b));
        System.out.println("!(a && b) = " + !(a && b));
    }

}
