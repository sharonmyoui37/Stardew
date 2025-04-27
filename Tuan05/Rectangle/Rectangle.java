package Rectangle;

public class Rectangle {
    private float length;
    private float width;
    private String color;

    public Rectangle(float length, float width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getArea() {
        return length * width;
    }

    public float getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Square[" + 
            "Rectangle[" + 
            "Length=" + length + 
            "; Width=" + width + 
            "; Color=" + color +
            "; Area=" + getArea() + 
            "; Perimeter=" + getPerimeter() + 
            "]]";
    }
}
