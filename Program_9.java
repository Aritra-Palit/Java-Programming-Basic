import java.util.*;
public class Program_9 {
	public static void main(String[] args) {
	      
	    int a = 0, b = 0;
	    Scanner sc = new Scanner(System.in);
	    do {
	      a += b;
	      System.out.println("Enter a number:-");
	      b = sc.nextInt();
	    } while(b >= 0); 
		   
	    System.out.println("Sum = " + a);
	    sc.close();
	  }
}
