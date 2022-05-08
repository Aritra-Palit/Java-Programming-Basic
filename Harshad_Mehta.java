import java.util.*;
public class Harshad_Mehta {
	public static void main(String args[]) {
		int num,acnum,a,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:- ");
		acnum=sc.nextInt();
		num=acnum;
		do{
			a=acnum%10;
			res=res+a;
			acnum=acnum/10;
		}while(acnum!=0);
		if(num%res==0) {
			System.out.println("This is a Harshad Number.");
		}else {
			System.out.println("This is not a Harshad Number.");
		}
		sc.close();
	}
}
