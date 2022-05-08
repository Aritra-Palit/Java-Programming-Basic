import java.util.*;
class Television{
	private float cost, discount, amount;
	
	Television(){
		cost=discount=amount=(float) 0.00;
	}
	
	void accept(float a) {
		cost = a;
	}
	
	void discount() {
		discount=cost*10/100;
		amount=cost-discount;
	}
	
	void display() {
		System.out.println("The discount on the television is "+discount+".");
		System.out.println("The amount to be paid after discount is "+amount+".");
	}
}

public class Billing {
public static void main(String args[]) {
	float cost;
	Television tv=new Television();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the cost of the television:- ");
	cost=sc.nextFloat();
	tv.accept(cost);
	tv.discount();
	tv.display();
	sc.close();
}
}
