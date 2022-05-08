import java.util.*;
public class Program_2 {
public static void main(String args[]) {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The Month Number:-");
	a=sc.nextInt();
	if(a==1) {
		System.out.print("This Month Contains 31 Days.");
	}else if(a==2) {
		System.out.print("This Month Contains 28/29 Days.");
	}else if(a==3) {
		System.out.print("This Month Contains 31 Days.");
	}else if(a==4) {
		System.out.print("This Month Contains 30 Days.");
	}else if(a==5) {
		System.out.print("This Month Contains 31 Days.");
	}else if(a==6) {
		System.out.print("This Month Contains 30 Days.");
	}else if(a==7) {
		System.out.print("This Month Contains 31 Days.");
	}else if(a==8) {
		System.out.print("This Month Contains 31 Days.");
	}else if(a==9) {
		System.out.print("This Month Contains 30 Days.");
	}else if(a==10) {
		System.out.print("This Month Contains 31 Days.");
	}else if(a==11) {
		System.out.print("This Month Contains 30 Days.");
	}else if(a==12) {
		System.out.print("This Month Contains 31 Days.");
	}else {
		System.out.print("Invalid Month.");
	}
	sc.close();
}
}
