public class Line {
    private int a;
    private int b;
    private int c;
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        // instance variables a, b, and c
        // a = - (y2 - y1)
        this.a = -(p2.getY() - p1.getY()); 

        // b = x2 - x1
        this.b = p2.getX() - p1.getX(); 

        // c = - (a * x1 + b * y1)
        this.c = -(this.a * p1.getX() + p1.getY() * this.b); 
    }

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double slope = calculateSlope();

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setA(int a1) {
        a = a1;
    }

    public void setB(int b1) {
        b = b1;
    }

    public void setC(int c1) {
        c = c1;
    }

    public void setP1(Point pr) {
        p1 = pr;
    }

    public void setP2(Point px) {
        p1 = px;
    }

    public boolean isCoordinateOnLine(Point p) {
        if (a * p.getX() + b * p.getY() + c == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public double calculateSlope() {
        return (double) -a / b;
    }

    public double calculateSlopeFromPoints() {
        return (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
    }

    public String toString() {
        return " " + a + "x + " + b + "y + " + c + " = 0";
    }

    public boolean equals(Line other) {
        return a == other.a && b == other.b && c == other.c;
    }

    public String generatePointSlopeFormula() {
        return "(y - " + p1.getY() + ") = " + calculateSlope() + "(x - " + p1.getX() + ")";
    }

}
