package lesson2;

/**
 * If/Else Statement
 */
public class DecisionMakingIfStatement {


    public static void main(String[] args) {

        int a = 10;
        int b = 21;
        int d = 25;

        boolean p = a > 10 && b < 30;
        boolean q = d < 30;


        // Normal If Statement
        if (!(p || q)) {
            System.out.println("Normal If Statement -> Number:" + (d + 20));
        } else {
            System.out.println("Normal If Statement -> Number:" + (d - 20));
        }


        // Nested If Statement
        System.out.println((!(p || q)) ? ("Nested If Statement -> Number:" + (d + 20)) : ("Nested If Statement -> Number:" + (d - 20)));


        // Nested If Statement
        String dayNightString = (a >= 11) ? "დღე":"ღამე";


        System.out.println("ახლა არის:"+dayNightString);

    }
}
