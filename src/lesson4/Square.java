package lesson4;

public class Square implements IShape{

    private String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("ეს ფიგურა არის => "+this.name);
    }
}
