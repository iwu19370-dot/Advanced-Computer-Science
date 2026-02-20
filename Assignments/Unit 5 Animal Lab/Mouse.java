public class Mouse extends Animal {
    private double bodyLength;
    private String type;

    public void eat() {
        System.out.println("I am eating");
    }

    public void die() {
        System.out.println("The animal is dead.");
    }

    public void feed() {
        System.out.println("Mouse eats food.");
    }

    public Mouse (int age, String name, boolean isAlive, double weight, int speed, double bodyLength, String type, double hunger) {
        if (age >= 3) {
            throw new IllegalArgumentException("The mouse should be dead at this age.");
        }
        if (bodyLength >= 7) {
            throw new IllegalArgumentException("The mouse can't be longer than 7in.");
        }
        setAge(age);
        setName(name);
        setAlive(isAlive);
        setWeight(weight);
        setSpeed(speed);
        this.hunger = hunger;
        this.type = type;
        this.bodyLength = bodyLength;
    }

    public int sleepTime(double age) {
        if (age <= 0.2) {
            return 16;
        } else if (age <= 1) {
            return 14;
        } else {
            return 12;
        }
    }

    public String toString() {
        return "This mouse is " + getAge() + " years old, is " + bodyLength + " long, is a " + type + ", and hunger level is " + hunger + ".";
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
