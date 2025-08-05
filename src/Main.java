public class Main {
    public static void main(String[] args) {
        GeometricObject object = new Rectangle();
        System.out.println(object);

        Rectangle rect = new Rectangle(5, 5);

        rect.displayInfo();
        ((Rectangle)object).displayInfo();

        if(rect instanceof GeometricObject)
            System.out.println("object is an instance of Geometric Object.");
        if(rect instanceof Rectangle)
            System.out.println("object is an instance of Rectangle.");
    }
}