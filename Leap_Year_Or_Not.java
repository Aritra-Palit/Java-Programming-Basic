import java.util.*;
public class Leap_Year_Or_Not {
public static void main(String args[]) {
	int year;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the year:- ");
	year=sc.nextInt();
	if(year%4==0) {
		System.out.print(year+" is a Leap Year.");
	}else {
		System.out.print(year+" is not a Leap Year.");
	}
	sc.close();
}
}
