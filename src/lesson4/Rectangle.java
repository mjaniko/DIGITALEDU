package lesson4;

public class Rectangle implements IShape{

    private String name;

    public Rectangle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("ეს ფიგურა არის => "+this.name);
    }
}
