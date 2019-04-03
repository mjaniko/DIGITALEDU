package lesson3.inheritance;

import lesson4.AbstractCharacter;

public class DarkElf extends AbstractCharacter {

    public DarkElf() {
        super("DARK_ELF", 1.80);
        this.setColor("DARK");
    }

    public String getRaceIdentifier(){
        return this.getRace();
    }


    @Override
    public boolean isSwiming() {
        return false;
    }

    @Override
    public boolean isRuning() {
        return false;
    }
}
