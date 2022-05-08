import java.util.*;
public class Transpose {
public static void main(String args[]) {
	int a[][], b[][];
	Scanner sc=new Scanner(System.in);
	a=new int[3][4];
	b=new int[4][3];
	System.out.println("Enter the elements in the 3x4 array:- ");
	for(int i=0;i<3;i++) {
		for(int j=0;j<4;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<3;i++) {
		for(int j=0;j<4;j++) {
			b[j][i]=a[i][j];
		}
	}
	System.out.println("The matrix you have entered is:- ");
	for(int i=0;i<3;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("The transpose of the matrix is:- ");
	for(int i=0;i<4;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	sc.close();
}
}
