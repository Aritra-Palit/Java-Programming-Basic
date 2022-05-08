import java.util.*;
public class Descending_Order {
public static void main(String[] args) {        
	int [] a = new int [6];
	Scanner sc=new Scanner(System.in);
    int temp=0;
    System.out.println("Enter six random numbers:- ");
    for(int i=0;i<6;i++) {
    	a[i]=sc.nextInt();
    }
    System.out.println("Elements of original array: ");    
    for (int i = 0; i < a.length; i++) {     
    	System.out.print(a[i] + " ");    
        }    
    for (int i = 0; i < a.length; i++) {     
        for (int j = i+1; j < a.length; j++) {     
            if(a[i] < a[j]) {    
            	temp = a[i];    
                a[i] = a[j];    
                a[j] = temp;    
                }     
            }     
        }    
    System.out.println();              
    System.out.println("Elements of array sorted in descending order: ");    
    for (int i = 0; i < a.length; i++) {     
    	System.out.print(a[i] + " ");    
    	} 
    sc.close();
    }
}
