import java.util.*;
public class odd_even {
public static void main(String args[]) {
	int num,acnum,a,odd=0,even=0;
	Scanner sc=new Scanner(System.in);
	/*System.out.print("How many digits are there in the number:- ");
	num=sc.nextInt();*/
	System.out.print("Enter the number:- ");
	acnum=sc.nextInt();
	do{
		a=acnum%10;
		if(a%2==0) {
			even+=a;
		}else {
			odd+=a;
		}
		acnum=acnum/10;
	}while(acnum!=0);
	System.out.println("The sum of all even digits is "+even+".");
	System.out.println("The sum of all odd digits is "+odd+".");
	sc.close();
}
}
