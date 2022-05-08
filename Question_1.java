import java.util.*;
class Complex {
	int real, imaginary;
	Complex()
	{
	}
	void getComplex(int tempReal, int tempImaginary)
	{
		real = tempReal;
		imaginary = tempImaginary;
	}
	Complex addComplex(Complex C1, Complex C2)
	{
		Complex temp = new Complex();
		temp.real = C1.real + C2.real;
		temp.imaginary = C1.imaginary + C2.imaginary;
		return temp;
	}
	void showComplex()
	{
		System.out.println("Complex number: "+ real + " + "+ imaginary + "i");
	}
}


public class Question_1 {

	
	public static void main(String[] args)
	{
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your first real number:- ");
		a=sc.nextInt();
		System.out.print("Enter your first imaginary number:- ");
		b=sc.nextInt();
		Complex C1 = new Complex();
		C1.getComplex(a,b);
		C1.showComplex();
		System.out.print("Enter your second real number:- ");
		c=sc.nextInt();
		System.out.print("Enter your second imaginary number:- ");
		d=sc.nextInt();
		Complex C2 = new Complex();
		C2.getComplex(c, d);
		C2.showComplex();
		Complex C3 = new Complex();
		C3 = C3.addComplex(C1, C2);
		System.out.print("Sum of ");
		C3.showComplex();
		sc.close();
	}
}
