public class SpaceTester {
    public static void main(String[] args) {
        // 1. instantiate (to make an instance of something) a spaceship object
        Spaceship ship = new Spaceship("red", 30, 90.0, true);

        // the new keyword creates a new instance of the class (aka an object)

        // 2. invoke a method
        String shipDescription =  ship.getDescription();
        int shipPassengerCount = ship.getPassengerCount();
        double shipFuelLevel = ship.getFuelLevel();
        boolean shipShieldActive = ship.getShieldActive();

    
        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);
        System.out.println(shipFuelLevel);


        ship.setDescription("blue");
        ship.setPassengerCount(50);
        ship.setFuelLevel(60.0);
        ship.setShieldActive(true);

        System.out.println(ship.getDescription());
        System.out.println(ship.getPassengerCount());
        System.out.println(ship.getFuelLevel());
        System.out.println(ship.getShieldActive());

        // 3. manipulate the data
    }
}
