package lesson3.inheritance;

import lesson4.AbstractCharacter;
import lesson4.ICharacterWeapon;

public final class Elf extends AbstractCharacter implements ICharacterWeapon {

    public Elf() {
        super("ELF", 1.80);
        setColor("WHITE");
    }

    @Override
    public void weapon(String weaponName){
        System.out.println("ხელში დავაჭერინე: "+weaponName);
    }


    @Override
    protected boolean isSwiming() {
        return false;
    }

    @Override
    protected boolean isRuning() {
        return false;
    }
}
