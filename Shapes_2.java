import java.util.*;
class Point{
	int x, y;
	
	Point(){
		x=y=0;
	}
	void origin(int a, int b){
		x=a;
		y=b;
	}
	
	void showPoint() {
		System.out.println("The Point is ("+x+","+y+").");
	}
}
class Rectangle{
	int x, y, area, perimeter;
	Point p1=new Point();
	Rectangle(){
		x=y=0;
	}
	void values(int a, int b) {
		x=a;
		y=b;
	}

	void move(int a, int b) {
		x+=a;
		y+=b;
		p1.origin(x,y);
	}
	void area(int a, int b){
		area=a*b;
	}
	void perimeter(int a, int b){
		perimeter=2*(a+b);
	}
	void showPoint() {
		p1.showPoint();
	}
	void answer() {
		System.out.println("The area of the rectangle is "+area+".");
		System.out.println("The perimeter of the rectangle is "+perimeter+".");
	}
}
public class Shapes_2 {
	public static void main(String args[]) {
		int length, width, point1, point2, point3, point4;
		char ans;
		Scanner sc=new Scanner(System.in);
		Point p1=new Point();
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		System.out.print("Enter the first coordinates:- ");
		point1=sc.nextInt();
		System.out.print("Enter the second coordinates:- ");
		point2=sc.nextInt();
		p1.origin(point1,point2);
		System.out.print("Enter the length of the rectangle:- ");
		length=sc.nextInt();
		System.out.print("Enter the width of the rectangle:- ");
		width=sc.nextInt();
		r2.area(length, width);
		r2.perimeter(length, width);
		System.out.print("Do you want to change the coordinates:-\nY or N:- ");
		ans=sc.next().charAt(0);
		if(ans=='Y' || ans=='y') {
			System.out.print("Enter the first coordinates:- ");
			point3=sc.nextInt();
			System.out.print("Enter the second coordinates:- ");
			point4=sc.nextInt();
			r1.values(point1,point2);
			r1.move(point3,point4);
			r1.showPoint();}
		else {
		p1.showPoint();
		}
		r2.answer();
		sc.close();
	}

}