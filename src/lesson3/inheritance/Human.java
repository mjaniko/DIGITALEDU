package lesson3.inheritance;

import lesson4.AbstractCharacter;

public final class Human extends AbstractCharacter {

    // გაუნათლებელი
    private boolean hasKnowladge = false;

    public Human() {
        super("HUMAN", 1.80);
    }

    public boolean isHasKnowladge() {
        return hasKnowladge;
    }

    public void setHasKnowladge(boolean hasKnowladge) {
        this.hasKnowladge = hasKnowladge;
    }

    @Override
    public boolean isSwiming() {
        return false;
    }

    @Override
    public boolean isRuning() {
        return false;
    }


    @Override
    public String toString() {
       return "{race:"+this.getRace()+", height:"+this.getHeight()+"}";
    }
}
