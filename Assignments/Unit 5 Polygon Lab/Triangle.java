public class Triangle extends Polygon {
    private double base;
    private double height;

    public double getArea() {
        return (base * height) / 2;
    }

    Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    Triangle() {
        super(3);
        new Triangle(3,4);
    }

    public String toString() {
        return super.toString() + "\tIt is a triangle with a base of " + base + " and height of " + height + ". Its area is " + getArea() + ".";
    }
}
