public abstract class GeometricObject {
    private String color;
    private boolean isFilled;

    protected GeometricObject() {
        this("White", true);
    }

    protected GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
