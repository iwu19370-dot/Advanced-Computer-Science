public class Flamingo extends Animal{
    private double height;
    private String location;
    public void eat() {
        System.out.println("I am eating");
    }
    public void die() {
        System.out.println("The animal is dead.");
    }
    public Flamingo (int age, double height, String location, int hunger) {
        if (age >= 60) {
            throw new IllegalArgumentException("The flamingo should be dead at this age.");
        }
        if (height >= 5) {
            throw new IllegalArgumentException("The flamingo is way too tall. Max height is 5ft.");
        }
        setAge(age);
        setHunger(hunger);
        this.height = height;
        this.location = location;
    }

    public int sleepTime(int age) {
        if (age <= 6) {
            return 6;
        } else {
            return 12;
        }
    }

    public String isItFull(boolean isFull) {
        if (isFull == true) {
            return "it is full";
        } else {
            return "needs food";
        }
    }

    public String toString() {
        return "This flamingo is " + getAge() + " years old, is " + height + " feet tall, is located at " + location + ", and being hungry is" + getHunger();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
