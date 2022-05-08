import java.util.Scanner;
abstract class Account
{
int accountNumber;
 String accountHoldersName, address;
  double balance;
 public Account(int acNo, String name, String adrs, double b)
 {
	 accountNumber= acNo;
	 accountHoldersName=name;
	 address=adrs;
	 balance=b;
 }
 abstract void withdraw(double w);
 abstract void deposit(double d);
 abstract void calculateAmount();
 public void display()
 {
	 System.out.println("ACCOUNT HOLDER'S NUMBER : "+accountNumber );
	 System.out.println("ACCOUNT HOLDER'S NAME : "+accountHoldersName );
	 System.out.println("ACCOUNT HOLDER'S ADDRESS : "+address );
	 System.out.println("The account balance is = "+ balance);
	 
 } 
 }
 class SavingsAccount extends Account
{
	double rateOfInterest, amount;
	public SavingsAccount(int acNo, String name, String adrs, double b,double r)
	{
	super(acNo,name,adrs,b);
	rateOfInterest=r;
	}
	public void withdraw(double am)
	{
		balance-=am;
	}
	public void deposit(double am)
	{
		balance+=am;
	}
	public void calculateAmount() {
		amount=(balance*rateOfInterest)/100;
	}
 public void display()
 {
	 super.display();
	 System.out.println("RATE OF INTEREST : "+rateOfInterest+"%" );	 
	 System.out.print("The Amount of Interest that will be added to your account is "+amount+".");
 }
}
 
 class CurrentAccount extends Account
 {
 	double overdraftLimit;
 	public CurrentAccount(int acNo, String name, String adrs, double b,double ol)
 	{
 	super(acNo,name,adrs,b);
 	this.overdraftLimit=ol;
 	}
 	public void withdraw(double am)
	{
 		if(am<=overdraftLimit+balance) {
		balance-=am;
 		}
 		else 
 			 System.out.println("YOU CANNOT WITHDRAW AMOUNT OVER : Rs "+ (overdraftLimit+balance));
 			}
 	
	public void deposit(double am)
	{
		balance+=am;
	}
	public void calculateAmount() {
		
	}
	
	public void display()
	{
		 System.out.println("ACCOUNT HOLDER'S NUMBER : "+accountNumber );
		 System.out.println("ACCOUNT HOLDER'S NAME : "+accountHoldersName );
		 System.out.println("ACCOUNT HOLDER'S ADDRESS : "+address );
		 System.out.println("ACCOUNT HOLDER'S OVERDRAFT LIMIT : "+ overdraftLimit);	 
		 System.out.println("ACCOUNT HOLDER'S BALANCE : "+balance );	 
	 }
	}
 
 public class Bank
 {
	 public static void main(String args[])
	 {
		 Scanner in=new Scanner(System.in);
		 System.out.print("What kind of Account do you have?\nEnter S for Savings Account or Enter C for Current Account:- ");
		 String v=in.next();
		 switch(v) {
		 case "s":{
		 	System.out.println("\t *  SAVINGS ACCOUNT  *  ");
		 	System.out.println("Enter the account number : ");
		 	 int accNo= in.nextInt();
		 	 System.out.println("Enter the name of customer : ");
		 	 String name= in.next();
		 	 System.out.println("Enter the address of customer : ");
		 	 String add= in.next();
		 	 System.out.println("Enter the balance of customer : ");
		 	 double blnc= in.nextDouble();
		 	 System.out.println("Enter the rate of interest : ");
		 	 double rte= in.nextDouble();
		 	 Account obj= new SavingsAccount(accNo,name, add, blnc, rte);
		 	 obj.calculateAmount();
		 	 System.out.println("Enter the amount of withdrawal in savings account : ");
		 	 double savings_withdrawal=in.nextDouble();
		 	 obj.withdraw(savings_withdrawal);

		 	 System.out.println("Enter the amount of deposit in savings account : ");
		 	 double savings_deposit=in.nextDouble();
		 	 obj.deposit(savings_deposit); //withdrawal
		 	 obj.display();
		 	break;
		 }
		 case "S":{
			 	System.out.println("\t *  SAVINGS ACCOUNT  *  ");
			 	System.out.println("Enter the account number : ");
			 	 int accNo= in.nextInt();
			 	 System.out.println("Enter the name of customer : ");
			 	 String name= in.next();
			 	 System.out.println("Enter the address of customer : ");
			 	 String add= in.next();
			 	 System.out.println("Enter the balance of customer : ");
			 	 double blnc= in.nextDouble();
			 	 System.out.println("Enter the rate of interest : ");
			 	 double rte= in.nextDouble();
			 	 Account obj= new SavingsAccount(accNo,name, add, blnc, rte);
			 	 obj.calculateAmount();
			 	 System.out.println("Enter the amount of withdrawal in savings account : ");
			 	 double savings_withdrawal=in.nextDouble();
			 	 obj.withdraw(savings_withdrawal);

			 	 System.out.println("Enter the amount of deposit in savings account : ");
			 	 double savings_deposit=in.nextDouble();
			 	 obj.deposit(savings_deposit); //withdrawal
			 	 obj.display();
			 	break;
			 }
		 case "c":{
		 	System.out.println("\t *  CURRENT ACCOUNT  *  ");
		 	System.out.println("Enter the account number : ");
		 	 int accNo= in.nextInt();
		 	 System.out.println("Enter the name of customer : ");
		 	 String name= in.next();
		 	 System.out.println("Enter the address of customer : ");
		 	 String add= in.next();
		 	 System.out.println("Enter the balance of customer : ");
		 	 double blnc= in.nextDouble();
		 	 System.out.println("Enter the overdraft limit : ");
		 	 double ovrlmt= in.nextDouble();
		 	 Account abc= new CurrentAccount(accNo,name, add, blnc, ovrlmt);
		 	 System.out.println("Enter the amount of withdrawal in current account : ");
		 	 double current_withdrawal=in.nextDouble();
		 	 abc.withdraw(current_withdrawal); //obj chilo
		 	 
		 	 System.out.println("Enter the amount of deposit in current account : ");
		 	 double current_deposit=in.nextDouble();
		 	 abc.deposit(current_deposit); //obj chilo aar withdrwal o
		 	 abc.display();
		 	break;
		 }
		 case "C":{
			 	System.out.println("\t *  CURRENT ACCOUNT  *  ");
			 	System.out.println("Enter the account number : ");
			 	 int accNo= in.nextInt();
			 	 System.out.println("Enter the name of customer : ");
			 	 String name= in.next();
			 	 System.out.println("Enter the address of customer : ");
			 	 String add= in.next();
			 	 System.out.println("Enter the balance of customer : ");
			 	 double blnc= in.nextDouble();
			 	 System.out.println("Enter the overdraft limit : ");
			 	 double ovrlmt= in.nextDouble();
			 	 Account abc= new CurrentAccount(accNo,name, add, blnc, ovrlmt);
			 	 System.out.println("Enter the amount of withdrawal in current account : ");
			 	 double current_withdrawal=in.nextDouble();
			 	 abc.withdraw(current_withdrawal); //obj chilo
			 	 
			 	 System.out.println("Enter the amount of deposit in current account : ");
			 	 double current_deposit=in.nextDouble();
			 	 abc.deposit(current_deposit); //obj chilo aar withdrwal o
			 	 abc.display();
			 	break;
			 }
		 default:{
		 	System.out.print("Wrong Choice!!!");
		 }
		 }
		 
		 in.close();
	 }
 }