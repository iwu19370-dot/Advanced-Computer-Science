public class LineTester {
    public static void main(String[] args) {
        //Testing Point
        Point p1 = new Point(2, 7);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(11, 18);
        Point p4 = new Point(4, 13);
        Line pointLine = new Line(p1, p2);
        Line pointLine2 = new Line(p3, p4);
        System.out.println(pointLine.calculateSlope());
        System.out.println(pointLine.calculateSlopeFromPoints());
        System.out.println(pointLine.calculateSlopeFromPoints() == pointLine.calculateSlope());
        System.out.println("Using calculateSlope(): " + pointLine.calculateSlope());
        System.out.println("Is p1 on the line? " + pointLine.isCoordinateOnLine(p1));
        System.out.println("Using calculateSlope(): " + pointLine.calculateSlope());
        System.out.println("Is p2 on the line? " + pointLine.isCoordinateOnLine(p2));
        System.out.println("Using calculateSlope(): " + pointLine2.calculateSlope());
        System.out.println("Is p3 on the line? " + pointLine.isCoordinateOnLine(p3));
        System.out.println("Using calculateSlope(): " + pointLine2.calculateSlope());
        System.out.println("Is p4 on the line? " + pointLine.isCoordinateOnLine(p4));

    }
}
