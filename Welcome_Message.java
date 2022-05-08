import java.util.*;
public class Welcome_Message {
public static void main(String args[]) {
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.print("Please Enter Your Name:- ");
	name=sc.next();
	System.out.println("Welcome "+name);
	sc.close();
}
}
