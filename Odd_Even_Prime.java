import java.util.*;
public class Odd_Even_Prime {
public static void main(String args[]) {
	int a[],b[],c[],d[],e=0,f=0,g=0,h=0,z=0;
	Scanner sc=new Scanner(System.in);
	a=new int[10];
	b=new int[10];
	c=new int[10];
	d=new int[10];
	System.out.print("Enter ten elements:- ");
	for(int i=0;i<10;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<10;i++) {
		if(a[i]%2==0) {
			b[e]=a[i];
			++e;
		}else {
			c[f]=a[i];
			++f;
		}
	}
	for(int i=0;i<10;i++) {
		h=a[i];
		z=0;
		for(int j=2;j<h/2;j++) {
			if(h%j==0) {
				z=1;
			}
		}if(z==0) {
			d[g]=a[i];
			++g;
		}
	}
	System.out.println("The Even Numbers in this series are:- ");
	for(int i=0;i<e;i++) {
		System.out.print(b[i]+" ");
	}
	System.out.println();
	System.out.println("The Odd Numbers in this series are:- ");
	for(int i=0;i<f;i++) {
		System.out.print(c[i]+" ");
	}
	System.out.println();
	System.out.println("The Prime Numbers in this series are:- ");
	for(int i=0;i<g;i++) {
		System.out.print(d[i]+" ");
	}
	sc.close();
}
}
