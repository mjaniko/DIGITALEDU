package lesson3.inheritance;

public class Character {

    private String race;
    private double height;
    private String color = "WHITE";

    public Character(String race, double height) {
        this.race = race;
        this.height = height;
    }

    public String getRace() {
        return race;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }
}
