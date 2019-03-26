package lesson3;

public class LoopsExample {

    public static void main(String[] args) {

        // [0,1,2,3,4,5,6,7,8,9]
        int[] number_massive = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        /**
         * 0 | 10
         * 1 | 2
         * 2 | 3
         * 3 | 4
         * 4 | 5
         * 5 | 6
         * 6 | 7
         * 7 | 8
         * 8 | 9
         * 9 | ArrayIndexOutOfBoundsException
         */

        boolean[] boolean_massive = {true, false, true, false, true};

        Car[] cars_massive = {
           new Car("E60", "BMW"),
           new Car("E320", "Mercedess")
        };

        String[] STUDENT_MASSIVE = {
            "STUDENT_1",
            "STUDENT_2",
            "STUDENT_3",
            "STUDENT_4"
        };


        // თითოეულ ელემენტს გადაურბენს
        for (String a : STUDENT_MASSIVE){
            System.out.println("ელემენტის მნიშვნელობაა:"+a);
        }

        System.out.println("[ ---------  ]");

        for(int i = 0; i <= STUDENT_MASSIVE.length; i++){
            System.out.println("ინდექსით ამოღება სადაც I = "+i+" და ელემენტი "+STUDENT_MASSIVE[i]);
        }

        // სტუდენტები ინდექსის მიხედვით
        for (int i = 0; i < STUDENT_MASSIVE.length; i++) {
            System.out.println("სტუდენტი:"+STUDENT_MASSIVE[i]);
        }

        System.out.println("[----------------]");

        // დავბეჭდოთ ყველა სტუდენტი
        for (String element: STUDENT_MASSIVE) {
            System.out.println("სტუდენტი:"+element);
        }

        System.out.println("[----------------]");

        int studentSize = STUDENT_MASSIVE.length;
        while( studentSize > 0 ) {
            studentSize--;
            System.out.println("სტუდენტი ტესტ:" + STUDENT_MASSIVE[studentSize]);
        }
    }
}
