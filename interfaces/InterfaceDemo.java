package interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10, 1);

        System.out.println("Bike speed is: " + mountainBike.getSpeed());
        System.out.println("Gear is: " + mountainBike.getGear());
        System.out.println("Seat height is: " + mountainBike.getSeatHeight());

        mountainBike.applyBrake(1);

        System.out.println("Bike speed after applying brake: " + mountainBike.getSpeed());

        mountainBike.speedUp(10);
        System.out.println("Bike speed after increment: " + mountainBike.getSpeed());
        
    }
}