import java.util.*;
import java.text.DecimalFormat;
class money{
	private int rupee, paisa;
	private float total;
	money(){
		rupee=0;
		paisa=0;
	}
	money(int a, int b){
		rupee=a;
		paisa=b;
	}
	money (float a){
		total=a;
	}
	money addition(money a) {
		this.paisa=paisa+a.paisa;
		this.rupee=rupee+a.rupee;
		return this;
	}
	money subtraction(money a) {
		this.total=total-a.total;
		return this;
	}
	void rectify() {
		int z=1;
		while(paisa>=100) {
			paisa=paisa%100;
			rupee=rupee+z;
		}
	}
	void show() {
		System.out.print("The total money is "+rupee+"."+paisa+".");
	}
	void shows() {
		System.out.print("The total money is "+new DecimalFormat("##.##").format(total)+".");
	}
}
public class LA7 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int x,y,z,w,o;
	float q,l;
	money a=new money();
	money b=new money();
	money c=new money();
	System.out.print("Enter 1 for addition, 2 for subtraction:- ");
	o=sc.nextInt();
	switch(o) {
	case 1:{
		System.out.print("Enter the rupee of first item:- ");
		x=sc.nextInt();
		System.out.print("Enter the paisa of first item:- ");
		y=sc.nextInt();
		System.out.print("Enter the rupee of second item:- ");
		z=sc.nextInt();
		System.out.print("Enter the paisa of second item:- ");
		w=sc.nextInt();
		a=new money(x,y);
		b=new money(z,w);
		c=a.addition(b);
		c.rectify();
		c.show();
		break;
	}
	case 2:{
		System.out.print("Enter the rupee of first item:- ");
		q=sc.nextFloat();
		System.out.print("Enter the rupee of second item:- ");
		l=sc.nextFloat();
		a=new money(q);
		b=new money(l);
		c=a.subtraction(b);
		c.shows();
		break;
	}
	default:{
		System.out.print("Wrong Choice!!!");
	}
	}
	sc.close();
}
}
