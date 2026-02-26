package interfaces;

public class MountainBike implements Bicycle {
    private int seatHeight;
    private int gear;
    private int speed;

    public MountainBike(int gear, int speed, int startHeight) {
        this.gear = gear;
        this.speed = speed;
        this.seatHeight = startHeight;
    }

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }

    public int getSeatHeight() {
        return seatHeight;
    }
}