import java.util.Scanner;

public class Omnol_BB {
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n = 15;
        int arr[];
        arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<15;i++){
        	arr[i]=in.nextInt();
        }
        int smallest = arr[0];
        int largest = arr[0];
 
        for(int i=1; i< arr.length; i++)
            {
                if(arr[i] > largest)
                largest = arr[i];
                else if (arr[i] < smallest)
                smallest = arr[i];
            }

 System.out.println("Smallest Number is : " + smallest);
 System.out.println("Largest Number is : " + largest);
 }
}