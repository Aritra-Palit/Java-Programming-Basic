import java.util.*;
public class AIOOBE {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	String s="Aritra Palit";
	System.out.print("Enter the number of elements:- ");
	int b=sc.nextInt();
	System.out.println("Enter the array elements:-");
	try{
        for(int i=0;i<b;i++) {
        	a[i]=sc.nextInt();
        }
        int n=Integer.parseInt(s);
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("ArrayIndexOutOfBounds "+e);
      }catch(NumberFormatException e){
    	  System.out.println("Number format exception occurred "+e);
      }
    }
}

