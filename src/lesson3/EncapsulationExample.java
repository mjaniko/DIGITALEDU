package lesson3;

import lesson3.encapsulation.LessonClases;

public class EncapsulationExample {


    public static void main(String[] args) {

        // შევქმენით ობიექტი
        LessonClases lesonOne = new LessonClases();
        lesonOne.setName("გაკვეთილი 3");

        LessonClases lesonTwo = new LessonClases("გაკვეთილი 2");
        LessonClases lesonThree = new LessonClases("გაკვეთილი 3");

        System.out.println("LessonOne: "+  lesonOne.getName()+" Duration:"+lesonOne.getDuration());


        System.out.println("LessonOne: "+  lesonOne.getName());

        System.out.println("lesonTwo: "+  lesonTwo.getName());
        System.out.println("lesonThree: "+  lesonThree.getName());
    }
}
