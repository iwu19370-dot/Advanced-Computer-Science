public class Square extends Rectangle {
    Square(double sideLength) {
        super(sideLength, sideLength);
    }

    Square() {
        super(4, 4);
    }

    public String toString() {
        return super.toString() + "\tThis is also a square";
    }
}
