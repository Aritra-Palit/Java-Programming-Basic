import java.util.*;
public class Smith_No {
public static void main(String args[]) {
	int num,sn=0;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	
	for(int i=2;i<=num/2;i++) {
		for(int j=2;j<=i/2;j++) {
		    if(i%j==0) {
			
		      }else {
			   sn=sn+i;
			   if(i*i==num) {
			   sn=sn+i;
			}
		}
	}
		}
	
	System.out.print(sn);
	
	sc.close();
}
}
