import java.util.*;
class Calculation{
	int num1, num3, num6;
	float num2, num4, num5;
	int addition(int a, int b) {
		num1=a+b;
		return num1;
	}
	float addition(int a, int b, float c) {
		num2=a+b+c;
		return num2;
	}
	int multiplication(int a, int b) {
		num3=a*b;
		return num3;
	}
	float multiplication(int a, int b, float c) {
		num4=a*b*c;
		return num4;
	}
	float subtraction(int a, int b, float c) {
		num5=a-b-c;
		return num5;
	}
	int subtraction(int a, int b) {
		num6=a-b;
		return num6;
	}
	
}
public class Question_2 {
public static void main(String args[]) {
	int a,b;
	float c;
	Calculation a1=new Calculation();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your first number:- ");
	a=sc.nextInt();
	System.out.print("Enter your second number:- ");
	b=sc.nextInt();
	System.out.print("Enter your third number:- ");
	c=sc.nextFloat();
	System.out.println("The sum of the first two digits are "+a1.addition(a, b)+".");
	System.out.println("The sum of the first three digits are "+a1.addition(a, b, c)+".");
	System.out.println("The multiplied value of the first two digits are "+a1.multiplication(a, b)+".");
	System.out.println("The multiplied value of the first three digits are "+a1.multiplication(a, b, c)+".");
	System.out.println("The subtracted value of the first two digits are "+a1.subtraction(a, b)+".");
	System.out.println("The subtracted value of the first three digits are "+a1.subtraction(a, b, c)+".");
	sc.close();
}
}
