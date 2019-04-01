package lesson3.inheritance;

import lesson4.AbstractCharacter;

public class RaceManager {

    public static final double DEFAULT_HEIGHT = 4.00;
    public static final String DEFAULT_RACE = "HUMANOID";

    public static void main(String[] args) {

        // განათებულია
        Human humanKnowladgable = new Human();
        humanKnowladgable.setHungry(false);
        humanKnowladgable.setSleeping(true); // ესეიგი ეძინება
        humanKnowladgable.setHasKnowladge(false);
        System.out.println("[განათლებული ადამიანები]");


        printCharacter(humanKnowladgable);
        humanKnowladgable.hungry();
        humanKnowladgable.sleep();


        // ეს გაუნათლებელია
        Human humanNonKnowladgable = new Human();
        humanNonKnowladgable.setHasKnowladge(false);

        System.out.println("[გაუნათლებელი ადამიანები]");
        printCharacter(humanNonKnowladgable);


        //printCharacter(human.getRace(), human.getHeight(), human.getColor());


        DarkElf darkElf = new DarkElf();
        printCharacter(darkElf);


        //printCharacter(darkElf.getRace(), darkElf.getHeight(), darkElf.getColor());


        Elf whiteElf = new Elf();
        printCharacter(whiteElf);

        whiteElf.weapon("მშვილდი");

        Elf whiteElfWithSword = new Elf();
        printCharacter(whiteElfWithSword);
        whiteElfWithSword.weapon("გრძელ ხმალს");

        //printCharacter(whiteElf.getRace(), whiteElf.getHeight(), whiteElf.getColor());

        Orc orc = new Orc();
        printCharacter(orc);
        orc.relax();

        //printCharacter(orc.getRace(), orc.getHeight(), orc.getColor());


        Gnom gnom = new Gnom();
        printCharacter(gnom);


        //printCharacter(gnom.getRace(), gnom.getHeight(), gnom.getColor());




    }


    static void printCharacter(AbstractCharacter character){
        System.out.println();
        System.out.println("რასა: "+character.getRace()+" სიმაღლე: "+character.getHeight()+" კანის ფერი: "+character.getColor());
    }

    static void printCharacter(String race, double height, String color){
        //System.out.println("რასა: "+race+" სიმაღლე: "+height+" კანის ფერი: "+color);
    }


}
