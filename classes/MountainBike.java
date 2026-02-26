public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int startGear, int startSpeed, int seatHeight) {
        super(startGear, startSpeed);
        this.seatHeight = seatHeight;
    }

    void setSeatHeight(int newValue) {
        this.seatHeight = newValue;
    }
}