package Rectangle;

public class Square extends Rectangle {
    private float size;

    public Square(float length, float width, String color, float size) {
        super(length, width, color);
        this.size = size;
    }

    public Square(String color, float size) {
        super(size, size, color);
        this.size = size;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getArea() {
        return size * size;
    }

    public float getPerimeter() {
        return 4 * size;
    }

    public String toString() {
        return "Square[" + 
                "Rectangle[" + 
                "Length=" + getLength() +
                "; Width=" + getWidth() + 
                "; Color=" + getColor() + 
                "; Area=" + getArea() + 
                "; Perimeter=" + getPerimeter() + 
                "]]";
    }
}
