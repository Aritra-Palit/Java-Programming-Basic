import java.util.*;
public class Matrices {
public static void main(String args[]) {
	int a, b;
	int[][] c;
	int d[][];
	int[][] e;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the first limit:- ");
	a=sc.nextInt();
	System.out.print("Enter the second limit:- ");
	b=sc.nextInt();
	c=new int[a][b];
	d=new int[a][b];
	e=new int[a][b];
	System.out.print("Enter the first matrix\n");
	for(int i=0;i<a;i++) {
		for (int j=0;j<b;j++) {
			c[i][j]=sc.nextInt();
		}
	}
	System.out.print("Enter the second matrix\n");
	for(int i=0;i<a;i++) {
		for (int j=0;j<b;j++) {
			d[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<a;i++) {
		for (int j=0;j<b;j++) {
			e[i][j]=d[i][j]+c[i][j];
		}
	}
	System.out.print("The first Matrix is \n");
	for(int i=0;i<a;i++) {
		for (int j=0;j<b;j++) {
			System.out.print(c[i][j]+" ");
		}
		System.out.println("");
	}
	System.out.print("The second Matrix is \n");
	for(int i=0;i<a;i++) {
		for (int j=0;j<b;j++) {
			System.out.print(d[i][j]+" ");
		}
		System.out.println("");
	}
	System.out.print("The sum of two Matrix is \n");
	for(int i=0;i<a;i++) {
		for (int j=0;j<b;j++) {
			System.out.print(e[i][j]+" ");
		}
		System.out.println("");
	}
	sc.close();
}
}
