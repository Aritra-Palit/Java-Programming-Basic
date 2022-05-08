package geometry;

public class Rectangles {
	int length, breadth;
	public Rectangles(){
		length=0;
		breadth=0;
	}
	public Rectangles(int a, int b) {
		length=a;
		breadth=b;
	}
	public float area() {
		return length*breadth;
	}
	public float perimeter() {
		return 2*(length+breadth);
	}
}
