import java.util.*;
public class Range_PrimeNo {
public static void main(String args[]) {
	int lowend,highend,flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Lower End of the Range:- ");
	lowend=sc.nextInt();
	System.out.print("Enter the Higher End of the Range:- ");
	highend=sc.nextInt();
	for(int a=lowend;a<=highend;a++) {
		flag=0;
	for(int i=2;i<a/2;i++) {
		if(a%i==0) {
			flag=1;
		}
	}
	if(flag==0) {
		System.out.println(a+" is a prime number.");
	}else {
		System.out.println(a+" is not a prime number.");
	}
	}
	sc.close();
}
}
