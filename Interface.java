interface Calculator{
	int add(int a,int b);
	int subtract(int a,int b);
	int multiplication(int a,int b);
	int division(int a,int b);
}
class Normal_Calculator implements Calculator{
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public int multiplication(int a,int b) {
		return a*b;
	}
	public int division(int a,int b) {
		return a/b;
	}
}
public class Interface {
public static void main(String args[]) {
	Calculator a=new Normal_Calculator();
	System.out.println("Value after addition = "+a.add(50, 25)+".");
	System.out.println("Value after subtract = "+a.subtract(50, 25)+".");
	System.out.println("Value after multiplication = "+a.multiplication(5, 2)+".");
	System.out.print("Value after division = "+a.division(50, 25)+".");
}
}
