public class Rectangle extends GeometricObject {
    private double length;
    private double width;

    protected Rectangle() {
        this(10, 10);
    }
    protected Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    protected Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length + width);
    }

    public void displayInfo() {
        System.out.println("I am a rectangle.");
    }

    @Override
    public String toString() {
        return  "Length = " + length + '\n' +
                "Width = " + width + '\n' +
                "Area = " + getArea() + '\n' +
                "Perimeter = " + getPerimeter() + '\n';
    }
}
