package lesson5;

import lesson3.inheritance.Human;

public class SerializationManager {

    public static void main(String[] args) {
        // განათებულია
        Human humanKnowladgable = new Human();
        humanKnowladgable.setHungry(false);
        humanKnowladgable.setSleeping(true); // ესეიგი ეძინება
        humanKnowladgable.setHasKnowladge(false);
        System.out.println("[განათლებული ადამიანები]");
        System.out.println(humanKnowladgable);


        System.out.println(ECharacterRace.NONE.getName());
        System.out.println(ECharacterRace.DARK_ELF.getName());

        for (ECharacterRace e : ECharacterRace.values()) {
            System.out.println(e.getName());
        }


        System.out.println(ECharacterRace.findByName("შავი ელფი"));


        System.out.println(ECharacterRace.valueOf("DARK_ELF"));

    }



}
