import java.util.*;
public class Div_by_3_and_5 {
public static void main(String args[]) {
	int a[], b[], c[], d=0, e=0, f=0;
	Scanner sc=new Scanner(System.in);
	a=new int[15];
	b=new int[15];
	c=new int[15];
	System.out.print("Enter the numbers:- \n");
	for(int i=0;i<15;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<15;i++) {
		d=d+a[i];
		if(a[i]%3==0) {
			b[e]=a[i];
			++e;
		}	
		if(a[i]%5==0) {
			c[f]=a[i];
			++f;
		}
	}
	System.out.println("The sum of all the digits in the array is "+d+".");
	System.out.print("The numbers divsible by 3 are:- \n");
	for(int i=0;i<e;i++) {
		System.out.print(b[i]+" ");
	}
	System.out.println();
	System.out.print("The numbers divsible by 5 are:- \n");
	for(int i=0;i<f;i++) {
		System.out.print(c[i]+" ");
	}
	sc.close();
}
}
