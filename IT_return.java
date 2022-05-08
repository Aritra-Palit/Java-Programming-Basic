import java.util.*;
class IT_Calculation{
	private int age, income, calculate=0;
	private String gender;
	IT_Calculation(){
		age=0;
		gender=null;
		income=0;
	}
	IT_Calculation(int age,int income, String gender){
		this.age=age;
		this.gender=gender;
		this.income=income;
	}
	int judge() {
		if(age>=65 || gender.equalsIgnoreCase("Female")) {
			return 0;
			}
		else {
			return 1;
			}
	}
	int calculate() {
		if(income<=160000) 
			calculate=0;
		else if (income>160000 && income<=500000){
			calculate=(income-160000)*10/100;
		}
		else if(income>500000 && income<=800000) {
			calculate=((income-500000)*20/100)+34000;
		}
		else if(income>800000) {
			calculate=((income-800000)*30/100)+94000;
		}
		return calculate;
	}
	
}

public class IT_return {
public static void main(String args[]) {
	int age, income, judge, tax;
	String gender;
	Scanner sc=new Scanner(System.in);
	IT_Calculation a=new IT_Calculation();
	System.out.print("Enter Your Age:- ");
	age=sc.nextInt();
	System.out.print("Enter Your Income:- ");
	income=sc.nextInt();
	System.out.print("Enter Your Gender (Male or Female):- ");
	gender=sc.next();
	a=new IT_Calculation(age, income, gender);
	judge=a.judge();
	if(judge==0) {
		System.out.print("Wrong Category!");
	}else {
		tax=a.calculate();
		System.out.print("The tax to be paid by the citizen is :- "+tax+".");
	}
	sc.close();
}
}
