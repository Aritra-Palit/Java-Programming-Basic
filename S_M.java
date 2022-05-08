import java.util.*;
public class S_M {
public static void main(String args[]) {
	int a[][],b,c;
	Scanner sc=new Scanner(System.in);
	a=new int[4][4];
	System.out.println("Enter Values Into The 4x4 Matrix:- ");
	for(int i=0;i<4;i++) {
		for (int j=0;j<4;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	b=a[0][0];
	c=a[0][0];
	for(int i=0;i<4;i++) {
		for (int j=0;j<4;j++) {
			if(a[i][j]>b) {
				b=a[i][j];
			}
			if(a[i][j]<c) {
				c=a[i][j];
			}
		}
	}
	System.out.println("The 4x4 matrix is:-");
	for(int i=0;i<4;i++) {
		for (int j=0;j<4;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("The largest number in this 4x4 matrix is "+b+".");
	System.out.println("The smallest number in this 4x4 matrix is "+c+".");
	sc.close();
}
}
