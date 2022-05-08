import java.util.*;
public class Marks {
public static void main(String args[]) {
	int Prac_Marks,Theory_Marks,Average;
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your average practical marks:- ");
	Prac_Marks=sc.nextInt();
	System.out.print("Enter your average theory marks:- ");
	Theory_Marks=sc.nextInt();
	Average=((Prac_Marks*40)/100)+((Theory_Marks*60)/100);
	if(Average>=90) {
		ch='A';
	}else if(Average>=80) {
		ch='B';
	}else if(Average>=60) {
		ch='C';
	}else if(Average>=50) {
		ch='D';
	}else {
		ch='F';
	}
	switch(ch) {
	case 'A':{
		System.out.println("Your Average Marks is "+Average);
		System.out.println("Excellent");
		break;
	}
	case 'B':{
		System.out.println("Your Average Marks is "+Average);
		System.out.println("Very Good");
		break;
	}
	case 'C':{
		System.out.println("Your Average Marks is "+Average);
		System.out.println("Good");
		break;
	}
	case 'D':{
		System.out.println("Your Average Marks is "+Average);
		System.out.println("Satisfactory");
		break;
	}
	case 'F':{
		System.out.println("Your Average Marks is "+Average);
		System.out.println("Fail");
		break;
	}
	default:{
		System.out.println("N/A");
		System.out.println("N/A");
		break;
	}
	}
	sc.close();
	}
}