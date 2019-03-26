package lesson3;

/**
 * მასივის ზომა არის განსაზღვრული
 */
public class SizedDimensionArray {

    public static void main(String[] args) {

        int[] series = new int[11];

        series[0] = 10;
        series[1] = 11;
        series[2] = 13;
        series[3] = 90;
        series[4] = 10;

        for(int i = 0; i < series.length; i++){
            System.out.println(" ელემენტი => "+series[i]);
        }
    }
}
