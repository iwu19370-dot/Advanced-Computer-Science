import java.lang.Math.*;
public class Mice extends Animal implements Pettable, Swimmable {
    public Mice () {
        super("Micey", "Rodentia", "Muridae", "Mus", "Mus musculus", "Grasslands");
    }

    // public int sleepTime(double age) {
    //     if (age <= 0.2) {
    //         return 16;
    //     } else if (age <= 1) {
    //         return 14;
    //     } else {
    //         return 12;
    //     }
    // }

    // returns a fact at the index, out of 5 total facts
    public String getFact(int index) {
        String[] listOfFacts = new String[] {"Mice have good hygiene and are orderly", "Mice are very in turn with their senses", "Mice can hear & adapt to ultrasonic sound", "Mice eat their own feces", "Mice never stop growing" };
        return listOfFacts[index];
    }

    // returns a random fact (out of 5) of the animal
    public String getFact() {
        String[] listOfFacts = new String[] {"Mice have good hygiene and are orderly", "Mice are very in turn with their senses", "Mice can hear & adapt to ultrasonic sound", "Mice eat their own feces", "Mice never stop growing" };
        return listOfFacts[(int) (Math.random() * 4)];
    }

    // Basic Behaviors - BE CREATIVE

    // prints out the sound the animal makes
    public void makeSound() {
        System.out.println("squeak");
    }

    // prints out the sound the animal makes when it eats
    public void eat() {
        System.out.println("squeak");
    }

    // prints out the sound the animal makes when it moves
    public void move() {
        System.out.println("Screech");
    }

    // descriptive text versions of the basic behaviors, for displaying in a GUI
    public String getSoundDescription() {
       return "Mice make a high-pitched squeak.";
    }

    public String getEatDescription() {
        return "Mice eat by nibbling on small portions of food.";
    }

    public String getMoveDescription() {
        return "Mice move by squeezing through small gaps and cracks.";
    }


    // returns how friendly the animal is on a scale from 1 to 10
    public int getFriendlinessLevel() {
        return 8;
    }

    // returns how energetic the animal is on a scale from 1 to 10
    public int getEnergyLevel() {
        return 8;
    }

    // prints out how the animal reacts when it sees a person
    public void greetHuman() {
        System.out.println("Mice will try to avoid humans and are sometimes curious too.");
    }

    // prints out how the animal reacts when it is being petted
    public void bePetted() {
        System.out.println("Some will be cautious and don't like to be petted, but some may enjoy being stroked gently around the back of their head.");
    }

    // prints out how the animal plays with a human
    public void playWithHuman() {
        System.out.println("Some might be scared and run away, while some sleep in their owner's pockets or let humans feed them by hand.");
    }

    // returns the typical swimming speed of the animal in km/h
    public double getSwimSpeed() {
        return 3.2;
    }

    // returns the typical depth the animal swims at in meters
    public double getPreferredDepth() {
        return 1.6;
    }

    // Basic Behaviors - BE CREATIVE

    // prints out how the animal enters the water
    public void enterWater() {
        System.out.println("They enter the water through sewer systems connected to indoors drains.");
    }

    // prints out how the animal swims
    public void swim() {
        System.out.println("They swim in a paddling motion.");
    }

    // prints out how the animal leaves the water
    public void exitWater() {
        System.out.println("They just climb out of the water normally when they are searching for food or shelter.");
    }
}