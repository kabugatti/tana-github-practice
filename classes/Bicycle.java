public class Bicycle {
    protected int gear;
    protected int speed;

    public Bicycle(int startGear, int startSpeed) {
        this.gear = startGear;
        this.speed = startSpeed;
    }

    void setGear(int gear) {
        this.gear = gear;
    }

    void applyBrake(int decrement) {
        speed -= decrement;
    }

    void speedUp(int increment) {
        speed += increment;
    }   
}