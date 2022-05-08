import java.util.*;
public class Salary {
public static void main(String args[]) {
	double sal,da,sa,gs;
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Your Salary Amount:- ");
	sal=sc.nextDouble();
	System.out.print("Enter Your Name:- ");
	name=sc.next();
	
	if(sal<=10000) {
		da=(sal*10)/100;
		sa=(sal*5)/100;
		gs=sal+da+sa;
	}else if(sal<=20000) {
		da=(sal*12)/100;
		sa=(sal*8)/100;
		gs=sal+da+sa;
	}else if(sal<=30000) {
		da=(sal*15)/100;
		sa=(sal*10)/100;
		gs=sal+da+sa;
	}else if(sal>=30000) {
		da=(sal*20)/100;
		sa=(sal*12)/100;
		gs=sal+da+sa;
	}else {
		System.out.println("Wrong Input!!!");
		da=0.0;
		sa=0.0;
		gs=0.0;
	}
	
	System.out.println("Name\tBasic\t\tDA\tSpl. Allowance\tGross Salary");
	System.out.println(name+"\t"+sal+"\t"+da+"\t"+sa+"\t\t"+gs);
	
	sc.close();
}
}
