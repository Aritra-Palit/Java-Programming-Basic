import java.util.*;
class commission{
	static float salesAmount[], comm[];
	
	commission(){
		salesAmount=new float[3];
		comm=new float[3];
	}
	commission(float rate[]) {
		salesAmount=rate;
	}
	float[] a() {
		for(int i=0;i<3;i++) {
			comm[i]=salesAmount[i]*25/100;
		}
		return comm;
	}
}
public class Test {
public static void main(String args[]) {
	float sales[],comm[];
	commission sa=new commission();
	Scanner sc=new Scanner(System.in);
	sales=new float[3];
	comm=new float[3];
	System.out.print("Enter the sales of three salesman:-");
	for(int i=0;i<3;i++) {
		sales[i]=sc.nextFloat();
	}
	sa=new commission(sales);
	comm=sa.a();
	for(int i=0;i<3;i++) {
		System.out.print("The commission for salesman number "+i+" is "+comm[i]+".");
		System.out.println("");
	}
	System.out.println("");
	sc.close();
}
}
