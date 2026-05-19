import java.lang.Math.*;
public class Flamingo extends Animal implements Flyable, Predator {
    public Flamingo () {
        super("Mingo", " Phoenicopteriformes", "Phoenicopteridae", "Phoenicopterus", "Phoenicopterus ruber", "Alkaline lakes");
    }

    // public int sleepTime(int age) {
    //     if (age <= 6) {
    //         return 6;
    //     } else {
    //         return 12;
    //     }
    // }

    // public String isItFull(boolean isFull) {
    //     if (isFull == true) {
    //         return "it is full";
    //     } else {
    //         return "needs food";
    //     }
    // }

   // returns a fact at the index, out of 5 total facts
    public String getFact(int index) {
        String[] listOfFacts = new String[] {"The color and brightness of the flamingos' feathers depend on what they eat", "A group of flamingoes is called a flamboyance", "Flamingos eat with their bill upside-down", "Flamingos can fly!", "Females will only lay one egg at a time"};
        return listOfFacts[index];
    }

    // returns a random fact (out of 5) of the animal
    public String getFact() {
        String[] listOfFacts = new String[] {"The color and brightness of the flamingos' feathers depend on what they eat", "A group of flamingoes is called a flamboyance", "Flamingos eat with their bill upside-down", "Flamingos can fly!", "Female flamingos will only lay one egg at a time"};
        return listOfFacts[(int) (Math.random()) * 4];
    }

    // prints out the sound the animal makes
    public void makeSound() {
        System.out.println("hawk");
    }

    // prints out the sound the animal makes when it eats
    public void eat() {
        System.out.println("kuk-kuk");
    }

    // prints out the sound the animal makes when it moves
    public void move() {
        System.out.println("hawk");
    }

    public String getSoundDescription() {
       return "Flamingos have a loud, medium-pitched hawk.";
    }

    public String getEatDescription() {
        return "Flamingos bend over to lower their heads into the water with their beaks upside down to access food in the mud. ";
    }

    public String getMoveDescription() {
        return "Flamingos move by stepping silently and smoothly through the water, performing synchronized movements.";
    }

    // returns the typical flight speed of the animal in km/h
    public double getFlightSpeed() {
        return 57.0;
    }

    // returns the maximum altitude the animal can reach in meters
    public double getMaxAltitude() {
        return 6000.0;
    }

    // prints out how the animal takes off
    public void takeOff() {
        System.out.println("Flamingos take off by performing a running start across water or land to gain momentum before their wings support their weight.");
    }

    // prints out how the animal flies
    public void fly() {
        System.out.println("Flamingos fly with long necks stratched foward, legs behind, poweful wingbeats, and V-shaped formations.");
    }

    // prints out how the animal lands
    public void land() {
        System.out.println("Flamingos use their long legs to break their momentum and glide towards the water's surface. They may also flap their wings in reverse to slow down before landing.");
    }

    // returns the primary type of prey this predator hunts
    public String getPrimaryPrey() {
        return "brine shrimp, algae";
    }

    // returns the typical size of prey in kilograms
    public double getAveragePreyMass() {
        return 3.0;
    }

    // prints out how the animal stalks its prey
    public void stalkPrey() {
        System.out.println("Flamingos stalk their prey by using their specialized feet and beaks to create swirling vortices in the water.");
    }

    // prints out how the animal attacks its prey
    public void attackPrey() {
        System.out.println("They use their water tornadoes.");
    }

    // prints out how the animal eats its prey
    public void eatPrey() {
        System.out.println("Flamingos have filter feeders to filter food from the water to capture their prey.");
    }

}
   