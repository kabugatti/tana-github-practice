package abstraction;

public class Rectangle extends GraphicObject{

    void draw() {
        System.out.println("Drawing Rectangle at: " + x + ", " + y);
    }

    void resize() {
        System.out.println("Resizing Rectangle");
    }
}