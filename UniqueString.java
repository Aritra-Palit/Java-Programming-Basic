import java.util.Scanner;

interface Unique{
	String Uniqueness(String a);
}

class Unique_String implements Unique{
	Unique_String(){
		
	}
	public String Uniqueness(String a) {
		char[] z=a.toCharArray();
		String rstring="Unique";
		   for(int i=a.length()-1;i>=0;i--){  
			   for(int j=i-1;j>=0;j--){  
			        if(z[i]==z[j]) {
			        	rstring="Not Unique";
			        	break;
			        }
			    }  
		    }  
		   return rstring;
}
}

public class UniqueString {
public static void main(String args[]) {
	Unique a=new Unique_String();
	Scanner sc=new Scanner(System.in);
	String b,c;
	System.out.print("Enter any string:- ");
	b=sc.nextLine();
	c=a.Uniqueness(b);
	System.out.println(c);
	sc.close();
}
}