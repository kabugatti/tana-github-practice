class InheritanceDemo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10, 1);
        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println("Bike Speed is: " + mountainBike.speed);
        System.out.println("Seat height is: " + mountainBike.seatHeight);
        mountainBike.applyBrake(1);
        System.out.println("Bike Speed after applying brake is: " + mountainBike.speed);
    }
}