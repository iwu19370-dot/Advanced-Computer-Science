public class Mouse extends Animal {
    private double bodyLength;
    private String type;

    public void eat() {
        System.out.println("I am eating");
    }
    public void die() {
        System.out.println("The animal is dead.");
    }

    public Mouse (int age, double bodyLength, String type, int hunger) {
        if (age >= 3) {
            throw new IllegalArgumentException("The mouse should be dead at this age.");
        }
        if (bodyLength >= 7) {
            throw new IllegalArgumentException("The mouse can't be longer than 7in.");
        }
        setAge(age);
        setHunger(hunger);
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
        return "This mouse is " + getAge() + " years old, is " + bodyLength + " long, is a " + type + ", and being full is " + getHunger();
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
