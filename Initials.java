import java.util.Scanner;

interface Ini_name{
	String initialname(String a);
}

class Initial_Name implements Ini_name{
	String initial="";
	int y;
	Initial_Name(){}
	public String initialname(String a) {
		char[] z=a.toCharArray();
		if(a.length()==0) {
		initial="Empty String";
		}else{
		   for(int i=0;i<=a.length()-1;i++){
			   if(i==0) {
				   initial+=z[0];
			   }
			   else if(z[i]==' ') {
				   initial+=z[i];
				   initial+=z[i+1];
				   y=i+2;
			   }  
		    }
		}
		for(int k=y;k<=a.length()-1;k++) {
			initial+=z[k];
		}
		return initial;
	}
}

public class Initials {
public static void main(String args[]) {
	Ini_name a=new Initial_Name();
	Scanner sc=new Scanner(System.in);
	String b,c;
	System.out.print("Enter any string:- ");
	b=sc.nextLine();
	c=a.initialname(b);
	System.out.println(c);
	sc.close();
}
}