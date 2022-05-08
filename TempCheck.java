import java.util.Scanner;

class HotTempException extends Exception {

    String message;

    public HotTempException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

class ColdTempException extends Exception {

    String message;

    public ColdTempException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

public class TempCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.print("Enter the temperature in Celcius:- ");
        temp=sc.nextInt();
        try {
        	if (temp<8 || temp>40) {
        		if(temp<8)
        			throw new ColdTempException("Too Cold!!!");
        		else
        			throw new HotTempException("Too Hot!!!");
            }else {
            	System.out.println("Temperature Accepted.");
            	System.out.print("The temperature in Fahreinheit will be "+((temp*9/5)+32)+".");
            }
        } catch (HotTempException e) {
        	e.printStackTrace();
        } catch (ColdTempException e) {
        	e.printStackTrace();
        }
    }
}