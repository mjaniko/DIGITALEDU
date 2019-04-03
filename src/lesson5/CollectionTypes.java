package lesson5;

import lesson3.inheritance.*;
import lesson4.AbstractCharacter;

import java.util.*;

public class CollectionTypes {


    /**
     * ArrayList იმპლემენტაცია
     */
    public static void perosonsArrayList(){
        List<String> personsList = new ArrayList<>(300);

        personsList.add("მიხეილ"); // 0
        personsList.add("ნიკა"); // 1
        personsList.add("ნოდარი"); // 2
        personsList.add("გელა"); // 3
        personsList.add("გიორგი"); // 4
        personsList.add("ჯონდო"); // 5
        personsList.add("სალომე"); // 6
        personsList.add("ანი"); // 7
        personsList.add("ნინი"); // 8
        personsList.add("რინა"); // 9
        personsList.add("ნიკუშა"); // 10
        personsList.add("რამაზი"); // 11
        personsList.add("ჯემალი"); // 12
        personsList.add("კონსტატნტინე"); // 13
        personsList.add("ზინა"); // 14

        List<String> secondPersonList = new ArrayList<>(4);
        secondPersonList.add("ლევანი");
        secondPersonList.add("ლექსო");
        secondPersonList.add("ალეკო");
        secondPersonList.add("ალექსანდრა");


        // არის თუ არა ცარიელი
        if(!personsList.isEmpty()){
            System.out.println("ჩვენი List არ არის ცარიელი, მისი ზომაა:"+personsList.size());
        }

        personsList.remove("მიხეილ");


        for(String element : personsList){
            System.out.println(element);
        }

        personsList.addAll(secondPersonList);


        for(String element : personsList){
            System.out.println(element);
        }

        personsList.clear();

        // არის თუ არა ცარიელი
        if(personsList.isEmpty()){
            System.out.println("ახლა უკვე ცარიელია ზომა:"+personsList.size());
        }
    }

    public static void linkedListArray(){
        LinkedList<AbstractCharacter> linkedList = new LinkedList<>();

        linkedList.add(new Orc());
        linkedList.add(new Human());
        linkedList.add(new Elf());
        linkedList.add(new DarkElf());
        linkedList.add(new Gnom());

        linkedList.add(3, new Orc());
    }

    public static void exampleRightLinkedList(){

        CustomLinkedList<String> obj = new CustomLinkedList<>();

        obj.setItem("ორკი");


        CustomLinkedList<String> obj1 = new CustomLinkedList<>();


        obj.setNext(obj1);

        obj1.setItem("ადამიანი");


        CustomLinkedList<String> obj2 = new CustomLinkedList<>();

        obj2.setItem("ელფი");

        obj1.setNext(obj2);

    }

    public static void main(String[] args) {

        Map<Integer, Integer> person_grades = new HashMap<>();


        person_grades.put(9, null);
        person_grades.put(9, null);
        person_grades.put(1, 20);
        person_grades.put(5, 20);
        person_grades.put(120, 10);
        person_grades.put(7, 30);


        System.out.println("END");


        Set<String> persons = new HashSet<>();
        persons.add("მიხეილ");
        persons.add("ნიკა");
        persons.add("ვლადიმერი");
        persons.add("მიხეილი");
        persons.add("მიხეილი");
        persons.add("მიხეილი");
        persons.add("მიხეილი");

        System.out.println(persons.size());
    }
}



