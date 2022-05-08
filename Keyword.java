import java.util.*;
class Circle{
	private int x, y, radius;
	static int count=0;
	Circle(){
		x=y=radius=0;
		count++;
	}
	Circle(int x, int y, int radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	void display() {
		System.out.println("The number of instance variable(s) created are "+count+".");
		System.out.println("The centre of the circle lies between ("+x+","+y+").");
		System.out.println("The radius of the circle is "+radius+".");
	}
}
public class Keyword {
public static void main(String args[]) {
	int x, y, radius;
	Scanner sc=new Scanner(System.in);
	Circle a=new Circle();
	Circle b=new Circle();
	System.out.print("Enter the First Coordinate of the circle:- ");
	x=sc.nextInt();
	System.out.print("Enter the Second Coordinate of the circle:- ");
	y=sc.nextInt();
	System.out.print("Enter the radius of the circle:- ");
	radius=sc.nextInt();
	a=new Circle(x, y, radius);
	System.out.print("Enter the First Coordinate of the circle:- ");
	x=sc.nextInt();
	System.out.print("Enter the Second Coordinate of the circle:- ");
	y=sc.nextInt();
	System.out.print("Enter the radius of the circle:- ");
	radius=sc.nextInt();
	b=new Circle(x, y, radius);
	a.display();
	b.display();
	sc.close();
}
}
