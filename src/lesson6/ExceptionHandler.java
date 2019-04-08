package lesson6;


import java.util.ArrayList;
import java.util.List;

public class ExceptionHandler {

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();

        example.exceptionHandle();

        List<Lessons> lessonsList = new ArrayList<>();
        lessonsList.add(new Lessons("ლექცია 1", 1));
        lessonsList.add(new Lessons("ლექცია 2", 2));
        lessonsList.add(new Lessons("ლექცია 3", 3));
        lessonsList.add(new Lessons("ლექცია 4", 4));
        lessonsList.add(new Lessons("ლექცია 5", 5));
        lessonsList.add(new Lessons("ლექცია 6", 6));
        lessonsList.add(new Lessons("ლექცია 7", 7));

        try{
            iterateOverLessons(lessonsList);
        } catch (LessonsException e){
            System.out.println("დაბეჭდე კონკრეტული ლექცია => "+e.getCustomMessage());
        } finally {

        }
    }


    public static void iterateOverLessons(List<Lessons> lessonsList) throws NoSuchMethodError {
        for(Lessons e:lessonsList){
            System.out.println("ლექცია ჩავატარეთ:"+e.getLessonName());
            if(e.getLessonIndex() > 6){
                throw new LessonsException(e.getLessonName());
            }
        }
    }
}
