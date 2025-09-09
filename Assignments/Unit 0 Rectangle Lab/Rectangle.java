public class Rectangle{
    // instance variables
    private int length;
    private int width;

    // constructors
    public Rectangle(int Length, int Width) {
        length = Length;
        width = Width;
        area = length * width;
    }
   
    // methods
    // getters
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public int calculateArea() {
        return length * width;
    }
    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    // setters
    public void setNewLength(int newLength){
        length = newLength;
    }
    public void setNewWidth(int newWidth) {
        width = newWidth;
    }
    }
    public String toString() {
        return "This rectangle has a length of " + length +" and a width of " + width + ". Its area is " + calculateArea() + ".";
    }
    public boolean equals(Rectangle other){
        return length == other.length && width == other.width && calculateArea() == other.calculateArea();
    }

}