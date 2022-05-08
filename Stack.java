import java.util.*;

interface Stack_Array{
	void create(int b);
	void push(int g);
	void pop();
	void show();
}

class Stack_Java implements Stack_Array{
	int a[];
	int x,l=-1;
	Stack_Java(){}
	public void create(int b) {
		a=new int[b];
		x=b-2;
	}
	public void push(int g){
		if(l<x) {
			++l;
			a[l]=g;
			System.out.println("Item Pushed!");
		}else {
			System.out.println("Stack Overflow!");
		}
	}
	public void pop() {
		if(l<0) {
		System.out.println("Stack Underflow!");	
		} else {
		--l;
		System.out.println("Item Popped!");
		}
	}
	public void show() {
		if(l<0) {
			System.out.print("Stack Empty!");
		}else {
			System.out.println("Elements in the stack are:- ");
			for(int i=0;i<=l;i++) {
				System.out.print(a[i]);
				System.out.print("\t");
			}
		}
		System.out.println();
	}
}

public class Stack {
public static void main(String args[]) {
	Stack_Array a=new Stack_Java();
	Scanner sc=new Scanner(System.in);
	int b,c=0,d;
	System.out.print("Enter the size of the stack:- ");
	b=sc.nextInt();
	a.create(b+1);
	do {
		System.out.print("Enter 1 for push.\nEnter 2 to pop the last element.\nEnter 3 for show.\nEnter 4 for exit.\nEnter your choice:- ");
		c=sc.nextInt();
		switch(c) {
		case 1:{
			System.out.print("Enter the element to be pushed:- ");
			d=sc.nextInt();
			a.push(d);
			break;
		}case 2:{
			a.pop();
			break;
		}case 3:{
			a.show();
			break;
		}case 4:{
			System.out.print("Program Terminated");
			break;
		}default:{
			System.out.println("Wrong Option!");
		}
		}
	}while(c!=4);
	sc.close();
}
}
