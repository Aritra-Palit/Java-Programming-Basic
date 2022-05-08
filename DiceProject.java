import java.util.*;
public class DiceProject {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a;
	System.out.println("Enter the number of turns:-");
	a=sc.nextInt();
	if(a%2==0) {
		System.out.println("The match is a draw.");
	}else if(a%2!=0) {
		System.out.println("The match is won by player 1.");
	}else {
		System.out.println("The match is not possible.");
	}
	sc.close();
}
}
