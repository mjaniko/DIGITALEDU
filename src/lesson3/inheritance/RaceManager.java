package lesson3.inheritance;

public class RaceManager {

    public static final double DEFAULT_HEIGHT = 4.00;
    public static final String DEFAULT_RACE = "HUMANOID";

    public static void main(String[] args) {


        Character character = new Character(DEFAULT_RACE, DEFAULT_HEIGHT);

        System.out.println("[პროგრამისტის ახალი გმირი]");


        System.out.println(character);

        printCharacter(character);

        // განათებულია
        Human humanKnowladgable = new Human();
        humanKnowladgable.setHasKnowladge(false);
        System.out.println("[განათლებული ადამიანები]");

        printCharacter(humanKnowladgable);


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

        //printCharacter(whiteElf.getRace(), whiteElf.getHeight(), whiteElf.getColor());

        Orc orc = new Orc();
        printCharacter(orc);

        //printCharacter(orc.getRace(), orc.getHeight(), orc.getColor());


        Gnom gnom = new Gnom();
        printCharacter(gnom);

        //printCharacter(gnom.getRace(), gnom.getHeight(), gnom.getColor());




    }


    static void printCharacter(Character character){
        System.out.println("რასა: "+character.getRace()+" სიმაღლე: "+character.getHeight()+" კანის ფერი: "+character.getColor());
        System.out.println();
    }

    static void printCharacter(String race, double height, String color){
        //System.out.println("რასა: "+race+" სიმაღლე: "+height+" კანის ფერი: "+color);
    }


}
