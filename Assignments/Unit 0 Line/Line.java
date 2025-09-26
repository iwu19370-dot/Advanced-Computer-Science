public class Line {
    private int a;
    private int b;
    private int c;

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

    public void setA(int a1) {
        a = a1;
    }

    public void setB(int b1) {
        b = b1;
    }

    public void setC(int c1) {
        c = c1;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        if (a * x + b * y + c == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public double calculateSlope() {
        return (double) -a / b;
    }

    public String toString() {
        return " " + a + "x + " + b + "y + " + c + " = 0";
    }

    public boolean equals(Line other) {
        return a == other.a && b == other.b && c == other.c;
    }

}
