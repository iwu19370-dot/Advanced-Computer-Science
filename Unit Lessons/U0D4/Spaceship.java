// camelCase - a way to wrtie variable names, and it's a standard.
// Example : TheFoxJumpedOverTheLazyDog
// Keep the first letter lowercase if it's a variable names and methods
// Otherwise keep it capital for class names

// A class is just a blueprint for a new data type
// -> it's not the object itself, but rather a plan
public class Spaceship {

    // instance variables
    private String description;
    private int passengerCount;
    private double fuelLevel;
    private boolean shieldActive;

    // constructors
    public Spaceship(String inputDescription, int inputPassengerCount, double inputFuelLevel, boolean inputShieldActive) {
        description = inputDescription;
        passengerCount = inputPassengerCount;
        fuelLevel = inputFuelLevel;
        shieldActive = inputShieldActive;

    }

    // methods
    // getters (aka accessors)
    public String getDescription() {
        return description;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean getShieldActive() {
        return shieldActive;
    }
    // setters
    public void setDescription(String input) {
        description = input;
    }
    public void setPassengerCount(int input) {
        passengerCount = input;
    }
    public void setFuelLevel(double input) {
        fuelLevel = input;
    }
    public void setShieldActive(boolean input) {
        shieldActive = input;
    }

}