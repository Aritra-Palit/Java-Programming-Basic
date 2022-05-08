import java.util.*;
public class Program_4 {
public static void main(String args[]) {
	int a,b,d;
	String c;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The 1st Number:-");
	a=sc.nextInt();
	System.out.print("Enter The 2nd Number:-");
	b=sc.nextInt();
	System.out.print("Enter The Operator:-");
	c=sc.next();
	switch(c) {
	case "+":{
		d=a+b;
		System.out.print("The answer is "+d);
		break;
	}case "-":{
		d=a-b;
		System.out.print("The answer is "+d);
		break;
	}case "*":{
		d=a*b;
		System.out.print("The answer is "+d);
		break;
	}case "/":{
		d=a/b;
		System.out.print("The answer is "+d);
		break;
	}default:{
		System.out.print("Invalid Operator");
		break;
	}
	}
	sc.close();
}
}
