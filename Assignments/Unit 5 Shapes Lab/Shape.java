import java.awt.Graphics;
import java.awt.BasicStroke;
import java.awt.Color;

public abstract class Shape {

    protected int xCoord;
    protected int yCoord;

    
    public Shape(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    abstract public String[] stroke();

    abstract public int[] color();

    abstract public double getArea();

    abstract public void draw(Graphics g);



    public void setCoordinates(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }


    public String toString() {
        return "This is a shape.";
    }
}
