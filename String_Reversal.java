import java.util.*;

interface Reverse{
	String reversal(String a);
}

class StringReversal implements Reverse{
	StringReversal(){
		
	}
	public String reversal(String a) {
		char[] z=a.toCharArray();
		String rstring="";
		   for(int i=a.length()-1;i>=0;i--){  
		        rstring+=z[i];  
		    }  
		   return rstring;
}
}

public class String_Reversal {
public static void main(String args[]) {
	Reverse a=new StringReversal();
	Scanner sc=new Scanner(System.in);
	String b,c;
	System.out.print("Enter any string:- ");
	b=sc.nextLine();
	c=a.reversal(b);
	System.out.println(c);
	sc.close();
}
}
