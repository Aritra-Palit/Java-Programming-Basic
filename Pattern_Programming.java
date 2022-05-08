import java.util.*;
public class Pattern_Programming {
public static void main(String args[]) {
	int num,counter=0,num1=1;
	String ch[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of rows you want to print:- ");
	num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	System.out.println();
	
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(ch[counter]+" ");
		}
		counter++;
		System.out.println();
	}
	System.out.println();
	System.out.println();
	System.out.println();
	
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(num1+" ");
			num1++;
		}
		System.out.println();
	}
	
	sc.close();
}
}
