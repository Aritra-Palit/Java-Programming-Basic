import java.util.*;
public class DecToBin_BinToDec {
public static void main(String args[]) {
	int Dec,Bin[],Op,a=0,Binary,Decimal=0,temp=0,b=0;
	Bin=new int[40];
	Scanner sc=new Scanner(System.in);
	do {
		System.out.print("Enter 1 for changing from Decimal to Binary,\nEnter 2 for changing from Binary to Decimal,\nEnter 3 to exit.\nYour Option:- ");
		Op=sc.nextInt();
		switch(Op) {
		case 1:{
			System.out.print("Enter the decimal number:- ");
			Dec=sc.nextInt();
			while (Dec>0) {
				Bin[a++]=Dec%2;
				Dec=Dec/2;
			}
			System.out.print("The Binary Number is ");
			for(int i = a-1;i >= 0;i--){    
			       System.out.print(Bin[i]);    
			     } 
			System.out.println();
			break;
		}
		case 2:{
			System.out.print("Enter the Binary number:- ");
			Binary=sc.nextInt();
			while (Binary>0){
			temp=Binary%10;
			Decimal+=temp*Math.pow(2, b);
			Binary=Binary/10;
			b++;}
			System.out.print("The Decimal Number is "+Decimal);
			System.out.println();
			break;	
		}
		case 3:{
			System.out.println("Program Terminated!!!");
			break;
		}
		default:{
			System.out.println("Wrong Choice! Enter Again.");
		}
		}
	}while(Op!=3);
	sc.close();
}
}
