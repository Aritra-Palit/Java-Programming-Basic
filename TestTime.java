class Time
{
    private int hour, minute, second; //instance variable
    void getTime(int h, int m, int s)
    {
        hour=h;
        minute=m;
        second=s;
    }
    
    void showTime()
    {
        System.out.println(hour+":"+minute+":"+second);
    }
    
    Time addTime(Time a)
    {
        Time s=new Time();
        s.second=second+a.second;
        s.minute=minute+a.minute;
        s.hour=hour+a.hour;
        
        return s;
    }
}

 

public class TestTime
{
    public static void main(String args[])
    {
        Time t1,t2,t3;
        t1=new Time();
        t1.getTime(8, 32, 30);
        t1.showTime(); //t1 is the invoking object
        
        t2=new Time();
        t2.getTime(4,20,24);
        t2.showTime();//t2 is the invoking object
        
        t3=t1.addTime(t2); //t1 and t2 will be added and the result will be stored in t3
        t3.showTime();
        
    }
}