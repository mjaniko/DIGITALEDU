package lesson3.inheritance;

public  class DarkElf extends Character {

    public DarkElf() {
        super("ELF", 1.80);
        this.setColor("DARK");
    }

    public String getRaceIdentifier(){
        return this.getRace();
    }



}
