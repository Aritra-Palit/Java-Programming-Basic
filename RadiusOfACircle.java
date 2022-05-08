import java.util.*;
public class RadiusOfACircle {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	double r,b,c;
	System.out.println("Enter the radius:- ");
	r=sc.nextDouble();
	b=(22/7.0*Math.pow(r,2));
	c=(2*22/7.0*r);
	System.out.println("The area of the circle "+b);
	System.out.print("The circumference of the circle "+c);
	sc.close();
}
}
