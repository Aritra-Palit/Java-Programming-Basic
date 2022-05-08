import java.util.*;
public class Prime_or_not {
public static void main(String args[]) {
	int num1,flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number you want to check:- ");
	num1=sc.nextInt();
	for(int i=2;i<=num1/2;i++) {
		if(num1%i==0) {
			flag=1;
		}
	}
	if(flag==0) {
		System.out.print(num1+" is a Prime Number.");
	}else {
		System.out.print(num1+" is not a Prime Number.");
	}
	sc.close();
}
}
