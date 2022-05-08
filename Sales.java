import java.util.*;
public class Sales {
public static void main(String args[]) {
	int a[][],b=0,c,d;
	Scanner sc=new Scanner(System.in);
	a=new int[4][5];
	for(int i=0;i<4;i++) {
		for (int j=0;j<5;j++) {
			System.out.print("Enter the sales for Store Number "+(i+1)+" and Department Number "+(j+1)+":-");
			a[i][j]=sc.nextInt();
		}
	}
	do {
	System.out.print("Press 1 to see the sales for a particular store and department.\nPress 2 to see sales of all department of a particular store.\nyPress 3 to see sales of all stores of a particular department.\nPress 4 to see all sales of all stores.\nPress 5 to exit:- ");
	b=sc.nextInt();
	switch(b) {
	case 1:{
		System.out.print("Enter the store number:- ");
		c=sc.nextInt();
		System.out.print("Enter the department number:- ");
		d=sc.nextInt();
		if((c>4||c<1)||(d>5||d<1)) {
			System.out.println("No Such Store or Department Exists. Try again");
		}else {
		System.out.print("The Sales for store number "+c+" and department number "+d+" is "+a[c-1][d-1]+".");
		System.out.println("");
		}
		break;
	}
	case 2:{
		System.out.print("Enter the store number:- ");
		d=sc.nextInt();
		if(d>4||d<1) {
			System.out.println("No Such Store Exists. Try again");
		}else {
		for(int i=0;i<5;i++) {
			System.out.print("The sales for Store Number "+(d)+" and Department Number "+(i+1)+":- "+a[d][i]);
			System.out.println("");
		}
		}
		break;
	}
	case 3:{
		System.out.print("Enter the department number:- ");
		d=sc.nextInt();
		if(d>5||d<1) {
			System.out.println("No Such Department Exists. Try again");
		}else {
		for(int i=0;i<4;i++) {
			System.out.print("The sales for Store Number "+(i+1)+" and Department Number "+(d)+":- "+a[i][d]);
			System.out.println("");
		}
		}
		break;
	}
	case 4:{
	System.out.println("The Total Monthly Sales Of Each Store and Each Department:-");
	for(int i=0;i<4;i++) {
		for (int j=0;j<5;j++) {
			System.out.print("The sales for Store Number "+(i+1)+" and Department Number "+(j+1)+":- "+a[i][j]);
			System.out.println("");
		}
	}
		break;
	}
	case 5:{
		System.out.println("Program Terminated!!!");
		break;
	}
	default:{
		System.out.println("Wrong Choice!!!");
	}
	}
	}while(b!=5);
	sc.close();
}
}
