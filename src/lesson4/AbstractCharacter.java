package lesson4;

import java.io.Serializable;

public abstract class AbstractCharacter implements ICharacterAction, Serializable {

    protected abstract boolean isSwiming();
    protected abstract boolean isRuning();

    private String race;
    private double height;
    private String color = ICharacterAction.DEFAULT_SKIN_COLOR;

    private boolean isSleeping = false;
    private boolean isHungry = false;
    private boolean isRelaxing = false;

    public AbstractCharacter(String race, double height) {
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

    /**
     * ვუცვლით მძინარების State-ს
     * @param sleeping
     */
    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    /**
     * ვუცვლით შიმშილის State-ს
     * @param hungry
     */
    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    /**
     * ვუცვლით დასვენების State-ს
     * @param relaxing
     */
    public void setRelaxing(boolean relaxing) {
        isRelaxing = relaxing;
    }

    @Override
    public void sleep() {
        if(isSleeping){
            System.out.println("ჩვენს გმირს ეძინება");
        } else {
            System.out.println("ჩვენი გმირი გამოძინებულია");
        }
    }

    @Override
    public void hungry() {
        if(isHungry){
            System.out.println("ჩვენს გმირს შია");
        } else {
            System.out.println("ჩვენი გმირი დანაყრებულია");
        }
    }

    @Override
    public void relax() {
        if(isRelaxing){
            System.out.println("ჩვენს გმირირი ისვენებს");
        } else {
            System.out.println("ჩვენი გმირი დასვენებულია");
        }
    }
}
