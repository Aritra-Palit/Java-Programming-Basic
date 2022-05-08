import java.util.*;
public class Temp_Change {
public static void main(String args[]) {
	double celsius,fahrenheit;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the temperature in Celsius:- ");
	celsius=sc.nextInt();
	fahrenheit=(celsius*1.8)+32;
	System.out.print("The temperature in Fahrenheit is:- "+fahrenheit);
	sc.close();
}
}