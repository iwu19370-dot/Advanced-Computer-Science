public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 9);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateDiagonal());
        System.out.println(rectangle.toString());

        rectangle.setNewLength(4);
        rectangle.setNewWidth(5);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateDiagonal());
        System.out.println(rectangle.toString());

        Rectangle rectangle2 = new Rectangle(5, 9);
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());
        System.out.println(rectangle2.calculateDiagonal());
        System.out.println(rectangle.toString());

        System.out.println(rectangle.equals(rectangle2));

        Point a = new Point(3, 4);
        Point b = new Point(3, 7);
        Point c = new Point(5, 4);
        Point d = new Point(5, 7);


        


    }

}
