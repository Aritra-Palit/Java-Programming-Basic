import java.util.*;
public class Program_5 {
public static void main(String args[]) {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The Number Till Which To Print:- ");
	a=sc.nextInt();
	for(int i=0;i<=a;i++) {
		System.out.println(i);
	}
	sc.close();
	}
}
