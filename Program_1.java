import java.util.*;
public class Program_1 {
public static void main(String args[]) {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Your Marks:- ");
	a=sc.nextInt();
	if(a<=100 && a>=95) {
		System.out.print("You have achieved A+");
	}else if(a<95 && a>=90) {
		System.out.print("You have achieved A");
	}else if(a<90 && a>=80) {
		System.out.print("You have achieved B");
	}else if(a<80 && a>=70) {
		System.out.print("You have achieved C");
	}else if(a<70 && a>=60) {
		System.out.print("You have achieved D");
	}else if(a<60 && a>=50) {
		System.out.print("You have achieved E");
	}else {
		System.out.print("You have failed.");
	}
	sc.close();
}
}
