package lesson3.inheritance;

import lesson4.AbstractCharacter;

public final class Orc extends AbstractCharacter {

    public Orc() {
        super("ORC", 2.10);
        setColor("GREEN");
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
