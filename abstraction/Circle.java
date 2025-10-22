package abstraction;

public class Circle extends GraphicObject {
    void draw() {
        System.out.println("Drawing Circle at: " + x + ", " + y);
    }

    void resize() {
        System.out.println("Resizing Circle");
    }
}