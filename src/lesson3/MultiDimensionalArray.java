package lesson3;

/**
 * მრავალ განზომილებიანი მასივია
 */
public class MultiDimensionalArray {


    public static void main(String[] args) {

        // ორგანზომილებიანი მასივია
        int[][] multi_dimension_massive = new int[][] {
            {1, 2, 23, 45, 77, 100, 10}, // 0
            {1102, 30, 0, 1, 3, 4} // 1
        };


        for(int row = 0; row < multi_dimension_massive.length; row++){
            System.out.println(" ინდექსი:"+ row);
            for(int col = 0; col < multi_dimension_massive[row].length; col++){
                if(row > 0){
                    break;
                }
                System.out.println("კორდინატები: ["+row+"] ["+col+"] => მნიშვნელობა "+multi_dimension_massive[row][col]);
            }
        }

        String[][] multi_dimension_string = new String[][]{
            {"Mike", "Jhon", "Ludvig"},
            {"Londa", "Tute", "Samanda"}
        };

        System.out.println(" [--------] ");

        for(int row = 0; row < multi_dimension_string.length; row++){
            for(int col = 0; col < multi_dimension_string[row].length; col++){
                System.out.println("კორდინატები: ["+row+"] ["+col+"] => მნიშვნელობა "+multi_dimension_string[row][col]);
            }
        }


    }
}
