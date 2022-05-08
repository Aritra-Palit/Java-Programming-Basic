import geometry.*;
public class TestShape {
public static void main(String args[]) {
	Rectangles a=new Rectangles(25,26);
	Circles b=new Circles(25);
	System.out.println("The area of the rectangle is "+a.area()+".");
	System.out.println("The perimeter of the rectangle is "+a.perimeter()+".");
	System.out.println("The area of the circle is "+b.area()+".");
	System.out.println("The perimeter of the circle is "+b.perimeter()+".");
}
}