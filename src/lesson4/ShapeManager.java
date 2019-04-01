package lesson4;

public class ShapeManager {


    public static void main(String[] args) {
        IShape[] shape_array = {
            new Rectangle("ოთკუთხედი"),
            new Triangle("სამკუთხედი"),
            new Square("კვადრატი")
        };

        for(IShape shape: shape_array){
            shape.draw();
        }

    }
}
