package lesson4;

public class Triangle implements IShape {

    private String name;

    public Triangle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("ეს ფიგურა არის => "+this.name);
    }

}
