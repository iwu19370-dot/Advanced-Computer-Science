public class Rectangle extends Polygon {
    protected double length;
    protected double width;

    public double getArea() {
        return length * width;
    }

    Rectangle(double width, double length) {
        super(4);
        this.length = length;
        this.width = width;
    }

    Rectangle() {
        super(4);
        new Rectangle(3,4);
    }

    public String toString() {
        return super.toString() + "\tIt is a rectangle with a length of " + length + " and width of " + width + ". Its area is " + getArea() + ".";
    }
}
