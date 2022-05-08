import java.util.*;
public class Program_7 {
	public static void main(String args[]) {
		int a,b=0,c=1,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The last Number:- ");
		a=sc.nextInt();
		while(b<=a) {
			d=b+c;
			System.out.print(b);
			c=b;
			b=d;
			System.out.print(",");
		}
		sc.close();
	}
}
