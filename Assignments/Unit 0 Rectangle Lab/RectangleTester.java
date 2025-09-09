public class RectangleTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,9);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Rectangle rectangle2 = new Rectangle(5,9);
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());

        System.out.println(rectangle.toString());
        System.out.println(rectangle2.toString());

        System.out.println(rectangle.equals(rectangle2));

        int length = rectangle.getLength();
        int width = rectangle.getWidth();

        


    }

}
