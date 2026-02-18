public abstract class Animal {
    // commom instance variable;
    private double age;
    private int hunger;

     public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    
    // common abstract methods
    public abstract void eat();
    public abstract void die();
}
