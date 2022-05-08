import java.util.*;
public class Fixed_Deposit {
public static void main(String args[]) {
	double sum,ma;
	int nod;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter The Sum:- ");
	sum=sc.nextDouble();
	System.out.print("Enter The Number of Days:- ");
	nod=sc.nextInt();
	if(nod<=180) {
		ma=(sum*5.5)/100;
	}else if(nod<=364) {
		ma=(sum*7.5)/100;
	}else if(nod==365) {
		ma=(sum*9.0)/100;
	}else if(nod>365) {
		ma=(sum*8.5)/100;
	}else {
		System.out.println("Wrong Input!!!!");
		ma=0.0;
	}
	ma=ma+sum;
	System.out.println("Your Maturity Amount Is "+ma);
	
	sc.close();
}
}
