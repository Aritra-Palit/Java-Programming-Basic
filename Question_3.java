import java.util.*;
class shape{
	float area=0, perimeter=0;
	void rectangle(float a, float b) {
		area=a*b;
		perimeter=2*(a+b);
	}
	void circle(float a) {
		area=(float) (3.14*a*a);
		perimeter=(float) (2*3.14*a);
	}
	void rec_answer() {
		System.out.println("The Perimeter of the Rectangle is:- "+perimeter);
		System.out.println("The Area of the Rectangle is:- "+area);
	}
	void cir_answer() {
		System.out.println("The Perimeter of the Circle is:- "+perimeter);
		System.out.println("The Area of the Circle is:- "+area);
	}
}
public class Question_3 {
public static void main(String args[]) {
	float a, b;
	int c=0;
	Scanner sc=new Scanner(System.in);
	shape s=new shape();
	do {
	System.out.print("Enter 1 to work with rectangle.\nEnter 2 to work with Circle\nEnter 3 to exit.\nYour Answer:- ");
	c=sc.nextInt();
	switch(c) {
	case 1:{
		System.out.print("Enter the length of the rectangle:- ");
		a=sc.nextFloat();
		System.out.print("Enter the breadth of the rectangle:- ");
		b=sc.nextFloat();
		s.rectangle(a, b);
		s.rec_answer();
		break;
	}case 2:{
		System.out.print("Enter the radius of the circle:- ");
		a=sc.nextFloat();
		s.circle(a);
		s.rec_answer();
		break;
	}
	case 3:{
		System.out.println("Program Terminated!!!");
		break;
	}
	default:{
		System.out.print("Wrong Input");
	}
	}
	}while(c!=3);
	sc.close();
}
}
