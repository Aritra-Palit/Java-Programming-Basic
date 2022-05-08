import java.util.*;

class UnivStudent {
	String name, enrolment;
	int age;
	UnivStudent(){
		//default constructor
	}
	UnivStudent(String a, String b, int c){		//Method overloading
		name = a;
		enrolment = b;
		age = c;
	}
	void print() {
		System.out.print("The name of the student is "+name+".\nThe enrolment number assigned is "+enrolment+".\nAge of the student is "+age+".");
	}
}

class UGStudent extends UnivStudent{
	String Course;
	UGStudent(){
		//default constructor
	}
	
	UGStudent(String a){		//Method overloading
		Course = a;
	}
	@Override
	void print() {
		System.out.print("\nThe student is enrolled in the Undergraduate course, "+Course+".");
	}
}

class PGStudent extends UnivStudent{
	String Course;
	PGStudent(){
		//default constructor
	}
	
	PGStudent(String a){		//Method overloading
		Course = a;
	}
	@Override
	void print() {
		System.out.print("\nThe student is enrolled in the Postgraduate course, "+Course+".");
	}
}

public class Test_Student {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String abc, Name, enrolment, course;
	int age, choice;
	UnivStudent a= new UGStudent();
	UnivStudent b= new PGStudent();
	UnivStudent c=new UnivStudent();
	System.out.print("Enter 1 for UG Student. Enter 2 for PG Student.\nEnter Your Choice:- ");
	choice= sc.nextInt();
	switch (choice) {
	case 1:{
		System.out.println("Enter Your Details:-");
		sc.nextLine();
		System.out.println("Enter Your Name:-");
		Name=sc.nextLine();
		System.out.println("Enter Your Enrolment Number:-");
		enrolment=sc.nextLine();
		System.out.println("Enter Your Course:-");
		course=sc.nextLine();
		System.out.println("Enter Your Age:-");
		age=sc.nextInt();
		c=new UnivStudent(Name,enrolment,age);
		a=new UGStudent(course);
		c.print();
		a.print();
		break;
	}case 2:{
		System.out.println("Enter Your Details:-");
		sc.nextLine();
		System.out.println("Enter Your Name:-");
		Name=sc.nextLine();
		System.out.println("Enter Your Enrolment Number:-");
		enrolment=sc.nextLine();
		System.out.println("Enter Your Course:-");
		course=sc.nextLine();
		System.out.println("Enter Your Age:-");
		age=sc.nextInt();
		c=new UnivStudent(Name,enrolment,age);
		b=new PGStudent(course);
		c.print();
		a.print();
		break;
	}default: {
		System.out.print("Wrong Choice!");
	}
	}
	}
}
