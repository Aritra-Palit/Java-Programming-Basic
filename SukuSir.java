import java.util.*;

abstract class ShowRoom{
	public abstract void input(String a, long b, double c, double d);
	public abstract void calculate();
	public abstract void display();
}

class showRoom1 extends ShowRoom{
	String name;
	long mobno;
	double cost,dis,amount,tempamt;
	showRoom1(){
		name=null;
		mobno=0;
		cost=dis=amount=0;
	}
	public void input(String a, long b, double c, double d) {
		name=a;
		mobno=b;
		cost=c;
		dis=d;
	}
	public void calculate() {
		tempamt = (cost*dis)/100;
		amount=cost-tempamt;
	}
	public void display() {
		System.out.println("The name of the customer is "+name+".");
		System.out.println("The mobile number of the customer is "+mobno+".");
		System.out.println("The amount to be paid after discount is ₹"+amount+".");
	}
}

public class SukuSir {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ShowRoom a=new showRoom1();
	String name;
	long mobno;
	double cost,dis=0;
	System.out.print("Enter Your Name:- ");
	name=sc.nextLine();
	System.out.print("Enter Your Mobile Number:- ");
	mobno=sc.nextLong();
	System.out.print("Enter the cost of the products purchased:- ");
	cost=sc.nextDouble();
	if(cost<=10000) {
		dis=5;
	}else if (cost <=20000) {
		dis=10;
	}else if (cost <= 35000) {
		dis=15;
	}else {
		cost=20;
		}
	a.input(name, mobno, cost, dis);
	a.calculate();
	a.display();
	}
	}

