abstract class Shapesd {
    public abstract double area();
    public abstract double perimeter();
}
class Rectanglesd extends Shapesd {
    private final double width, length; //sides

    public Rectanglesd() {
        this(1,1);
    }
    public Rectanglesd(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        // A = w * l
        return width * length;
    }

    @Override
    public double perimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }

}
class Circlesd extends Shapesd {
    private final double radius;
    final double pi = Math.PI;

    public Circlesd() {
        this(1);
    }   
    public Circlesd(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        // P = 2πr
        return 2 * pi * radius;
    }
}

public class Example {
	public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        Shapesd rectangle = new Rectanglesd(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        // Circle test
        double radius = 5;
        Shapesd circle = new Circlesd(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.area()
            + "\nResulting Perimeter: " + circle.perimeter() + "\n");

       
    }
}
