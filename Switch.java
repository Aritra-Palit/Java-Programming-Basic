import java.util.*;
public class Switch {
public static void main(String args[]) {
	int a, b, c, d=0, e;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:- ");
	a=sc.nextInt();
	e=a;
	System.out.print("If you want to check if its palindrome or not then press 1.\nIf you want to check if its perfect or not then press 2.\nIf you want to exit press 3.\nEnter your choice:- ");
	b=sc.nextInt();
	switch(b) {
	case 1: {
		do{
			c=a%10;
			d=d+c;
			d=d*10;
			a=a/10;
		}while(a!=0);
		d=d/10;
		if(e==d) {
			System.out.print("This is a palindrome number.");
		}else {
			System.out.print("This is not a palindrome number.");
		}
		break;
	}
	case 2:{
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				d+=i;
			}
		}
		if(d==a) {
			System.out.print("This is a perfect number.");
		}else {
			System.out.print("This is not a perfect number.");
		}
		
		break;
	}
	case 3:{
		break;
	}
	default:
		System.out.print("Wrong Choice!!!");
	}
	sc.close();
}
}
