import java.util.*;
class Person{
	private String name;
	private int age, salary;
	static int a=0;
	Person(){
		name=null;
		age=salary=0;
		a++;
	}
	Person(String a, int b, int c){
		name=a;
		age=b;
		salary=c;
	}
	void display() {
		System.out.println("The total number of instance variables are "+a+".");
		System.out.println("The name of the person is "+name+".");
		System.out.println("The age of the person is "+age+".");
		System.out.println("The salary of the person is "+salary+".");
	}
}
public class Details {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String name=null;
	int age=0, salary=0;
	Person a=new Person();
	Person b=new Person();
	System.out.print("Enter the name:- ");
	name=sc.next();
	System.out.print("Enter the age:- ");
	age=sc.nextInt();
	System.out.print("Enter the salary:- ");
	salary=sc.nextInt();
	a=new Person(name, age, salary);
	System.out.print("Enter the name:- ");
	name=sc.next();
	System.out.print("Enter the age:- ");
	age=sc.nextInt();
	System.out.print("Enter the salary:- ");
	salary=sc.nextInt();
	b=new Person(name, age, salary);
	a.display();
	b.display();
	sc.close();
}
}
