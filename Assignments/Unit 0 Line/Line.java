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
        a1 = a;
    }

    public void setB(int b1) {
        b1 = b;
    }

    public void setC(int c1) {
        c1 = c;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        if (a * x + b * y + c == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public double calculateSlope() {
        return (double) -(a / b);
    }

    public int x() {
        return (int) (Math.random() * 100);
    }

    public int y() {
        return (int) (Math.random() * 100);
    }

}
