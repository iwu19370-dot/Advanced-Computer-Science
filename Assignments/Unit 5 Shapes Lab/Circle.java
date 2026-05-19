import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape {

    private int radius;

    public Circle(int xCoord, int yCoord, int radius) {
        super(xCoord, yCoord);
        this.radius = radius;
    }

    public Circle(int radius) {
        super(0, 0);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void draw(Graphics g) {
        // Initialize a Graphics 2D object
        // Set the color of the circle
        // Draw the circle using the fillOval method
        Graphics2D g2D = (Graphics2D) g; //initializes a 2D graphics component
        
        g2D.setPaint(Color.orange);
        g2D.setStroke(new BasicStroke(7)); // changes the line stroke width to 5
        g.drawOval(xCoord, yCoord, radius, radius);

        g2D.setPaint(Color.blue); // sets the paint color to Pink
        g.fillOval(xCoord, yCoord, radius, radius);


        // set the color of the circle
        // change the stroke width
        // draw the circle using the drawOval method

    }

    public String toString() {
        return super.toString() + "It is a circle with a radius of " + radius + ". It's area is " + getArea() + ".";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}