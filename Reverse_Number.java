import java.util.*;
public class Reverse_Number {
public static void main(String args[]) {
	int num,rev_num=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number you want to reverse:-");
	num=sc.nextInt();
	while(num!=0) {
		rev_num=rev_num+num%10;
		num=num/10;
		rev_num=rev_num*10;
	}
	rev_num=rev_num/10;
	
	System.out.println("The reversed number is "+rev_num);
	sc.close();
}
}