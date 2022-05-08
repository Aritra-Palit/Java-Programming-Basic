import java.util.*;
public class Program_6 {
public static void main(String args[]) {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The last Number:- ");
	a=sc.nextInt();
	for(int i=1;i<=a;i++) {
		if(i%2==0) {
			System.out.println(i+" is an even number.");
		}else {
			System.out.println(i+" is an odd number.");
		}
	}
	sc.close();
}
}
