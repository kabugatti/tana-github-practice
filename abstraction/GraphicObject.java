package abstraction;

public abstract class GraphicObject {
    int x;
    int y;

    void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    abstract void draw();
    abstract void resize();
}