package Shape;

public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        setWidth(side);
    }

    public void setLength(double side) {
        setLength(side);
    }

    public String toString() {
        return "Square[" + 
                "Rectangle[" + 
                "Shape[" + 
                "color=" + getColor() + 
                ", filled=" + isFilled() + 
                "], width=" + getWidth() + 
                ", length=" + getLength() + 
                "]]";
    }
}
