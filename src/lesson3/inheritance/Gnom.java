package lesson3.inheritance;

import lesson4.AbstractCharacter;
import lesson4.ICharacterWeapon;

public final class Gnom extends AbstractCharacter implements ICharacterWeapon {

    public Gnom() {
        super("GNOM", 1.40);
    }

    @Override
    public void weapon(String weaponName) {
        System.out.println("");
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
