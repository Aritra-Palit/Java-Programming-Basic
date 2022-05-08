import java.util.*;
public class Triangular_Number {
public static void main(String args[]) {
	int n,res=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the last number:-");
	n=sc.nextInt();
	for(int i=0;i<=n;i++) {
		res=res+i;
	}
	System.out.print("The triangular number of "+n+" is "+res);
	sc.close();
}
}
