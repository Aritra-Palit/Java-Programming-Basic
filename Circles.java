package geometry;

public class Circles {
float radius;
final float PI=3.145f;
public Circles(){
	radius=0;
}
public Circles(int a) {
	radius=a;
}
public float area() {
	return PI*radius*radius;
}
public float perimeter() {
	return 2*PI*radius;
}
}