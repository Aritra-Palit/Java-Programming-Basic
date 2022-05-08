import java.util.Scanner;

interface Vowels{
	String changevowels(String a);
}

class String_Vowels implements Vowels{
	String_Vowels(){
		
	}
	public String changevowels(String a) {
		char[] z=a.toCharArray();
		String replace="";
		   for(int i=0;i<=a.length()-1;i++){
			   if(z[i]=='a'||z[i]=='e'||z[i]=='i'||z[i]=='o'||z[i]=='u'||z[i]=='A'||z[i]=='E'||z[i]=='I'||z[i]=='O'||z[i]=='U') {
		        replace+="@";
			   }else {
				   replace+=z[i];  
			   }
		    }  
		   return replace;
}
}

public class Replace_Vowels {
public static void main(String args[]) {
	Vowels a=new String_Vowels();
	Scanner sc=new Scanner(System.in);
	String b,c;
	System.out.print("Enter any string:- ");
	b=sc.nextLine();
	c=a.changevowels(b);
	System.out.println(c);
	sc.close();
}
}