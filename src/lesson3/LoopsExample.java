package lesson3;

public class LoopsExample {

    public static void main(String[] args) {

        String[] STUDENT_LIST = {
            "USER_1",
            "USER_2",
            "USER_3",
            "USER_4"
        };

        // სტუდენტები ინდექსის მიხედვით
        for (int i = 0; i < STUDENT_LIST.length; i++) {
            System.out.println("სტუდენტი:"+STUDENT_LIST[i]);
        }

        System.out.println("[----------------]");

        // დავბეჭდოთ ყველა სტუდენტი
        for (String element: STUDENT_LIST) {
            System.out.println("სტუდენტი:"+element);
        }


        System.out.println("[----------------]");

        int studentSize = STUDENT_LIST.length;
        while( studentSize > 0 ) {
            studentSize--;
            System.out.println("სტუდენტი ტესტ:" + STUDENT_LIST[studentSize]);
        }
    }
}
