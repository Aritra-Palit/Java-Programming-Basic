import java.util.*;
public class Eulars_Number {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int num,fact,num1,j;   
	double e=0.0;
	System.out.println("Enter the last number:");
	num= sc.nextInt();
	 for(num1=1; num1<=num;num1++)
	 {
         fact =1;
         for(j=2; j<=num1;j++)
         {
             fact*=j;
         }
         e+=(1.0d/fact);
     }
     System.out.println("The sum is    e= " + (e+1));
	sc.close();
}
}