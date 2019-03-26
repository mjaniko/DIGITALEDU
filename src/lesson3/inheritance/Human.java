package lesson3.inheritance;

public final class Human extends Character {

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
}
