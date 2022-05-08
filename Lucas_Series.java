
public class Lucas_Series {
public static void main(String args[]) {
	int num1,res,a=2,b=1;
	num1=a+b;
	res=a+b+num1;
	for(int i=1;i<=7;i++) {
		a=num1;
		num1=num1+b;
		b=a;
		res=res+num1;
	}
	System.out.print("The sum of the first ten digits of lucas series is "+res+".");
}
}
