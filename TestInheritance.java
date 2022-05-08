class Employee //super class
{
    void show()
    {
        System.out.println("I am an Employee");
    }
    
}

 

class RegularEmployee extends Employee //sub class
{
    void show()//Overriding show() of Employee
    {
        System.out.println("I am a Regular Employee");
        super.show(); //show() of Employee class
    }
    
}

 

class CasualEmployee extends Employee
{
    //left it for the students as self assessment
    void show()//Overriding show() of Employee
    {
        System.out.println("I am a Casual Employee");
    }
}

 

public class TestInheritance
{
    public static void main(String args[])
    {
        Employee emp; //object of the super class
        
        System.out.println("emp points to Employee instance");
        emp=new Employee();
        emp.show(); //show() of Emploee
        
        System.out.println("emp points to RegularEmployee instance");
        emp=new RegularEmployee(); //emp points to sub class instance
        emp.show();////show() of RegularEmploee
        
        System.out.println("emp points to CasualEmployee instance");
        emp=new CasualEmployee();//emp points to sub class instance
        emp.show();//show() of CalsualEmploee
    }
    
}
// Dynamic Method Dispatch
 