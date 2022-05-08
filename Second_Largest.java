import java.util.*;
public class Second_Largest {
public static void main(String args[]) {
	int a=0, b=0, c=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the numbers:- ");
	for(int i=0;i<10;++i) {
		if(i==0) {
			a=sc.nextInt();
		}else if(i==1) {
			b=sc.nextInt();
		}else {
		c=sc.nextInt();}
		
		if(c>a) {
			if(c>b) {
				a=b;
				b=c;
			}else {
				a=c;
			}
		}else if(c>b) {
			if(c>a) {
				b=a;
				a=c;
			}else {
				b=c;
			}
		}
		
	}
	if(a>b) {
		System.out.print(b+" is the second largest number.");
	}else {
		System.out.print(a+" is the second largest number.");
	}
}
}
