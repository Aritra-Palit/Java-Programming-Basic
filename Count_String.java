import java.util.Scanner;

interface Count{
	int countword(String a);
	int countletters(String a);
}

class StringCount implements Count{
	int cntwrd=1,cntltr=0;
	StringCount(){}
	public int countword(String a) {
		if(a.length()==0) {
		cntwrd=0;
		}else{
		char[] z=a.toCharArray();
		   for(int i=1;i<=a.length()-2;i++){
			   if(z[i-1]==' ') {
				   ++cntwrd;   
			   }  
		    }
		}
		return cntwrd;
	}
	public int countletters(String a) {
		cntltr=a.length();
		return cntltr;
}
}

public class Count_String {
public static void main(String args[]) {
	Count a=new StringCount();
	Scanner sc=new Scanner(System.in);
	String b;
	int c,d;
	System.out.print("Enter any string:- ");
	b=sc.nextLine();
	c=a.countword(b);
	d=a.countletters(b);
	System.out.println("The number of words in this string are:- "+c+".");
	System.out.println("The number of letters in this string are:- "+d+".");
	sc.close();
}
}