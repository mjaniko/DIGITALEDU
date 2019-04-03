package lesson5;

public enum ECharacterRace {
    NONE,
    DARK_ELF("შავი ელფი"),
    WHITE_ELF("თეთრი ელფი"),
    GNOM("გნომი"),
    HUMAN("ადამიანი"),
    MUTANT_DARK_ELF("მუტანტი შავი ელფი"),
    ORC("ორკი"),
    ORC_RED("წითელი ორკი");

    private String name;

    ECharacterRace(){

    }

    ECharacterRace(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static ECharacterRace findByName(String name){
        for(ECharacterRace element: values()){
            if(element.getName() != null && element.getName().equals(name)){
                return element;
            }
        }
        return ECharacterRace.NONE;
    }





}
