import java.util.Scanner;
class Calculation
{
int sum(int a,int b)
{
return a+b;
}
float sum(float a,float b,float c)
{
return a+b+c;
}
int multiply(int c,int d)
{
return c*d;
}
float multiply(float c,float d,float e)
{
return c*d*e;
}
int subtract(int f,int g)
{
return f-g;
}
}
public class Pratiksha
{
public static void main(String args[])
{
Calculation c=new Calculation();
System.out.println(c.sum(10,20));
System.out.println(c.sum(10.8f,20.8f,30.7f));
System.out.println(c.multiply(20,30));
System.out.println(c.multiply(20.8f,30.8f,40.7f));
System.out.println(c.subtract(10,5));
}
}