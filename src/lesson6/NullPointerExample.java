package lesson6;

import java.util.ArrayList;
import java.util.List;

public class NullPointerExample {

    public void exceptionHandle(){
        List<String> persons_list = new ArrayList<>();

        Integer numberOfStudents = null;

        System.out.println("დაიწყო კოდი");

        try {
            if(numberOfStudents > 0){
                numberOfStudents++;
            }
            persons_list.get(3);
        }
        catch (Exception e){
            System.out.println(e.getStackTrace()[0].getLineNumber());
        }
        finally {
            numberOfStudents = new Integer(2);
            System.out.println("არსებული მნიშვნელობის კორექტირება:"+numberOfStudents);
        }

        System.out.println("ჰერე ვი არე");
    }



}
