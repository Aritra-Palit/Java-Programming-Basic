import java.util.Scanner;
class MotorVehicle {
    String modelName;
    String modelNumber;
    float modelPrice;

    void display() {
        System.out.println("Model name is:" + modelName);
        System.out.println("Model Number is: =" + modelNumber);
        System.out.println("Model Price is: = " + modelPrice);

    }
}
class Car extends MotorVehicle {
    int discountRate;
     float display(float discountRate){
        super.display();
        System.out.println("The discount rate is : " +discountRate);
        return discountRate;
    }
    void discount(float discountRate){
        float discount= modelPrice*discountRate/100;
        float priceafterdiscount=modelPrice-discount;
        System.out.println("The discount is:= "+priceafterdiscount );
    }
}
public class car_details{
	public static void main (String args[]) {
        Scanner scan=new Scanner(System.in);
        Car car= new Car();
        System.out.println("Please enter name of Car");
        car.modelName=scan.nextLine();
        System.out.println("Please enter model number");
        car.modelNumber= scan.nextLine();
        System.out.println("Please enter price");
        car.modelPrice=scan.nextFloat();
        System.out.println("Please enter discount rate");
        float discount_rate=scan.nextFloat();
        car.display(discount_rate);
        car.discount(discount_rate);
        scan.close();
    }
}