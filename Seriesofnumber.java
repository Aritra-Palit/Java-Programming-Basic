
public class Seriesofnumber {
public static void main(String args[]) {
	float n=33, s=0, a;
	for(int i=1; i<=n;i++) {
		a=i+2;
		s=s+i/a;
	}
	s=(int) s;
	System.out.println("The sum of the series is "+s);
	System.out.println("The factorials of the number are");
	for(int i=1;i<=s/2;i++) {
		if(s%i==0) {
			System.out.println(i);
		}
	}
}
}
