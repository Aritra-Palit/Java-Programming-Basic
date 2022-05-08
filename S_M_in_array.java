import java.util.*;
public class S_M_in_array {
public static void main(String args[]) {
	int a[], b, c, d;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the count:- ");
	d=sc.nextInt();
	a=new int[d];
	System.out.print("Enter the set of numbers:- \n");
	for(int i=0;i<d;i++) {
		a[i]=sc.nextInt();
	}
	b=a[0];
	c=a[0];
	for(int i=0;i<d;i++) {
		if(b<a[i]) {
			b=a[i];
		}
	}
	for(int i=0;i<d;i++) {
		if(c>a[i]) {
			c=a[i];
		}
	}
	System.out.println("The largest number in the array is "+b+".");
	System.out.print("The smallest number in the array is "+c+".");
	sc.close();
}
}
