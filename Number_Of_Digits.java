import java.util.*;
public class Number_Of_Digits {
public static void main(String args[]) {
	int num,rev_num=0,count=0,temp;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number you want to count the digits of:-");
	num=sc.nextInt();
	temp=num;
	while(temp!=0) {
		rev_num=rev_num+temp%10;
		temp=temp/10;
		rev_num=rev_num*10;
		++count;
	}
	
	System.out.println("The number of digits in "+num+" is "+count);
	sc.close();
}
}
