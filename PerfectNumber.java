
public class PerfectNumber {
public static void main(String args[]) {
	int a=0;
	for (int i=1;i<=500;i++) {
		for(int j=1;j<=i/2;j++) {
			if(i%j==0) {
				a=a+j;
				}
		}
		if(a==i)
		System.out.println("The perfect number is"+a);
	}
}
}
