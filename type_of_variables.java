import java.util.*;
class instance{
	private int a=0, c;
	static private int b=0;
	instance(){
		a++;
		b++;
		c=0;
	}
	instance(int c){
		this.c=c;
	}
	void display() {
		System.out.println("The value of non-static variable \"a\" is "+a+" where as the total number of instances or the value of static variable \"b\" is "+b+".");
		System.out.println("The value for this instance is "+c+".");
	}
}
public class type_of_variables {
public static void main(String args[]) {
	int a;
	Scanner sc=new Scanner(System.in);
	instance b=new instance();
	System.out.print("Enter any number:- ");
	a=sc.nextInt();
	b=new instance(a);
	b.display();
	instance c=new instance();
	System.out.print("Enter any number:- ");
	a=sc.nextInt();
	c=new instance(a);
	c.display();
	instance d=new instance();
	System.out.print("Enter any number:- ");
	a=sc.nextInt();
	d=new instance(a);
	d.display();
	sc.close();
}
}
