public class Point {
    // instance variables
    private double x;
    private double y;

    // constructors
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // getters
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    // setters
    public void setX(double newX) {
    x = newX;
    }

    public void setY(double newY){
        y = newY;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
