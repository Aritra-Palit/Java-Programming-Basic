import java.util.*;
public class Amicable_Number {
public static void main(String args[]) {
	int num1, num2;
	int b=0,a=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the first number:- ");
	num1=sc.nextInt();
	System.out.print("Enter the second number:- ");
	num2=sc.nextInt();
	for(int i=1;i<=num1/2;i++) {
		if(num1%i==0) {
			a+=i;
		}
	}
	for(int i=1;i<=num2/2;i++) {
		if(num2%i==0) {
			b+=i;
		}
	}
	if(b==num1||a==num2) {
		System.out.print("This is an amicable number.");
	}else {
		System.out.print("This is not an amicable number.");
	}
	sc.close();
}
}
