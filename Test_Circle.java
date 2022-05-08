import geometry.*;
public class Test_Circle {
public static void main(String args[]) {
	Rectangles r=new Rectangles(25,26);
	Circles c=new Circles(25);
	System.out.println("The area of the rectangle is "+r.area()+".");
	System.out.println("The perimeter of the rectangle is "+r.perimeter()+".");
	System.out.println("The area of the circle is "+c.area()+".");
	System.out.println("The perimeter of the circle is "+c.perimeter()+".");
}
}
